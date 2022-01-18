package com.ingerencia.cl.hackernewapi.services;

import java.security.cert.CertificateException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import javax.annotation.PreDestroy;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class HackerNewClient, clase que genera cliente de Api.
 */
public class HackerNewClient {
	
	/** The retrofit. */
	private Retrofit retrofit;
	
	/** The ok http client. */
	private OkHttpClient okHttpClient;
	
	/** The read timeout. */
	private int readTimeout;
	
	/** The connection timeout. */
	private int connectionTimeout;
	
	/**
	 * Constructor.
	 *
	 * @param url the url
	 * @param readTimeout the read timeout
	 * @param connectionTimeout the connection timeout
	 */
	public HackerNewClient(String url, int readTimeout, int connectionTimeout){
		this.readTimeout = readTimeout;
		this.connectionTimeout = connectionTimeout;
		HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
		loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
		loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
		
		okHttpClient = getUnsafeOkHttpClient();
		retrofit = new Retrofit.Builder()
				.client(okHttpClient)
				.baseUrl(url)
				.addConverterFactory(GsonConverterFactory.create())
				.build();
	}
	
	/**
	 * Gets the unsafe ok http client.
	 *
	 * @return the unsafe ok http client
	 */
	public OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory, (X509TrustManager)trustAllCerts[0]);
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            OkHttpClient okHttpClient = builder.connectTimeout(this.connectionTimeout, TimeUnit.MILLISECONDS)
											            		.readTimeout(this.readTimeout, TimeUnit.MILLISECONDS)						
											            		.build();
            
            return okHttpClient;
        } catch (Exception e) {
            return null;
        }
    }
	
	/**
	 * Gets the rest apis services.
	 *
	 * @return the rest apis services
	 */
	public RestApisServices getRestApisServices(){
		return retrofit.create(RestApisServices.class);
	}
	/**
	 * Detroy.
	 */
	@PreDestroy
	public void detroy(){
		okHttpClient.connectionPool().evictAll();
		ExecutorService executorService = okHttpClient.dispatcher().executorService();
		executorService.shutdown();
		try {
		    executorService.awaitTermination(3, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			//ignore
		}
	}


}

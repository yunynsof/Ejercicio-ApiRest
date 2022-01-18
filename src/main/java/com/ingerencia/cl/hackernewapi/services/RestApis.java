package com.ingerencia.cl.hackernewapi.services;

import java.io.IOException;
import com.ingerencia.cl.hackernewapi.response.HackerNewApiResponse;

import retrofit2.Call;
import retrofit2.Response;

/**
 * The Class RestApis, esta clase inicializa el cliente del api y llama el metodo HTTP correcpondiente.
 */
public class RestApis {

	/** The client. */
	private HackerNewClient client;

	/**
	 * Instantiates a new rest apis.
	 *
	 * @param url the url
	 * @param readTimeout the read timeout
	 * @param connectionTimeout the connection timeout
	 */
	public RestApis(final String url, int readTimeout, int connectionTimeout) {
		client = new HackerNewClient(url, readTimeout, connectionTimeout);
	}

	/**
	 * Call hacker new api.
	 *
	 * @return the hacker new api response
	 * @throws ServiceResponseException the service response exception
	 */
	public HackerNewApiResponse callHackerNewApi() throws ServiceResponseException {

		Call<HackerNewApiResponse> call = client.getRestApisServices().getHackerNewApi();
		Response<HackerNewApiResponse> response;
		try {
			response = call.execute();

			if (response.isSuccessful()) {
				return response.body();
			} else {
				String message = new String(response.errorBody().bytes());
				throw new ServiceResponseException(message);
			}
		} catch (IOException e) {
			throw new ServiceResponseException(e);
		}
	}
}

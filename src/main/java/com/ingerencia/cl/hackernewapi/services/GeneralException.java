/**
 * 
 */
package com.ingerencia.cl.hackernewapi.services;

// TODO: Auto-generated Javadoc
/**
 * The Class GeneralException; clase utilizada como generica en caso de existir alguna excepcion.
 */
public class GeneralException extends Exception {

	/** Attribute that determine a Constant of serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** Attribute that determine codeStatus. */
	private final String codeStatus;
	
	/** Attribute that determine codeHttp. */
	private final String codeHttp;
	
	/** Attribute that determine statusData. */
	private final String statusData;
	
	/** Attribute that determine codeData. */
	private final String codeData;
	
	/** Attribute that determine descriptionData. */
	private final String descriptionData;


	/**
	 * Instantiates a new general exception.
	 *
	 * @param codeStatus the code status
	 * @param codeHttp the code http
	 * @param statusData the status data
	 * @param codeData the code data
	 * @param descriptionData the description data
	 * @param message the message
	 * @param cause the cause
	 */
	public GeneralException(String codeStatus, String codeHttp, String statusData, String codeData,
			String descriptionData, String message, Throwable cause) {
		super(message, cause);
		this.codeStatus = codeStatus;
		this.codeHttp = codeHttp;
		this.statusData = statusData;
		this.codeData = codeData;
		this.descriptionData = descriptionData;

	}

	/**
	 * Instantiates a new general exception.
	 *
	 * @param codeStatus the code status
	 * @param codeHttp the code http
	 * @param statusData the status data
	 * @param codeData the code data
	 * @param descriptionData the description data
	 * @param message the message
	 */
	public GeneralException(String codeStatus, String codeHttp, String statusData, String codeData,
			String descriptionData, String message) {
		super(message);
		this.codeStatus = codeStatus;
		this.codeHttp = codeHttp;
		this.statusData = statusData;
		this.codeData = codeData;
		this.descriptionData = descriptionData;
	}

	/**
	 * Gets the code status.
	 *
	 * @return the code status
	 */
	public final String getCodeStatus() {
		return codeStatus;
	}

	/**
	 * Gets the code http.
	 *
	 * @return the code http
	 */
	public final String getCodeHttp() {
		return codeHttp;
	}

	/**
	 * Gets the status data.
	 *
	 * @return the status data
	 */
	public final String getStatusData() {
		return statusData;
	}


	/**
	 * Gets the code data.
	 *
	 * @return the code data
	 */
	public String getCodeData() {
		return codeData;
	}


	/**
	 * Gets the description data.
	 *
	 * @return the description data
	 */
	public String getDescriptionData() {
		return descriptionData;
	}

}

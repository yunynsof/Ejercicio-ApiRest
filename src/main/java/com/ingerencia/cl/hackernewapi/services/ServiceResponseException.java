package com.ingerencia.cl.hackernewapi.services;

// TODO: Auto-generated Javadoc
/**
 * The Class ServiceResponseException.
 */
public class ServiceResponseException extends Exception{	
	/**
	 * Instantiates a new service response exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public ServiceResponseException(String message, Throwable cause, boolean enableSuppression,	boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new service response exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public ServiceResponseException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new service response exception.
	 *
	 * @param message the message
	 */
	public ServiceResponseException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new service response exception.
	 *
	 * @param cause the cause
	 */
	public ServiceResponseException(Throwable cause) {
		super(cause);
	}

}

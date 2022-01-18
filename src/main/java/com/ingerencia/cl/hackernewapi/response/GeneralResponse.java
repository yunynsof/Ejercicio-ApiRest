/**
 * 
 */
package com.ingerencia.cl.hackernewapi.response;

import com.google.gson.annotations.SerializedName;

// TODO: Auto-generated Javadoc
/**
 * The Class GeneralResponse.
 */
public class GeneralResponse {

	/** Attribute that determine uti. */	
    @SerializedName("uti")
	private String uti;
	
	/** Attribute that determine status. */
    @SerializedName("status")
	private String status;
	
	/** Attribute that determine code. */
    @SerializedName("code")
	private String code;
	
	/** Attribute that determine message. */
    @SerializedName("message")
	private String message;
	
	/**
	 * Gets the uti.
	 *
	 * @return the uti
	 */
	public String getUti() {
		return uti;
	}
	
	/**
	 * Sets the uti.
	 *
	 * @param uti the uti to set
	 */
	public void setUti(String uti) {
		this.uti = uti;
	}
	
	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Sets the status.
	 *
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * Sets the code.
	 *
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	
	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}

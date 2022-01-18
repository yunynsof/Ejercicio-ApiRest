/**
 * 
 */
package com.ingerencia.cl.hackernewapi.response;

import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class ResponseApi.
 */
public class ResponseApi {

	/** Attribute that determine generalResponse. */
	private GeneralResponse generalResponse;
	
	/** Attribute that determine vastrix. */
	private List<Hits> hits;

	/**
	 * Gets the general response.
	 *
	 * @return the general response
	 */
	public final GeneralResponse getGeneralResponse() {
		return generalResponse;
	}

	/**
	 * Sets the general response.
	 *
	 * @param generalResponse the new general response
	 */
	public final void setGeneralResponse(GeneralResponse generalResponse) {
		this.generalResponse = generalResponse;
	}

	/**
	 * Gets the hits.
	 *
	 * @return the hits
	 */
	public List<Hits> getHits() {
		return hits;
	}

	/**
	 * Sets the hits.
	 *
	 * @param list the new hits
	 */
	public void setHits(List<Hits> list) {
		this.hits = list;
	}


}

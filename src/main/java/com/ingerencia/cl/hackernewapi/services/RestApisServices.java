package com.ingerencia.cl.hackernewapi.services;

import com.ingerencia.cl.hackernewapi.response.HackerNewApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * The Interface RestApisServices, interface que aloja metodos HTTP.
 */
public interface RestApisServices {
	
	
	/**
	 * Gets the hacker new api.
	 *
	 * @return the hacker new api
	 */
	@GET("/api/v1/search_by_date?query=java")
	Call<HackerNewApiResponse> getHackerNewApi();
		
}

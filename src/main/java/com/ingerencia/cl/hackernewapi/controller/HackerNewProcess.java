package com.ingerencia.cl.hackernewapi.controller;

import java.util.Properties;
import java.util.UUID;
import com.ingerencia.cl.hackernewapi.constants.Constants;
import com.ingerencia.cl.hackernewapi.response.GeneralResponse;
import com.ingerencia.cl.hackernewapi.response.HackerNewApiResponse;
import com.ingerencia.cl.hackernewapi.response.ResponseApi;
import com.ingerencia.cl.hackernewapi.services.GeneralException;
import com.ingerencia.cl.hackernewapi.services.RestApis;
import com.ingerencia.cl.hackernewapi.services.ServiceResponseException;

import java.io.IOException;

/**
 * The Class HackerNewProcess; clase encargada de llamar el cliente de la Api Hacker New, y obtiene el objeto del response.
 */
public class HackerNewProcess {

	/** The respuesta api. */
	protected ResponseApi respuestaApi = new ResponseApi();

	/**
	 * Hacker new process; metodo encargado de llamar el metodo cliente y enviar el objeto respuesta final.
	 *
	 * @return the response api
	 */
	public ResponseApi hackerNewProcess() {
		ResponseApi response = null;
		String uti = UUID.randomUUID().toString();

		try {
			respuestaApi.setHits(getResponse().getHits());
			respuestaApi.setGeneralResponse(generateGeneralResponse(String.valueOf(Constants.CODE_SUCCESS),
					Constants.SUCCESS, Constants.SUCCESS, uti));
			response = respuestaApi;
		} catch (GeneralException e) {
			respuestaApi.setGeneralResponse(generateGeneralResponse(String.valueOf(Constants.CODE_ERROR),
					Constants.ERROR, Constants.ERROR, uti));
			response = respuestaApi;
		}

		return response;
	}

	/**
	 * Gets the response; metodo cliente del Api Hacker New, obtiene response del Api.
	 *
	 * @return the response
	 * @throws GeneralException the general exception
	 */
	public HackerNewApiResponse getResponse() throws GeneralException {
		HackerNewApiResponse hackerNewApiResponse = null;
		try {
			Properties prop = new Properties();
			prop.load(HackerNewProcess.class.getClassLoader().getResourceAsStream(Constants.CONFIG_FILE_NAME));
			RestApis rest = new RestApis(prop.getProperty(Constants.URL_API),
					Integer.parseInt(prop.getProperty(Constants.READ_TIMEOUT)),
					Integer.parseInt(prop.getProperty(Constants.CONNECTION_TIMEOUT)));
			hackerNewApiResponse = rest.callHackerNewApi();
		} catch (IOException | ServiceResponseException e) {
			throw new GeneralException(Constants.CODE_ERROR, Constants.CODE_ERROR, Constants.EMPTY, Constants.EMPTY,
					Constants.EMPTY, Constants.ERROR);
		}
		return hackerNewApiResponse;
	}

	/**
	 * Generate general response; Metodo que envia un codigo, mensaje, estatus e identificador unico de la transaccion.
	 *
	 * @param code the code
	 * @param message the message
	 * @param status the status
	 * @param uti the uti
	 * @return the general response
	 */
	public static GeneralResponse generateGeneralResponse(String code, String message, String status, String uti) {
		GeneralResponse gr = new GeneralResponse();
		gr.setCode(code);
		gr.setMessage(message);
		gr.setStatus(status);
		gr.setUti(uti);
		return gr;
	}

}

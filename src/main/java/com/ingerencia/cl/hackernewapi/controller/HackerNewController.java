package com.ingerencia.cl.hackernewapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ingerencia.cl.hackernewapi.response.ResponseApi;


/**
 * The Class HackerNewController; clase encargada del control Rest.
 */

@RestController
public class HackerNewController {

	/**
	 * Greeting test; metodo GET que expone los Item dentro de la lista Hist proveniente de la api Hacker New.
	 *
	 * @return the response api
	 */
	 @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
	 @GetMapping("/getItem/java")
	    public ResponseApi greetingTest() {
		 HackerNewProcess process = new HackerNewProcess();
			return process.hackerNewProcess();
	    }
}
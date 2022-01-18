package com.ingerencia.cl.hackernewapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * The Class HackerNewApiApplication.
 */
@SpringBootApplication
public class HackerNewApiApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(HackerNewApiApplication.class, args);
	}

	 /**
 	 * Gets the rest template.
 	 *
 	 * @return the rest template
 	 */
 	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
}

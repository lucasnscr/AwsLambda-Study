package com.function.sample.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.function.sample.model.ViaCepRequest;

public class GetViaCepHandler implements RequestHandler<ViaCepRequest, String> {
	
	private static final String URL = "https://viacep.com.br/ws/";

	@Override
	public String handleRequest(ViaCepRequest viaCep, Context context) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(URL + viaCep.getCep() +"/json/", String.class);
		if (response != null) {
			return response.getBody();
		}
		return null;
	}
}

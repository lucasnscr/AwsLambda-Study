package com.function.sample.function;

import java.util.function.Function;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.function.sample.model.ViaCepRequest;

@Component("viaCep")
public class ViaCep implements Function<ViaCepRequest, String>{
	
	private static final String URL = "https://viacep.com.br/ws/";

	@Override
	public String apply(ViaCepRequest viaCep) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(URL + viaCep.getCep() + "/json/", String.class);
		if (response != null) {
			return response.getBody();
		}
		return null;
	}
}

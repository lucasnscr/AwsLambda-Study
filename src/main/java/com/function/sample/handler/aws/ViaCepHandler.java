package com.function.sample.handler.aws;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.function.sample.model.ViaCepRequest;

public class ViaCepHandler extends SpringBootRequestHandler<ViaCepRequest, String> {
}
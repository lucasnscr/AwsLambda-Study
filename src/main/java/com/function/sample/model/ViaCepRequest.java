package com.function.sample.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ViaCepRequest {

    @JsonProperty("cep")
    private String cep;

    public ViaCepRequest() {}

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
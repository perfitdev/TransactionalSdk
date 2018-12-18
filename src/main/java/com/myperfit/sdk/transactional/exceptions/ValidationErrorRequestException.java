package com.myperfit.sdk.transactional.exceptions;

import org.json.simple.JSONObject;

import java.util.Map;

public class ValidationErrorRequestException extends RequestFailedException {


    public ValidationErrorRequestException(String responseApi) {
        super(responseApi);
    }

    public ValidationErrorRequestException(String s, String responseApi) {
        super(s, responseApi);
    }

    public ValidationErrorRequestException(String s, Throwable throwable, String responseApi) {
        super(s, throwable, responseApi);
    }

    public ValidationErrorRequestException(Throwable throwable, String responseApi) {
        super(throwable, responseApi);
    }

    public ValidationErrorRequestException(String s, Throwable throwable, boolean b, boolean b1, String responseApi) {
        super(s, throwable, b, b1, responseApi);
    }

    public Map<String, String> getValidationsError() {
        return (Map<String, String>) ((JSONObject) getResponseApiAsJsonObject().get("error")).get("errors");
    }
}

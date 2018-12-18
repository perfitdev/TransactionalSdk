package com.perfit.sdk.transactional.exceptions;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RequestFailedException extends Exception {
    private String responseApi;

    public RequestFailedException(String responseApi) {
        super();
        this.responseApi = responseApi;
    }

    public RequestFailedException(String s, String responseApi) {
        super(s);
        this.responseApi = responseApi;
    }

    public RequestFailedException(String s, Throwable throwable, String responseApi) {
        super(s, throwable);
        this.responseApi = responseApi;
    }

    public RequestFailedException(Throwable throwable, String responseApi) {
        super(throwable);
        this.responseApi = responseApi;
    }

    public RequestFailedException(String s, Throwable throwable, boolean b, boolean b1, String responseApi) {
        super(s, throwable, b, b1);
        this.responseApi = responseApi;
    }

    public String getResponseApiAsString() {
        return responseApi;
    }

    public JSONObject getResponseApiAsJsonObject() {
        return parseJson();
    }

    protected JSONObject parseJson() {
        if (responseApi == null) return null;
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(responseApi);
        } catch (ParseException e) {
            throw new SDKException(responseApi, e);
        }
        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;
    }
}

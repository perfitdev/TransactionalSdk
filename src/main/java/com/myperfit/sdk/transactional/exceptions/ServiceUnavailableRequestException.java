package com.myperfit.sdk.transactional.exceptions;

public class ServiceUnavailableRequestException extends RequestFailedException {

    public ServiceUnavailableRequestException(String responseApi) {
        super(responseApi);
    }

    public ServiceUnavailableRequestException(String s, String responseApi) {
        super(s, responseApi);
    }

    public ServiceUnavailableRequestException(String s, Throwable throwable, String responseApi) {
        super(s, throwable, responseApi);
    }

    public ServiceUnavailableRequestException(Throwable throwable, String responseApi) {
        super(throwable, responseApi);
    }

    public ServiceUnavailableRequestException(String s, Throwable throwable, boolean b, boolean b1, String responseApi) {
        super(s, throwable, b, b1, responseApi);
    }
}

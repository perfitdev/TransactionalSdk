package com.perfit.sdk.transactional.exceptions;

public class BadRequestRequestException extends RequestFailedException {
    public BadRequestRequestException(String responseApi) {
        super(responseApi);
    }

    public BadRequestRequestException(String s, String responseApi) {
        super(s, responseApi);
    }

    public BadRequestRequestException(String s, Throwable throwable, String responseApi) {
        super(s, throwable, responseApi);
    }

    public BadRequestRequestException(Throwable throwable, String responseApi) {
        super(throwable, responseApi);
    }

    public BadRequestRequestException(String s, Throwable throwable, boolean b, boolean b1, String responseApi) {
        super(s, throwable, b, b1, responseApi);
    }
}

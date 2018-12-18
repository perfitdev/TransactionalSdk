package com.myperfit.sdk.transactional.exceptions;

public class InternalServerErrorRequestException extends RequestFailedException {
    public InternalServerErrorRequestException(String responseApi) {
        super(responseApi);
    }

    public InternalServerErrorRequestException(String s, String responseApi) {
        super(s, responseApi);
    }

    public InternalServerErrorRequestException(String s, Throwable throwable, String responseApi) {
        super(s, throwable, responseApi);
    }

    public InternalServerErrorRequestException(Throwable throwable, String responseApi) {
        super(throwable, responseApi);
    }

    public InternalServerErrorRequestException(String s, Throwable throwable, boolean b, boolean b1, String responseApi) {
        super(s, throwable, b, b1, responseApi);
    }
}

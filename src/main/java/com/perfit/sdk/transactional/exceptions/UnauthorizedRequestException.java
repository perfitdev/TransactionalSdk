package com.perfit.sdk.transactional.exceptions;

public class UnauthorizedRequestException extends RequestFailedException {
    public UnauthorizedRequestException(String responseApi) {
        super(responseApi);
    }

    public UnauthorizedRequestException(String s, String responseApi) {
        super(s, responseApi);
    }

    public UnauthorizedRequestException(String s, Throwable throwable, String responseApi) {
        super(s, throwable, responseApi);
    }

    public UnauthorizedRequestException(Throwable throwable, String responseApi) {
        super(throwable, responseApi);
    }

    public UnauthorizedRequestException(String s, Throwable throwable, boolean b, boolean b1, String responseApi) {
        super(s, throwable, b, b1, responseApi);
    }
}

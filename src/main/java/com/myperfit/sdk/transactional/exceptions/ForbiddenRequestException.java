package com.myperfit.sdk.transactional.exceptions;

public class ForbiddenRequestException extends RequestFailedException {
    public ForbiddenRequestException(String responseApi) {
        super(responseApi);
    }

    public ForbiddenRequestException(String s, String responseApi) {
        super(s, responseApi);
    }

    public ForbiddenRequestException(String s, Throwable throwable, String responseApi) {
        super(s, throwable, responseApi);
    }

    public ForbiddenRequestException(Throwable throwable, String responseApi) {
        super(throwable, responseApi);
    }

    public ForbiddenRequestException(String s, Throwable throwable, boolean b, boolean b1, String responseApi) {
        super(s, throwable, b, b1, responseApi);
    }
}

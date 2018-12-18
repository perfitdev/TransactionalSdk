package com.myperfit.sdk.transactional.exceptions;

public class SDKException extends RuntimeException {
    public SDKException() {
    }

    public SDKException(String s) {
        super(s);
    }

    public SDKException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public SDKException(Throwable throwable) {
        super(throwable);
    }

    public SDKException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}

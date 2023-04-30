package com.academia.dio.domain.exception;

public class ErroRegraNegocioException extends RuntimeException {

    public ErroRegraNegocioException() {
        super();
    }

    public ErroRegraNegocioException(String msg) {
        super(msg);
    }
}

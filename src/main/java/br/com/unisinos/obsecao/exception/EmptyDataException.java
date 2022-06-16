package br.com.unisinos.obsecao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
public class EmptyDataException extends RuntimeException{

    public EmptyDataException(String message){
        super(message);
    }
}

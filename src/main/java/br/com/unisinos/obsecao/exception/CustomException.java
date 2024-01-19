package br.com.unisinos.obsecao.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomException extends RuntimeException{

  HttpStatus status;

  public CustomException(String message, HttpStatus status){
    super(message);
    this.status = status;
  }
}

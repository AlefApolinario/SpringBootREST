package br.com.erudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyFileSNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public MyFileSNotFoundException(String exception) {
		super(exception);
	}
	
	public MyFileSNotFoundException(String exception,Throwable cause) {
		super(exception,cause);
	}
	
}

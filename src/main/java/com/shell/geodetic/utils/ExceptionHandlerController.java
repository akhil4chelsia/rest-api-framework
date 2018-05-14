package com.shell.geodetic.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.shell.geodetic.exception.ValidationException;
import com.shell.geodetic.response.ErrorResonse;

@ControllerAdvice
public class ExceptionHandlerController {
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<ErrorResonse> handleValidationException(ValidationException ex) {
		
		StringWriter sw = new StringWriter();
		ex.printStackTrace(new PrintWriter(sw));
		String exceptionAsString = sw.toString();
		
		ErrorResonse response = new ErrorResonse(HttpStatus.BAD_REQUEST.value(),ex.getMessage(),exceptionAsString);
		return new ResponseEntity<ErrorResonse>(response, HttpStatus.BAD_REQUEST);
		
	}
}

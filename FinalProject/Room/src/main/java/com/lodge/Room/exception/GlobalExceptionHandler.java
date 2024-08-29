package com.lodge.Room.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

	@ControllerAdvice
	public class GlobalExceptionHandler {
		
		 @ExceptionHandler(Exception.class)
		    @ResponseBody
		    public ResponseEntity<String> handleException(Exception e) {
		        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		
	}


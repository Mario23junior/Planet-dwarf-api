package com.api.planetdwarf.controllerAdvice;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.api.planetdwarf.exception.ReturnErroExceptionMessage;

@RestControllerAdvice
public class ControllerAdviceCustomization {
   
	@ExceptionHandler(ReturnErroExceptionMessage.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ModelReturnErro ReturnErroExceptionMessage(ReturnErroExceptionMessage ex,WebRequest request) {
		ModelReturnErro message = new ModelReturnErro(
				HttpStatus.NOT_FOUND.value(),
				new Date(0),
				ex.getMessage(),
				request.getDescription(false));
				
				return message;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelReturnErro globalExcepErro(Exception ex, WebRequest request) {
		ModelReturnErro messageReturn = new ModelReturnErro(
				HttpStatus.INTERNAL_SERVER_ERROR.value(),
				new Date(), 
				ex.getMessage(), 
				request.getDescription(false));
		
		return messageReturn;
	}
}

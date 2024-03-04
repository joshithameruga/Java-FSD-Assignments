package com.hexaware.springrestexception.newexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
	//this global exception can handle in any controller 
	/*@ResponseStatus(value=HttpStatus.NOT_FOUND , reason = "some exception occured")
	@ExceptionHandler({ArithmeticException.class})
	public void handleExp() {
		
	}  */
	
	//@ResponseStatus(value=HttpStatus.NOT_FOUND , reason = "some exception occured")
	@ExceptionHandler({ArithmeticException.class})
	public ResponseEntity<String> handleExp(ArithmeticException e) {
		//return new ResponseEntity<String>("div by zero" , HttpStatus.NOT_FOUND);
		               //or
		return new ResponseEntity<String>(e.toString() , HttpStatus.NOT_FOUND);
	}
}

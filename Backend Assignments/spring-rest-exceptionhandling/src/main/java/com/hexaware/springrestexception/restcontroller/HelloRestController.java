package com.hexaware.springrestexception.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {
    
	@GetMapping("/div/{num1}/{num2}")
	public String divNumbers(@PathVariable int num1 ,@PathVariable int num2) {
		
		int result = num1/num2;
		return "div number is :" + result ;
	}
	
	//local exception .. canot use from dao or service untill we throw from them 
	/*@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED , reason="sorry you cant divide with zero")
	@ExceptionHandler({ArithmeticException.class})  //we can write other exceptions by separating with coma
	public void exceptionHandler() {
		System.out.println("exception executed");   //to check execution  
	}*/
	              //or
	/*
	//@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED , reason="sorry you cant divide with zero")  // we can use this also at a time
	@ExceptionHandler({ArithmeticException.class})
	public ResponseEntity<String> exceptionHandler() {
		System.out.println("exception executed");
		return new ResponseEntity<String>("cant div with zero",HttpStatus.BAD_REQUEST );//to check execution  
	}*/
}

package com.epam.lab4.exception;

public class IncorectNumberException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public IncorectNumberException(){
	}
	
	public IncorectNumberException(String string){
		super(string);
	}
}

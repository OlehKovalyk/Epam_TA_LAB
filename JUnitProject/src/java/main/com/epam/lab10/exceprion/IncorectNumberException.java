package com.epam.lab10.exceprion;

public class IncorectNumberException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public IncorectNumberException(){
	}
	
	public IncorectNumberException(String string){
		super(string);
	}
}

package com.cisc181.core;

public class PersonException extends Exception{
	
	Person person; //= new Person();
	
	public PersonException(String message){
		super(message);
	}

}

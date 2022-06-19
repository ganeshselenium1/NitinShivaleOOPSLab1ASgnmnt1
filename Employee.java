package com.nit.model;

public class Employee {
	private String firstName;
	private String lastName;
	
	public Employee(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public String getFname()
	{
		return firstName;
	}
	public String getLname()
	{
		return lastName;
	}

}

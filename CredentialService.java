package com.nit.service;

import java.util.Random;

import com.nit.model.Employee;

public class CredentialService {
	public String generateEmailAddress(Employee emp,String dept)
	{
		return emp.getFname().toLowerCase()+emp.getLname().toLowerCase()+"@"+dept+".abc.com";
	}
	
	public String generatePassword()
	{
		int len=8;
		String chars="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#&$%";
		Random rnd=new Random();
		StringBuilder sb=new StringBuilder(len);
		for(int i=0;i<len;i++)
		{
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		return sb.toString();
		
	}
	
	public void showCredentials(Employee emp, String email)
	{
		System.out.println("Dear "+emp.getFname()+" your generated credentials are as follows");
		//System.out.println("Email     --->"+generateEmailAddress(emp,email));
		System.out.println("Email --->"+email);
		System.out.println("Password  --->"+generatePassword());  
	}

}

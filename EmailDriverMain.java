package com.nit.main;

import java.util.Scanner;

import com.nit.model.Employee;
import com.nit.service.CredentialService;

public class EmailDriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		String dept="";
		String email="";
		Employee emp=new Employee("Nitin","Shivale");
		System.out.println("Please enter the departmnet from the following");
		System.out.println("1.Technical\n2.Admin\n3.Human Resource\n4.Legal");
		System.out.println("Enter your choice:");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:dept="technical";break;
		case 2:dept="admin";break;
		case 3:dept="hr";break;
		case 4:dept="legal";break;
		}

		CredentialService cs=new CredentialService();
		email=cs.generateEmailAddress(emp, dept);
		cs.showCredentials(emp,email);


	}

}

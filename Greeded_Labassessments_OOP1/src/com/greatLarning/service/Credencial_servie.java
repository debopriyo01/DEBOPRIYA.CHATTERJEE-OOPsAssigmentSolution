package com.greatLarning.service;
import com.greatLarning.model.Employee;

import java.util.Random;
import java.util.Scanner;
public class Credencial_servie {
	
	
	
private	String deparment=null;
	
	Scanner input=new Scanner(System.in);
	public void GenarateEmailAdress() {
		
		System.out.println("Enter your First name");
		String FirstName=input.next();
		
		System.out.println("Enter your Last name");
		String LastName=input.next();
		
		Employee name=new Employee(FirstName,LastName);	
		
		System.out.println("Dear "+name.getFirstName()+ " your generated credentials are as follows:- ");
		
		System.out.println("Email   ---> "+name.getFirstName().toLowerCase()+name.getLastName().toLowerCase()+"@"+deparment+".company.com");
				
	}
	
	static  char[] generatePassword(int length)
    {
        System.out.print("Password  --->"+" ");

        String CapitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String SmallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
                String symbols = "!@#$%^&*_=+-/.?<>)";
 
 
        String values = CapitalChars + SmallChars +
                        numbers + symbols;
 

        Random rndm_method = new Random();
 
        char[] password = new char[length];
 
        for (int i = 0; i < length; i++)
        {

           password[i] =
             values.charAt(rndm_method.nextInt(values.length()));
 
        }
        return password;
		
    }	
	
	
	public void showCredentials() {
		
		System.out.println("Plese Enter the department from the following:- \n"
				+ "1.Technical\n"
				+ "2.Admin\n"
				+ "3.Human Resorce\n"
				+ "4.Legal");
		
		
		int  choice=input.nextInt();
		
		if(choice==1) {
			deparment="Technical";
		}else if(choice==2){
			deparment="Admin";
		}else if(choice==3) {
			deparment="Human Resorce";
		}else {
			deparment="Legal";
		}
		
		GenarateEmailAdress();
		 
		 System.out.println(generatePassword(8));
		
		
		
		}
		
	}



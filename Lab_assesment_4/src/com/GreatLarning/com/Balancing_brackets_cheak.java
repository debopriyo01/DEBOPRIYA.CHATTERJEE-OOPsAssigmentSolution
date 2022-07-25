package com.GreatLarning.com;
import java.util.Scanner;
import java.util.Stack;
public class Balancing_brackets_cheak {

	/**
	 * Hear create a Boolean Type Method which will be returning The True value :-
	 * 
	 * @param args
	 */
        
	public static Boolean Balancingbracket(String Expretion) {
	    Stack<Character> stack=new Stack<>();
		for(int i=0;i<Expretion.length();i++) {
			
		char x=Expretion.charAt(i);
		
			// Hear if the Stack is Empty and if the condition matches  Then we will be push the Elements Into the Stack:-
		
		if(x=='('|| x=='{'|| x=='[') {
			
			stack.push(x);
		}
		// Check the stack is Empty or NOT :-
		if(stack.isEmpty()) {
			return false;
		}else {
			
			// Variable to check the pop values:-
			char cheak;
			switch(x) {
			
			case ')':
				cheak=stack.pop();
				if(cheak=='}' || cheak==']') {
					return false;
					}
				break;
			
			case '}':
				cheak=stack.pop();
				if(cheak==')' || cheak==']') {
					return false;
				}
				break;
			case ']':
				cheak=stack.pop();
				if(cheak==')'|| cheak=='}') {
					return false;
				}
				break;
			}
			
		}
	}
		return (stack.empty());	
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input Expretion hear ");
		
		String inputExpretion=sc.next();

		boolean result;
		
		result=Balancing_brackets_cheak.Balancingbracket(inputExpretion);
		if(result) {
			
			System.out.println("Your String  Contains The Balanceing Brackets ");
			
		}else {
			System.out.println("Your String is Not Contains Any Balancing Brackets ");
			
		}
		
	}
}



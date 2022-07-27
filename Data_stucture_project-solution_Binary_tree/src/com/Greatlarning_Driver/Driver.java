package com.Greatlarning_Driver;

import Implemetetion_of_Bianry_tree.Simple_Bst_cretion;

import java.util.Scanner;
public class Driver extends Simple_Bst_cretion {

	public static void main(String[] args)throws Exception{
		
		Scanner input=new Scanner(System.in);
		Node root=null;
		Node result=null;

		int Transection=0;
		int i=0;
		
		System.out.println("Enter the total Number Of Transection That you want to make :-");
		int size=input.nextInt();
		
		while(i<size) {
			
			System.out.println(String.format("Enter the %d transection",(i+1)));
			Transection=input.nextInt();
			
			if(root==null) {
				
				root=InsertNode(root,Transection);
			}else {
				result=InsertNode(root,Transection);
			}
			System.out.println("The Transactions are :- " );
			
			i++;
		}
		
		

	}

	
	}

	



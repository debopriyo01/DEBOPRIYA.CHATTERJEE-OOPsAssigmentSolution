package com.GreatLarning.com;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class BstFindPair {
	
	/** 
	 * hear we will be creating a simple Bst:-
	 * 
	 * @param args
	 */
	static int value;
	 static Scanner input=new Scanner(System.in);


	  static class Node {
	      int key;
	      Node left;
	      Node Right;
	  }

	  static  Node NewNode(int data){

	      Node temp=new Node();

	      temp.key=data;
	      temp.left=null;
	      temp.Right=null;
	      return  temp;
	  }

	public static Node inserNode(Node root,int key){
	      // creat a Node newNode hear which will be the R.F of the Node:-

	    Node newNode=NewNode(key);

	    Node x=root;
	    int parant;
	    Node current_parant=null;

	    while(x!=null) {

	        current_parant = x;// value transfered to current_parant :-
	       
	         if (key < x.key) {

	            x = x.left;
	          
	        } else if (key > x.key) {

	            x = x.Right;
	            
	        } else {

	            System.out.println("The dublicate value inserted ");
	            return newNode;
	        }
	    }

	        // now hear with the sdame way the Node needs to be inserted inside of the Current_parrent :-

	        if(current_parant==null){

	            current_parant=newNode;
	        }else if(key<current_parant.key){

	            current_parant.left=newNode;
	        }else {
	          current_parant.Right=newNode;

	        }
	        return current_parant;
	    }


	
public  static void Inorder(Node root) {
	
	if(root==null) {
		return;
	}else {
		
		Inorder(root.left);
		System.out.print(root.key+ " ");
		Inorder(root.Right);
	}
}

public static void FindPairofGivenSum(Node root,int sum) {
	
	Set<Integer> set=new HashSet<>();
	
	if(!FindPair(root,sum,set)) {
		
		System.out.println("pair not Found");
	}
	
}

public static boolean FindPair(Node root,int sum,Set<Integer> set) {
	
	if(root==null) {
		
		return false;
	}
	if(FindPair(root.left,sum,set)) {
		
		return true;
	}
	
	if(set.contains(sum-root.key)) {
		
		System.out.println("The pair found ( "+(sum-root.key)+ ","+root.key+")");
		return true;
	}else {
		
		set.add(root.key);
	}
	
	return FindPair(root.Right,sum,set);
}

public static void main(String[] args) {
		
           Node root=null;
           Node result=null;
            
           boolean status=true;
          
           while(status==true) {
        	   
        	   System.out.println("Enter The elements one By one ");
        	   
        	   value=input.nextInt();
        	   
        	   if(root==null) {
        		   
        		   root=inserNode(root,value);
        	   }else {
        		   
        		   result=inserNode(root,value);
        	   }
        	   
        	   System.out.println("Do you want to continew __ press any key or Press 0 to stop");
        	   
        	    int Ans=input.nextInt();
        	   
        	   if(Ans==0) {
        		   status=false;
        		   System.out.println("Inorder Binary tree is  ");
        		   Inorder(root); 
        		   
        	   }
        	   
           }
           BstFindPair sc=new BstFindPair();
           
           int sum=130;
           sc.FindPairofGivenSum(root,sum);
           input.close();
           
          System.out.println("Proggram completed succsess fully");
	}
 
}

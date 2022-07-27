package Implemetetion_of_Bianry_tree;
import com.Greatlarning_Driver.*;


import java.util.Scanner;
public class Simple_Bst_cretion {

	/**
	 * Hear we will be Implementing The BST :-
	 */
	
	static int value;
	static Scanner input=new Scanner(System.in);
	
	/**
	 * BST Nodes :-
	 */
	public static class Node{
		
		int key;
		Node left;
		Node Right;
	}
	/**
	 * Temporary  Node :-
	 */
	
	public static Node NewNode(int data) {
		
		Node temp=new Node();
		temp.key=data;
		temp.left=null;
		temp.Right=null;
		return temp;
		
	}
	/**
	 * Insertion Of the new Root:-
	 */
	public static Node InsertNode(Node root,int key) {
		
		Node newNode=NewNode(key);
		
		Node x=root;
		Node Current_Node=null;
		
		while(x!=null) {
			x=Current_Node;
			
			if(key<x.key) {
				
				x=x.left;
			}else if(key>x.key) {
				
				x=x.Right;
			}else {
				System.out.println("Dublicate Values !______");
			
				return newNode;
			}
		}
		Current_Node=newNode;
		
		if(Current_Node==null) {
			
			Current_Node=newNode;
		}else if(key<Current_Node.key) {
			
			Current_Node.left=newNode;
		}else {
			
			Current_Node.Right=newNode;
		}
		return  Current_Node;
	}
public static void  InorderTravershal(Node root) {
		
		if(root==null) {
			return;
		}else {
			
			InorderTravershal(root.left);
			System.out.print(root.key + " ");
			InorderTravershal(root.Right);
		}
		
	
}
}

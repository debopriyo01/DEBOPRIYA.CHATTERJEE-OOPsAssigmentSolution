package com.Greatlarning.com;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Total number of currency Denominetions :-");
		
		int NoOfCureencyDenominetions=input.nextInt();
		
		int Denominetions[]=new int[NoOfCureencyDenominetions];
		
		System.out.println("Enter The Amount Of The Currency Denominetions :-");

		for(int i=0;i<Denominetions.length;i++) {
			
			Denominetions[i]=input.nextInt();
		}
		
		System.out.println("Enter the Amount That you want to pay :-");
		int Amount=input.nextInt();
		
	   System.out.println("The values of the curreency Denominetions are:- ");
	   
	   for(int i:Denominetions) {
		   
		   System.out.println(i + " ");
	   }
	   
	   marge_sort_Calculetion obj=new marge_sort_Calculetion();
	   
	   obj.MargeSort(Denominetions, 0,Denominetions.length-1 );
	   
	   obj.DisplayDenominetions(Denominetions,Denominetions.length-1);
	   
	   NoteCounter.NoofDenominetions(Denominetions, Amount);
	   
		}
		
		
		
	}


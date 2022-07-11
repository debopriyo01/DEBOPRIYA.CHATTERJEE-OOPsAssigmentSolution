package com.Greatlarning.com;

public class NoteCounter {

	public static void NoofDenominetions(int DenominetiomsValue[],int Amount) {
		
		// Hear we will be taking a separate array "NotesCounter" for calculating the how many required amount of notes
		// That we are giving :-
		
		int NoteConter[]=new int[DenominetiomsValue.length];
		
		for(int i=0;i<DenominetiomsValue.length;i++) {
			
			if(Amount>=DenominetiomsValue[i]) {
				
				NoteConter[i]=Amount/DenominetiomsValue[i];
				
				Amount=Amount-DenominetiomsValue[i]*NoteConter[i];
			}
		}
		
		// if Still The Amount which  is Greater Then we will say :-
		
		if(Amount>0) 
		{	
			System.out.println("the Exact amount Can Not be given via the Nots ");
		}
		else 
		{
			System.out.println("Your Payment Approch In order to give the maximum number of notes :- ");
			for(int i=0;i<NoteConter.length;i++) {
				
				if(NoteConter[i]!=0) {
				System.out.println(DenominetiomsValue[i] + ":"+ NoteConter[i]);
				}
			}
		}
	}
}

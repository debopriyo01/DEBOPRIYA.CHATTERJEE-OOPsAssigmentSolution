package lab_season_3_com.greatlarning.com;
import java.util.Scanner;
public class Driver{
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the total Number of Transections That You want to make ");
        
		int size=input.nextInt();
		
		int Transection[]=new int[size];
		System.out.println("Enter your Daily Transection :-");
		for(int i=0;i<Transection.length;i++) {
			
			System.out.println("Enter Your  Transection of Day" +(i+1));
			 Transection[i]=input.nextInt();
		}
		System.out.println("Your OverAll Transections Are like This :-");
		
		UserInput(Transection);
		System.out.println("Enter the Targeted Amount hear :-");
		int TargetedAmount=input.nextInt();
		
		PayMoneyMain obj=new PayMoneyMain();
	int NumberOfDays=obj.NoOFDay(Transection, TargetedAmount);
	
	if(NumberOfDays==-1) {
		
		System.out.println("Sorry! The Target amount is Not achived");
	}else {
		
		System.out.println("Congrats! The "+ TargetedAmount+" Amount  Has been Achived in " +NumberOfDays);
	}
	
	}
	
	public static void  UserInput(int Transection[]) {
		
		System.out.println("YouR Total Transections are :-");
		for(int i=0;i<Transection.length;i++) {
			
			System.out.print(Transection[i]+ " ");
		}
		System.out.println();
		
	}

}

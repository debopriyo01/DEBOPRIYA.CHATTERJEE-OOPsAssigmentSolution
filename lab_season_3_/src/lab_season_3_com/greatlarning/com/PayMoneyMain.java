package lab_season_3_com.greatlarning.com;

// ,hear we will only applying the buisness logic :-
public class PayMoneyMain {
	
	 
	public  int NoOFDay(int Transection[],int TargetAmount) {
		
		for(int i=0;i<Transection.length;i++) {
		if(TargetAmount==Transection[i]||TargetAmount<Transection[i]) {
			
			return i+1;
		}else {
			
			TargetAmount=TargetAmount-Transection[i];
			
		}
	  }
		return -1;
   }

	
}

	
	



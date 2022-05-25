package inheritence;

class Animal{
	
	public void speak() {
		
		
   System.out.println("The Animals can speak");
	}
	
	public void dogSpeak() {
		
		System.out.println("the speaking language of the dog is:- ");
	}
	
}

 class Dog extends Animal{
	
	
	
	public void behaviar() {
		
		System.out.println("The dog can bark");
	}
}










public class inheritence_chapter_10_ {

	public static void main(String[] args) {
		
                 // lets creat some objects now :-
		 
		Dog DogSound=new Dog();
		System.out.println("After inharite the methods from the class Animal is ");
		DogSound.speak();
		DogSound.dogSpeak();
		DogSound.behaviar();
			
		
		
	}

}

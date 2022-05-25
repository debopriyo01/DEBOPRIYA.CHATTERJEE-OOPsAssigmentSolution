package inheritence;

class parent{
	
	protected void methodeP() {
		
		System.out.println("This is a parent class");
	}
	
}

class child extends parent{
	
	protected void methodeC() {
		
		System.out.println("this is a child class");
	}
}

public class inheritence_question_2_ {

	public static void main(String[] args) {
		
		// lets creat the object of each parent and child class:_
		
		parent nameParent=new parent();
		
           nameParent.methodeP();
           
           child nameChild=new child();
           nameChild.methodeC();
           nameChild.methodeP();
	}

}

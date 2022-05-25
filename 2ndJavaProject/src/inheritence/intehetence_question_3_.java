package inheritence;
/**
 * Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
 * @author user
 *
 */

class member{
	// hear are all the data members:-
	String name;
	int age;
	String PhoneNum;
	String Adress;
	double sallery;
	
	
	public double PrintSallery() {
		
		return sallery;
	}
	
}

class Employee extends member{
	
	String speciligetion;
	String Department;
	
	public  void setMethods(String speciligetion,String Department) {
		
		this.speciligetion=speciligetion;
		this.Department=Department;
	}
	
	public String getSpeciligetion() {
		return speciligetion;
	}
	public String getDepartment() {
		
		return Department;
	}
	
}
class maneger extends member{
	String speciligetion;
	String Department;
	
public  void setMethods(String speciligetion,String Department) {
		
		this.speciligetion=speciligetion;
		this.Department=Department;
	}
	
	public String getSpeciligetion() {
		return speciligetion;
	}
	public String getDepartment() {
		
		return Department;
	}
	
}


public class intehetence_question_3_ {
	
	public static void main(String []args) {
		
		Employee Data_Details=new Employee();
		
		Data_Details.name="Debopriyo chatterjee";
		Data_Details.PhoneNum="8637515181";
		Data_Details.age=24;
		Data_Details.Adress="kulti collage road(near kulti collage";
        Data_Details.sallery=18542.254;
        Data_Details.setMethods("Mechanical Engeeniarring","Boiler Operetor");
        
		
		System.out.println("The name of the Employee is "+Data_Details.name);
		System.out.println("The phone number of the Employee is "+Data_Details.PhoneNum);
		System.out.println("the age of the employee is "+Data_Details.age);
		System.out.println("the Adress of the Employee is "+Data_Details.Adress);
		System.out.println("the address of the Employee is "+Data_Details.PrintSallery());
		System.out.println("The Spesiligetion  of the Employee is "+Data_Details.getSpeciligetion());
		System.out.println("the Department of the the Employee is "+Data_Details.getDepartment());
		
		
 maneger Data_DetailsM=new maneger();
		
		Data_DetailsM.name="Avirup chakraborty";
		Data_DetailsM.PhoneNum="9476321927";
		Data_DetailsM.age=55;
		Data_DetailsM.Adress="Sodpur pally lal kella vaban";
        Data_DetailsM.sallery=19555.23;
        Data_DetailsM.setMethods("Electrical Engineer ","Electrical Operetor");
        
		System.out.println();
		System.out.println("The name of the maneger is "+Data_DetailsM.name);
		System.out.println("The phone number of the maneger is "+Data_DetailsM.PhoneNum);
		System.out.println("the age of the maneger is "+Data_DetailsM.age);
		System.out.println("the Adress of the maneger is "+Data_DetailsM.Adress);
		System.out.println("the address of the maneger is "+Data_DetailsM.PrintSallery());
		System.out.println("The Spesiligetion  of the maneger is "+Data_DetailsM.getSpeciligetion());
		System.out.println("the Department of the the maneger is "+Data_DetailsM.getDepartment());
		
		
	}

}

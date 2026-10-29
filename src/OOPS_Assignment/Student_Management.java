package OOPS_Assignment;

public class Student_Management {
	
	String name;
	int age;
	
	Student_Management(String name){
		
		this.name=name;
		
	}
	
	Student_Management(String name, int age){
		
		this.name=name;
		this.age=age;
		
	}
	
	
	void displayDetail() {
		System.out.println(name);
		
	}
	void displayDetails() {
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		Student_Management obj= new Student_Management("akash");
		
		Student_Management obj1= new Student_Management("Divakar",20);
		obj.displayDetail();
		obj1.displayDetails();
		
	}

}

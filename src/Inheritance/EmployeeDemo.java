package Inheritance;


class Employee{
	String name;
	double salary;
	
	
	Employee(String name,double salary){
		
		this.name=name;
		this.salary=salary;	
	}
	
	void displayDetails() {
		System.out.println(name);
		System.out.println(salary);
	}
	
	
	
}

class Tester extends Employee{
	String testingTool;
	Tester(String name,double salary,String testingTool){
		super(name,salary);
		
		this.testingTool=testingTool;
	}
	
	
	void displayTester() {
	
	displayDetails();
	System.out.println(testingTool);
	
	}
	
	
	
	
}

class Developer extends Employee{
	
	String programmingLanguage;
	
	Developer(String name,double salary,String programmingLanguage){
		super(name,salary);
		
		this.programmingLanguage=programmingLanguage;
	}
	
	
	void displayDesigner() {
		displayDetails();
		
		System.out.println(programmingLanguage);
	}
	
}




public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		Developer d=new Developer("akash",30000,"java");
		
		Tester t=new Tester("divakar",25000,"selenium");
		
		
		d.displayDesigner();
		t.displayTester();
		
		
	}

}

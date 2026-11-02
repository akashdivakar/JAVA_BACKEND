package OOPS_Assignment;

public class EmployeeResponsibility {
	
	
	
	String name;
	
	int id;
	
	
	EmployeeResponsibility(String name,int id){
		
		this.name=name;
		this.id=id;
		
	}
	
	void displayDetails() {
		System.out.println(name);
		System.out.println(id);
	}
	
	
	void responsibility() {
		System.out.println("general employee res");
	}
	


	
	public static void main(String[] args) {
		IT d=new IT("Akash",10);
		
		HR m=new HR("divakar",15);
		
		d.displayDetails();
		d.responsibility();
		
		m.displayDetails();
		m.responsibility();
		
		
	}

}

class IT extends EmployeeResponsibility{
	
	IT(String name,int id){
		super(name,id);
		
	}
	
	void responsibility() {
		System.out.println("Developer");
	}
	
}

class HR extends EmployeeResponsibility{
	
	HR(String name,int id){
		super(name,id);
		
	}
	
	void responsibility() {
		System.out.println("manager");
		
	}
	
}


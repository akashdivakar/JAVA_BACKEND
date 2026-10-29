package Constructor_Assignment;

 class Employee {
	
	int employeeId;
	String employeeName;
	int salary;
	
	Employee(int employee,String employeeName,int salary){
		this.employeeId=employee;
		this.employeeName=employeeName;
		this.salary=salary;
	}
	
	double calculateAnnualSalary() {
		return salary*12;
	}
	
	void displayDetails() {
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(salary);
		System.out.println(calculateAnnualSalary());
	}
	
	
	
	
	
public static void main(String[] args) {
	
	Employee obj=new Employee(101,"Arun",25000);
	Employee obj1=new Employee(102,"Divya",35000);
	Employee obj2=new Employee(103,"Kumar",40000);
	
	obj.displayDetails();
	obj1.displayDetails();
	obj2.displayDetails();
	
	
}
}

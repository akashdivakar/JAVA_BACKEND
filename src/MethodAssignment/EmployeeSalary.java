package MethodAssignment;

public class EmployeeSalary {
	
	public int calculateSalary(int basic_salary ,int allowance) {
		int gross=basic_salary+allowance;
		
	return 	gross;
	}
	
	public int calculateNetSalary(int gross,int deductions) {
		int net=gross-deductions;
		
		return net;
	}
	
	public void displayDetails(String name,int gross,int net ){
		System.out.println(name+gross+net);
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSalary obj=new EmployeeSalary();
int gross=obj.calculateSalary(25000,5000);
int net=obj.calculateNetSalary(gross,2000);

obj.displayDetails("akash",gross,net);
	}

}

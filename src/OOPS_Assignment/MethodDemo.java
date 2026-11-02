package OOPS_Assignment;


class Calculator{
	
	int add(int a,int b) {
		return a+b;
	}
	
	double add(double a, double b) {
		return a+b;
	}
}
class Employee{
	void claculateBonus() {
		System.out.println("1000");
	}
}

class Developer extends Employee{
	void calculateBonus() {
		System.out.println("5000");
	}
}

class Manager extends Employee{
	void calculateBonus() {
		System.out.println("10000");
		
	}
}

public class MethodDemo {
	
	public static void main(String[] args) {
		
		Calculator obj=new Calculator();
		
		System.out.println(obj.add(10, 5));
		System.out.println(obj.add(15, 5));
		
		Developer obj1=new Developer();
		Manager obj2=new Manager();
		
		obj1.calculateBonus();
		
		obj2.calculateBonus();
		
		
		
	}

}

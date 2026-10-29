package Constructor_Assignment;

public class Student {
int studentId;
String studentName;
String course;


void displayDetails() {
	System.out.println(studentId);
	System.out.println(studentName);
	System.out.println(course);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		
		obj.displayDetails();
		

	}

}

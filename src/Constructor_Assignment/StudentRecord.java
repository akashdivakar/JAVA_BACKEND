package Constructor_Assignment;

public class StudentRecord {
	
	int rollNumber;
	String studentName;
	int marks;
	StudentRecord(int rollNumber,String studentName,int marks){
		 this.rollNumber=rollNumber;
		 this.studentName=studentName;
		 this.marks=marks;
		 
		 
		
	}
	
	StudentRecord(StudentRecord s ){
		
		this.rollNumber=s.rollNumber;
		this.studentName=s.studentName;
		this.marks=s.marks;
	}
	
	void displayDetails() {
		System.out.println(rollNumber);
		System.out.println(studentName);
		System.out.println(marks);
	}
	
	public static void main(String[] args) {
		StudentRecord s=new StudentRecord(1,"akash",85);
		StudentRecord s1=new StudentRecord(s);
		s.displayDetails();
		s1.marks=90;
		s1.displayDetails();
		
		
		
		
	}

}

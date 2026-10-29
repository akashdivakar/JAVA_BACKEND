package MethodAssignment;

public class StudentResult {
public	int calculateTotal(int first,int second,int third,int fourth,int fifth){
	int sum=first+second+third+fourth+fifth;
	
	return sum;
	}
	
	public double calculateAverage(int total){
		double avg=total/5.0;
		return avg;
		
	}
	
	public  String calculateGrade(double average){
		
		if(average>=90) {
			return "A";
		}else if(average>=75) {
			return "B";
		}else if(average>=50) {
			return"C";
		}else {
			return "fail";
		}
		
	}
	
	public void display(int total,double average,String grade) {
		System.out.println(total);
		System.out.println(average);
		System.out.println(grade);
		
	}
	
	public static void main(String[] args) {
		
		StudentResult obj=new StudentResult();
		
		int total=obj.calculateTotal(85, 78, 92, 88, 77);
		double avg=obj.calculateAverage( total);
		String grade=obj.calculateGrade(avg);
		obj.display(total, avg, grade);
		
		
		
		
		
	}

}

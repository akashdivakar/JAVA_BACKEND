package MethodAssignment;

public class ElectricityBill {
	
	int calculateBill(int units){
		
		if(units<100) {
			int bill=units*2;
			
			return bill;
			
		}else if(units<200) {
			
			int bill=(100*2)+(units-100)*3;
			return bill; 
		}
		else {
			int bill=(100*2)+(100*3)+(units-200)*5;
			return bill;
		}
		
	}
	
	
	int addFixedCharge(int bill) {
		
		int charges=bill+50;
		
		return charges;
		
	}
	
	void display(int final_bill) {
		System.out.println(final_bill);
	}
	public static void main(String[] args) {
		ElectricityBill obj=new ElectricityBill();
		int bill =obj.calculateBill(250);
		int charges =obj.addFixedCharge(bill);
		obj.display(charges);
	}

}



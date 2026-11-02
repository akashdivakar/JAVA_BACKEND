package OOPS_Assignment;

abstract class PaymentDemo {
	
	
	abstract void processPayment();

}


class UPIPayment extends PaymentDemo {
	
	void processPayment() {
		System.out.println("processing UPI payment");
		
	}
	
}

class CreditCardPayment extends PaymentDemo{
	
	void processPayment() {
		System.out.println("processing credit card Payment");
		
	}
}


class Payment{
	
	public static void main(String[] args) {
		PaymentDemo p;
		
		p=new UPIPayment();
		
		p.processPayment();
		
		p=new CreditCardPayment();
		
		
		
		
		p.processPayment();
	}
	
}
package Constructor_Assignment;

public class BankAccount {
	int accountNumber;
	String holderName;
	double balance;
	
	BankAccount(){
		
		accountNumber=1001;
		holderName="priya";
		balance=5000.0;
		
	}
	
	void displayAccount() {
		
		System.out.println(accountNumber);
		System.out.println(holderName);
		System.out.println(balance);
		
	}
	
	public static void main(String[] args) {
		BankAccount obj=new BankAccount();
		BankAccount obj1=new BankAccount();
		
		obj.displayAccount();
		obj1.displayAccount();
	}

}

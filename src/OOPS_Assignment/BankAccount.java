package OOPS_Assignment;

public class BankAccount {
	
	
	private String accountHolder;
	private double balance;
	
	
	BankAccount(String accountHolder,double balance){
		
		this.accountHolder=accountHolder;
		this.balance=balance;
		
	}
	
	String getAccountholder() {
		return accountHolder;
	}
	
	double getbalance() {
		return balance;
	}
	
	void withdraw(double amount) {
		
		if(amount >0 && amount <=balance ) {
			
			balance=balance-amount;
			
			System.out.println("withdraw successful");
			
		}else {
			System.out.println("Insufficient balance");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		BankAccount b=new BankAccount("Akash",10000);
		
		System.out.println(b.getAccountholder());
		
		System.out.println(b.getbalance());
		
		b.withdraw(5000);
		
		System.out.println(b.getbalance());
		
		
		
		
		
	}

}

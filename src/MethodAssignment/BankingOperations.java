package MethodAssignment;

public class BankingOperations {
	
	int deposit(int curr_bal,int depo_amount) {
		
		int updated_bal=curr_bal+depo_amount;
		
		return updated_bal;
		
	}
	
	void withdraw(int curr_bal,int withdrawal_amount) {
		if(curr_bal<withdrawal_amount) {
			
			System.out.println("the fund is insufficient");
		}
	}
	
	void checkBalance(int curr_bal) {
		System.out.println(curr_bal);
	}
	
	void displayTransactionSummary(int depo_amount,int withdrawal_amount,int curr_bal){
		System.out.println(depo_amount);
		System.out.println(withdrawal_amount);
		 int final_bal=curr_bal-withdrawal_amount;
		System.out.println(final_bal);
	}
		
	
public static void main(String[] args) {
	
	BankingOperations obj=new BankingOperations();
	int curr_bal=obj.deposit(5000, 2000);
	obj.withdraw(curr_bal, 1500);
	obj.checkBalance(curr_bal);
	obj.displayTransactionSummary(2000,1500,curr_bal);
	
	
}
}

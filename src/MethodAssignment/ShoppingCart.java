package MethodAssignment;

public class ShoppingCart {
	
	int calculateTotal(int first ,int second ,int third){
		int total=first+second+third;
		return total;
		
	}
	
	int calculateDiscount(int total ,String membership) {
		
		if(membership.equals("Gold")) {
			
			int discount=total*20/100;
			return discount;
		}else if(membership.equals("Silver")) {
			int discount=total*10/100;
			return discount;
		}else {
			
			int discount=total*5/100;
			return discount;
			
		}
		
		
	
	}
	
	void calculateFinalAmount(int total,int discount) {
		
		
		System.out.println(total);
		System.out.println(discount);
		
		int amount=total-discount;
		System.out.println(amount);
		
		
		
	}
	
	public static void main(String[] args) {
		ShoppingCart obj=new ShoppingCart();
		
		int total=obj.calculateTotal(2000,1500 ,500 );
		int discount=obj.calculateDiscount(total,"Gold");
		obj.calculateFinalAmount(total,discount);
	}

}

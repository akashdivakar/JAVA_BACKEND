package Constructor_Assignment;

public class product {
	
	
	int productId;
	String productName;
	int price;
	
	product(){
		productId=1;
		productName="akash";
		price=10000;	
	}
	
	product(int productId,String productName){
		
		this.productId=productId;
		this.productName=productName;
		price=15000;
		
		
		
	}
	
	product(int productId, String productName,int price){
		
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		
	}
	
	void displayDetails() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
	}
	
	
	
	
public static void main(String[] args) {
	
	product obj=new product();
	
	product obj1=new product(2,"divakar",20000);
	
	product obj2=new product(3,"ramesh",30000);
	
	obj.displayDetails();
	obj1.displayDetails();
	obj2.displayDetails();	
}
}




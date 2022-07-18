package javaExamples;

//enum
enum products{
	BREAD(50), MILK(25), APPLE(25), YIPHEE(12);   
	 //Encapsulation
	private int price;  
	private products(int price){  
	this.price = price;  
	}
	public int getPrice() {
		return price;
	}
}

class Employee{
	//Static - initialized only once and given class scope
	static int totalPrice = 0;
	
	void CalculateTotalPrice(int price)
	{	  
		totalPrice = totalPrice + price;
	}
	void bill()
	{
		//final -  fixed value and given method scope
		final int discountPercent = 10 ;
		int billAmount = totalPrice - totalPrice * discountPercent/100 ;
		
		System.out.println("Total bill amount : "+billAmount);
	}
}
public class Customer {

	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		
		products item1 = products.BREAD;  
		products item2 = products.APPLE;
		
		emp1.CalculateTotalPrice(item1.getPrice());
		emp1.CalculateTotalPrice(item2.getPrice());
		emp1.bill();
	}
}

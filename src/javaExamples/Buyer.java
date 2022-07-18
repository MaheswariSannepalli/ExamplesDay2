package javaExamples;
//abstract class
 abstract class Cars{
	 //abstract methods
	 public abstract double price();
     public abstract int getTotalSeat();
     public abstract String colors();
     //common methods
     public int Wheel()
     {
        return 4;
     }
     public String CallFacility()
     {
    	return "Call Facility  supported";
     }
}
class Toyota extends Cars{

	public double price() {
		 return 1000000;
	}
	public int getTotalSeat() {
		return 4;
	}
	public String colors() {
		return "Red";
	}
    public String DiscountPrice()
     {
         return "20% discount on buying Toyoya Cars";
     }
}
class Hyundai extends Cars{

	public double price() {
		 return 800000;
	}
	public int getTotalSeat() {
		return 4;
	}
	public String colors() {
		return "Black";
	}
}

public class Buyer {

	public static void main(String[] args)
	{
		Toyota car1 = new Toyota();
		Hyundai car2 = new Hyundai();
		
		System.out.println("Toyota price : "+ car1.price());
		System.out.println("Toyota seat: "+ car1.getTotalSeat());
		System.out.println("Toyota color : "+ car1.colors());
		System.out.println("Toyota Wheel : "+ car1.Wheel());
		System.out.println("Toyota CallFacility : "+ car1.CallFacility());
		System.out.println("Toyota DiscountPrice : "+ car1.DiscountPrice());
		
		System.out.println("Hyundai price : "+ car2.price());
		System.out.println("Hyundai seat: "+ car2.getTotalSeat());
		System.out.println("Hyundai color : "+ car2.colors());
		System.out.println("Hyundai Wheel : "+ car2.Wheel());
		System.out.println("Hyundai CallFacility : "+ car2.CallFacility());
	}
}

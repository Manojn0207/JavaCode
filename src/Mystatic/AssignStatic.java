package Mystatic;
class Phone {
	int price;
	String brand;
	String color;

	Phone(int price, String brand, String color) {
		this.price = price;
		this.brand = brand;
		this.color = color;
	}

	public void printdetails() {
		System.out.println("price " + price);
		System.out.println("brand " + brand);
		System.out.println("color " + color);
	}
}


public class AssignStatic {
	public static void main(String args[])

	{
		Phone oneplus = new Phone(3000, "OnePlus", "Blue");
		oneplus.printdetails();

	}

}

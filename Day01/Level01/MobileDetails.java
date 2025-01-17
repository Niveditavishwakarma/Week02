public class MobileDetails{
	public static void main(String args[])
	{
		MobilePhone phone1 = new MobilePhone("Samsung","Galaxy J2",20000);
		phone1.display();
		System.out.println();
		MobilePhone phone2 = new MobilePhone("Realme","12x pro",25000);
		phone2.display();
	}
}
class MobilePhone
{
	private String brand;
	private String model;
	private int price;
	//constructor
	public MobilePhone(String brand, String model,int price)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	//display the characteristics of mobile phones
	public void display(){
	System.out.println("Mobile Summary:");
	System.out.println("Mobile brand: " + brand);
	System.out.println("Mobile model: " + model);
	System.out.println("price: " + price);
}
}
	
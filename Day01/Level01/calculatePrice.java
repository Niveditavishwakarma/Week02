import java.util.Scanner;
public class calculatePrice{
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		Item item1 = new Item("001","Refrigerator",10000);
		item1.display();
		System.out.println("Enter quantity: ");
		int quantity1 = sc.nextInt();
		System.out.println("total cost of " + quantity1 +" items is: " + item1.totalCost(quantity1));
		System.out.println("--------------------------------------");
		Item item2 = new Item("002","microvave",15000);
		item2.display();
		System.out.println("Enter quantity: ");
		int quantity2 = sc.nextInt();
		System.out.println("total cost of " + quantity2 +" items is: " + item2.totalCost(quantity2));
		
		
	}
}
class Item{
	private String itemCode;
	private String itemName;
	private int price;
	//Constructor
	public Item(String itemCode,String itemName, int price)
	{
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	//display item details
	public void display()
	{
		System.out.println("Item Summary: ");
		System.out.println("ItemCode: "+itemCode);
		System.out.println("ItemName: "+itemName);
		System.out.println("price: "+price);
	}
	public int totalCost(int quantity)
	{
		return quantity*price;
	}
	
}
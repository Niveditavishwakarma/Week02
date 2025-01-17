
public class BookDetails{
//object of book class
public static void main(String agrs[]){
	Book book1 = new Book("My Beloved life","Amitava Kumar",432.5);
	Book book2 = new Book("The Far Field","Madhuri Vijay",799.99);
	Book book3 = new Book("Latitudes of Longing","Shubhangi Swarup",369);
	//calling the display
	System.out.println("Book details: ");
	book1.display();
	book2.display();
	book3.display();
	}
}
class Book{
	private String title;
	private String author;
	private double price;
	//constructor
	public Book(String title, String author, double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	//display the book details
	public void display()
	{
	
		System.out.println("title of the book: "+title);
		System.out.println("author of the book: "+author);
		System.out.println("price of the book: "+price);
		
	}
}
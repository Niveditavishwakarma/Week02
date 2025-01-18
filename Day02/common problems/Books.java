import java.util.Scanner;
public class Books{
	public static void main(String args[])
	{
		// Using the default constructor
        Book defaultBook = new Book();
        defaultBook.displayDetails();

        // Using the parameterized constructor
        Book paraBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 100.99);
        paraBook.displayDetails();
	}
}
class Book{
    private String title;
    private String author;
    private double price;
	//Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
	
    // Display method to show book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
  }

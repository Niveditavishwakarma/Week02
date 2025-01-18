public class LibraryBooking{
	public static void main(String args[]) 
	{
        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);
        Book book2 = new Book("1984", "George Orwell", 8.99, false);

        // Display details of the books
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();

        // Try borrowing the books
        System.out.println("Borrowing book 1:");
        book1.borrowBook();
        System.out.println();

        System.out.println("Borrowing book 2:");
        book2.borrowBook();
        System.out.println();

        // Check availability after borrowing
        System.out.println("Book 1 Details After Borrowing:");
        book1.displayDetails();
    
	}
}
public class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have successfully borrowed the book: " + title);
            isAvailable = false; 
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

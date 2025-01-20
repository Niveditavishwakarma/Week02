public class BookLibrary{
	 public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "Effective Java", "James gosling");
        System.out.println("Book Details:");
        book1.displayBookDetails();
		book1.displayName();
        System.out.println();
		
		Book book2 = new Book("778-3-17-258420-1", "introduction to c++", "Joshua Bloch");
        System.out.println("Book Details:");
        book1.displayBookDetails();
		book1.displayName();
        System.out.println();

    }

}
class Book {
    
	//static variable
	private static String libraryName = "Edge Solver";
    private final String ISBN;
	private String title;
	private String author;
	
    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    //method to display library name
	public static void displayName(){
		System.out.println("Name of the library is: " + libraryName);
	}
    // Method to Display Book Details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
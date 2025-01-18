public class BookLibrary{
	 public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "Effective Java", "Joshua Bloch");
        System.out.println("Book Details:");
        book1.displayBookDetails();
        System.out.println();

        book1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + book1.getAuthor());
        System.out.println();

        EBook ebook = new EBook("978-0-12-374856-0", "Clean Code", "Robert C. Martin", 2.5);
        ebook.displayEBookDetails();
        System.out.println();

        System.out.println("Accessing details through the superclass:");
        ebook.displayBookDetails();
    }

}
class Book {
    // Public Variable
    public String ISBN;

    // Protected Variable
    protected String title;

    // Private Variable
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // Method to Display Book Details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double fileSize;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSize + " MB");
    }
}
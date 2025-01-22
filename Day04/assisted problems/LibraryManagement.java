import java.util.ArrayList;

public class LibraryManagement{
    public static void main(String[] args) {

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        Library library1 = new Library("City Library");
        Library library2 = new Library("Community Library");

        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);

        library1.displayLibraryInfo();
        System.out.println();
        library2.displayLibraryInfo();
    }
}

// Book class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class
class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display library details
    public void displayLibraryInfo() {
        System.out.println("Library: " + name);
        System.out.println("Books in the library:");
        for (Book book : books) {
            book.displayBookInfo();
        }
    }
}


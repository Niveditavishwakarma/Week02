package librarymanagement;

public class Book {
    private String title;
    private int publicationyear;

    public Book(String title,int publicationyear) {
        this.title = title;
        this.publicationyear = publicationyear;
    }

    public void displayInfo(){
        System.out.println("Book details: ");
        System.out.println("Title of the book: " + title);
        System.out.println("Publication Year: " + publicationyear);
    }

    public String getTitle(){
        return title;
    }

    public int getPublicationyear(){
        return publicationyear;
    }
}


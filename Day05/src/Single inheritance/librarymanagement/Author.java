package librarymanagement;

public class Author extends Book{
    private String name;
    private String bio;

    public Author(String title, int publicationyear, String name, String bio) {
        super(title, publicationyear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author Details: ");
        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

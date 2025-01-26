package librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable{
    private boolean isAvailable;

    public DVD(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title, author);
        this.isAvailable = isAvailable;
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("DVD reserved successfully.");
            isAvailable = false;
        } else {
            System.out.println("DVD is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

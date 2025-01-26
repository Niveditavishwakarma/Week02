package librarymanagementsystem;

import java.util.*;

public class Main {
    public static void processLibraryItems(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Available: " + reservableItem.checkAvailability());
                reservableItem.reserveItem();
            }

            System.out.println("---------------------------------------");
        }
    }

    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald", true));
        items.add(new Magazine("M001", "National Geographic", "Various", true));
        items.add(new DVD("D001", "Inception", "Christopher Nolan", false));

        System.out.println("Library Management System");
        processLibraryItems(items);
    }
}

package restaurantmanagement;

public class Main {
    public static void main(String[] args) {
        // Creating objects for Chef and Waiter
        Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("James", 201, 5);

        // Displaying details and duties of Chef
        System.out.println("----- Chef Details -----");
        chef.displayDetails();
        chef.performDuties();

        // Displaying details and duties of Waiter
        System.out.println("\n----- Waiter Details -----");
        waiter.displayDetails();
        waiter.performDuties();
    }
}

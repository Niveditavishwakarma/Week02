package restaurantmanagement;

public class Waiter extends Person implements Worker {
    private int tableCount;

    // Constructor
    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    // Implementing the performDuties() method
    @Override
    public void performDuties() {
        System.out.println("Serving customers and managing " + tableCount + " tables.");
    }
}

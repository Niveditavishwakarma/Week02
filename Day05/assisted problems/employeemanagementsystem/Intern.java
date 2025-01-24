package EmployeeManagementSystem;

public class Intern extends Employee {
    private String universityName;

    // Constructor
    public Intern(String name, int id, double salary, String universityName) {
        super(name, id, salary);
        this.universityName = universityName;
    }

    // Overriding displayDetails() method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University Name: " + universityName);
    }
}

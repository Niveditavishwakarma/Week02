package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Alice", 101, 75000, 10);
        Developer developer = new Developer("Bob", 102, 55000, "Java");
        Intern intern = new Intern("Charlie", 103, 15000, "XYZ University");


        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();

        System.out.println("\nIntern Details:");
        intern.displayDetails();
    }
}

package EmployeeManagementSystem;

public class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails() method
   @Override
   public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming language: " + programmingLanguage);
   }
}

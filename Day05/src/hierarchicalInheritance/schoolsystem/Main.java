package schoolsystem;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Administration");

        System.out.println("----- Teacher Details -----");
        teacher.displayDetails();
        teacher.displayRole();

        System.out.println("\n----- Student Details -----");
        student.displayDetails();
        student.displayRole();

        System.out.println("\n----- Staff Details -----");
        staff.displayDetails();
        staff.displayRole();
    }
}

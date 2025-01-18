public class EmployeeRecords{
	public static void main(String[] args) {
        Employee emp = new Employee(101, "IT", 50000);
        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();
        System.out.println();

        emp.setSalary(55000);
        System.out.println("Updated Salary: $" + emp.getSalary());
        System.out.println();

        Manager mgr = new Manager(102, "HR", 80000, 5);
        mgr.displayManagerDetails();
        System.out.println();

        System.out.println("Accessing Employee Details from Manager object:");
        mgr.displayEmployeeDetails();
    }
}


class Employee {
    // Public Variable
    public int employeeID;

    // Protected Variable
    protected String department;

    // Private Variable
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: $" + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }
	
    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

    
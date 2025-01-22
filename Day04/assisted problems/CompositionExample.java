import java.util.ArrayList;
public class CompositionExample {
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions");

        Department hr = new Department("Human Resources");
        Department it = new Department("Information Technology");

        company.addDepartment(hr);
        company.addDepartment(it);

        hr.addEmployee(new Employee("Alice"));
        hr.addEmployee(new Employee("Bob"));

        it.addEmployee(new Employee("Charlie"));
        it.addEmployee(new Employee("David"));

        company.displayDepartments();

        // The composition is demonstrated: Deleting the company would delete all departments and employees.
	}
}

// Employee class
class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }
}

// Department class
class Department {
    private String name;
    private ArrayList<Employee> employees;

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee " + employee.getName() + " added to Department " + name);
    }

    // Display all employees in the department
    public void displayEmployees() {
        System.out.println("Employees in Department " + name + ":");
        for (Employee employee : employees) {
            System.out.println("- " + employee.getName());
        }
    }

    // Get the department name
    public String getName() {
        return name;
    }
}

// Company class
class Company {
    private String name;
    private ArrayList<Department> departments;

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
        System.out.println("Department " + department.getName() + " added to Company " + name);
    }

    // Display all departments and their employees
    public void displayDepartments() {
        System.out.println("Departments in Company " + name + ":");
        for (Department department : departments) {
            System.out.println("Department: " + department.getName());
            department.displayEmployees();
        }
    }
}


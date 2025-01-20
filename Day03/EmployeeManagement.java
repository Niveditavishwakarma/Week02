public class EmployeeManagement{
	public static void main(String[] args) {
        Employee emp1 = new Employee(101, "IT","Alex Carter");
		System.out.println(Employee.Display());
        System.out.println("Employee Details:");
        emp1.displayEmployeeDetails();
        System.out.println();
		Employee emp2 = new Employee(102, "HR", "Sophia Mitchell");
        System.out.println("Employee Details:");
        emp2.displayEmployeeDetails();
        System.out.println();
	}
}


class Employee {
    private static String companyName = "hikeEdu";
	private static int totalEmployees;
    private String employeeName;
    private String designation;
	private final int employeeID;

    // Constructor
    public Employee(int employeeID, String designation, String name) {
        this.employeeID = employeeID;
        this.designation = designation;
        this.employeeName = name;
		totalEmployees++;
    }
	//method to show total number of employees
	public static String Display()
	{
		return "The total number of employees are: " + totalEmployees;
	}

    public void displayEmployeeDetails() {
		if(this instanceof Employee){
		System.out.println("company name: " + companyName);
		System.out.println("Employee name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Designation: " + designation);
		}
		else
		{
			System.out.println("not a valid object of Employee");
		}
    }
}


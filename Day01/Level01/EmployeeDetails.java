import java.util.Scanner;
public class EmployeeDetails{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter ID: ");
		int empId= sc.nextInt();
		System.out.println("Enter Salary: ");
		int Salary = sc.nextInt();
		//creating object of class Employee
		Employee employee = new Employee(name,empId,Salary);
		employee.display();
		
		
	}
}
class Employee{
	private String name;
	private int EmpId ;
	private int Salary;
	//Constructor
	public Employee(String name,int EmpId,int Salary){
		this.name = name;
		this.EmpId = EmpId;
		this.Salary = Salary;
	}
	//display method
	public void display(){
		System.out.println("Displaying Employee Details: ");
		System.out.println("Name of Employee: " + name);
		System.out.println("Employee ID of Employee: " + EmpId);
		System.out.println("Salary of Employee: " + Salary);
	}
}

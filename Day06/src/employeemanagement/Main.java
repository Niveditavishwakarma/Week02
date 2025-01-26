package employeemanagement;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String args[])
    {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(101,"Alice",50000);
        fullTimeEmp.assignDepartment("HR");
        employees.add(fullTimeEmp);

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(102,"bob",20000,20,500);
        partTimeEmp.assignDepartment("IT");
        employees.add(partTimeEmp);

        for (Employee emp : employees)
        {
            emp.displayDetails();
            if(emp instanceof Department)
            {
                System.out.println(((Department)emp).getDepartmentDetails());
            }
            System.out.println("------------------------");
        }

    }
}

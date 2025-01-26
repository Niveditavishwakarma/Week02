package employeemanagement;

class FullTimeEmployee extends Employee implements Department{
    private String departmentName;

    public FullTimeEmployee(int employeeId,String name,double baseSalary)
    {
        super(employeeId,name,baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + 5000;
    }

    @Override
    public void assignDepartment(String departmentName)
    {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails(){
        return "Department: " + departmentName;
    }
}

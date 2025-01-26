package employeemanagement;

 class PartTimeEmployee extends Employee implements Department{
    private int hoursWorked;
    private double hourlyRate;
    private String departmentName;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + (hourlyRate*hoursWorked);
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

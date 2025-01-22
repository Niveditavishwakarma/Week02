import java.util.ArrayList;
import java.util.List;

public class UniversityManagement {
    public static void main(String args[]) 
	{
        University university = new University("Tech University");

        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");

        university.addDepartment(csDepartment);
        university.addDepartment(eeDepartment);

        Faculty alice = new Faculty("Alice");
        Faculty bob = new Faculty("Bob");
        Faculty charlie = new Faculty("Charlie");

        csDepartment.addFaculty(alice);
        csDepartment.addFaculty(bob);
        eeDepartment.addFaculty(charlie);

        System.out.println("University: " + university.getUniversityName());
        for (Department department : university.getDepartments()) {
            System.out.println("Department: " + department.getDepartmentName());
            System.out.println("Faculty Members:");
            for (Faculty faculty : department.getFacultyList()) {
                System.out.println("- " + faculty.getName());
            }
        }

        university.deleteUniversity();

        System.out.println("Faculty members still exist independently:");
        System.out.println("- " + alice.getName());
        System.out.println("- " + bob.getName());
        System.out.println("- " + charlie.getName());
    }
}

// Faculty Class
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department Class
class Department {
    private String departmentName;
    private List<Faculty> facultyList;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyList = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

// University Class
class University {
    private String universityName;
    private List<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void deleteUniversity() {
        departments.clear(); 
        System.out.println("University and its departments have been deleted.");
    }
}


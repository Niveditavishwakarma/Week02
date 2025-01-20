public class UniversityManagement {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student(101, "Alice", "A");
        Student student2 = new Student(102, "Bob", "B");
        
        Student.displayTotalStudents();
        student1.displayDetails();
        student2.displayDetails();
       
        student1.updateGrade("A+");
        student2.updateGrade("B+");
        
        // Display student details after grade update
        student1.displayDetails();
        student2.displayDetails();
        
		//invalid object
        Object nonStudentObject = new Object();
        if (nonStudentObject instanceof Student) {
            System.out.println("This object is a student.");
        } else {
            System.out.println("This object is not a student.");
        }
    }
}

class Student {
    // Static variable 
    static String universityName = "XYZ University";
    static int totalStudents = 0;
	
	//instance variable
    final int rollNumber;
    String name;
    String grade;

   
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;  // Final variable
        this.name = name;
        this.grade = grade;
        totalStudents++;  
    }
	
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled in " + universityName + ": " + totalStudents);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
	
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            grade = newGrade;
            System.out.println("Grade updated to: " + grade);
        }
    }
}


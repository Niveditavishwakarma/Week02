public class UniversityManagement{
	public static void main(String args[])
	{
        Student student1 = new Student(101, "Alice", 8.5);
        System.out.println("Student Details:");
        student1.displayStudentDetails();
        System.out.println();

        student1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student1.getCGPA());
        System.out.println();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.2, "Artificial Intelligence");
        pgStudent.displayPostgraduateDetails();
        System.out.println();

        System.out.println("Accessing details through the superclass:");
        pgStudent.displayStudentDetails();
	}
}
class Student{
	// Public Variable
    public int rollNumber;

    // Protected Variable
    protected String name;

    // Private Variable
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Research Topic: " + researchTopic);
    }
}
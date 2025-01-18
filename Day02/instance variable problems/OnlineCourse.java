public class OnlineCourse{
	public static void main(String args[])
	{
        // Create course instances
        Course course1 = new Course("Java Programming", 12, 500.00);
        Course course2 = new Course("Web Development", 16, 600.00);

        // Display course details before updating institute name
        System.out.println("Before updating institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Update institute name
        Course.updateInstituteName("Global Tech Institute");

        // Display course details after updating institute name
        System.out.println("After updating institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    
	}
}
class Course {
	// Instance Variables
    private String courseName;
    private int duration; 
    private double fee;

    // Class Variable
    private static String instituteName = "Tech Academy";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

package educationcourse;

public class Main {
    public static void main(String[] args) {
        // Base course
        Course course = new Course("Introduction to Programming", 8);

        // Online course
        OnlineCourse onlineCourse = new OnlineCourse("Java Fundamentals", 10, "Udemy", true);

        // Paid online course
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 12, "Coursera", false, 200.0, 20.0);

        // Display details for each type of course
        System.out.println("----- Basic Course -----");
        course.displayCourseInfo();

        System.out.println("\n----- Online Course -----");
        onlineCourse.displayCourseInfo();

        System.out.println("\n----- Paid Online Course -----");
        paidCourse.displayCourseInfo();
    }
}

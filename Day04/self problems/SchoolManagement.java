import java.util.ArrayList;
import java.util.List;

public class SchoolManagement {
    public static void main(String[] args) {
       
        School school = new School("Greenwood High");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        school.addStudent(student1);
        school.addStudent(student2);

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        System.out.println("Students at " + school.getName() + ":");
        for (Student student : school.getStudents()) {
            System.out.println("- " + student.getName());
        }

        System.out.println("Courses for each student:");
        for (Student student : school.getStudents()) {
            System.out.println(student.getName() + " is enrolled in:");
            for (Course course : student.getCourses()) {
                System.out.println("  - " + course.getCourseName());
            }
        }

        System.out.println("Students in each course:");
        for (Course course : List.of(course1, course2)) {
            System.out.println(course.getCourseName() + " has the following students:");
            for (Student student : course.getEnrolledStudents()) {
                System.out.println("  - " + student.getName());
            }
        }
    }
}

// School Class
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}

// Student Class
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); 
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}

// Course Class
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }
}


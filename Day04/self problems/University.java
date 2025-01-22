import java.util.ArrayList;
import java.util.List;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        professor1.assignCourse(course1);
        professor2.assignCourse(course2);
		
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student3.enrollCourse(course2);

        System.out.println();
        course1.showEnrolledStudents();
        course1.showProfessor();

        System.out.println();
        course2.showEnrolledStudents();
        course2.showProfessor();
    }
}

// Course Class
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " is assigned to course: " + courseName);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " enrolled in course: " + courseName);
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }

    public void showProfessor() {
        if (professor != null) {
            System.out.println("Professor for " + courseName + ": " + professor.getName());
        } else {
            System.out.println("No professor assigned for " + courseName);
        }
    }
}

// Student Class
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        course.enrollStudent(this);
    }
}

// Professor Class
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        course.assignProfessor(this);
    }
}



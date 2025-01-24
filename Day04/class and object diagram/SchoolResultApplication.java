import java.util.ArrayList;
import java.util.List;

public class SchoolResultApplication {
    public static void main(String[] args) {
       
        Student student = new Student("Alice", 101);

        student.addSubject(new Subject("Math", 95));
        student.addSubject(new Subject("Science", 85));
        student.addSubject(new Subject("English", 78));

        int totalScore = GradeCalculator.calculateTotalScore(student);
        double averageScore = GradeCalculator.calculateAverageScore(student);
        char grade = GradeCalculator.calculateGrade(student);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
    }
}

class Subject {
    private String subjectName;
    private int score;

    // Constructor
    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }
	
    public String getSubjectName() {
        return subjectName;
    }

    public int getScore() {
        return score;
    }
}

class Student {
    private String name;
    private int rollNumber;
    private List<Subject> subjects; 

    // Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = new ArrayList<>();
    }

    // Method to add a subject
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

class GradeCalculator {

    public static int calculateTotalScore(Student student) {
        int totalScore = 0;
        for (Subject subject : student.getSubjects()) {
            totalScore += subject.getScore();
        }
        return totalScore;
    }

    public static double calculateAverageScore(Student student) {
        int totalScore = calculateTotalScore(student);
        return (double) totalScore / student.getSubjects().size();
    }

    public static char calculateGrade(Student student) {
        double average = calculateAverageScore(student);

        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }
}


public class StudentReport{
	public static void main(String args[]){
	Student student = new Student("Nivedita","0199CS",94);
	student.display();
	}
}
class Student{
	private String name;
	private String rollNumber;
	private int marks;
	//constructor
	public Student(String name,String rollNumber,int marks){
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	//calculate grade
	public String calculateGrade()
	{
		if(marks<33)
		return "fail";
		else if(marks>=33 && marks<=60)
		return "Grade C";
		else if(marks>=61 && marks<=80)
		return "Grade B";
		else if(marks>=81 && marks<=100)
		return "Grade A";
		else
		return "Invalid number";
	}
	//dislay details and Grade of student
	public void display(){
		System.out.println("Student name: "  + name);
		System.out.println("Student rollNumber: " + rollNumber);
		System.out.println("Student marks: " + marks);
		System.out.println("Student grade: " + calculateGrade());
	}
}
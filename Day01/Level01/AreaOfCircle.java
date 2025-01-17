import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		//create an object of Circle class
		Circle circle = new Circle(radius);
		circle.display();
		sc.close();
	}
}
class Circle{
	private double radius;
	//Constructor
	public Circle(double radius){
		this.radius = radius;
	}
	public double area(double radius)
	{
		return 3.14*radius*radius;
	}
	public double circumference(double radius)
	{
		return 2*3.14*radius;
	}
	//display method
	public void display()
	{
		System.out.println("Area of Circle: " + area(radius));
		System.out.println("Circumference of circle: " + circumference(radius));
	}
}
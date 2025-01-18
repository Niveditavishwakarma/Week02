import java.util.Scanner;
public class CircleClass{
public static void main(String args[])
{
		Scanner sc = new Scanner(System.in);
		// Using the parameterized constructor
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
        Circle paraCircle = new Circle(radius);
        paraCircle.displayDetails();
		
		System.out.println();
		
		// Using the default constructor
        Circle defaultCircle = new Circle();
        defaultCircle.displayDetails();

    }
}


class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0; 
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Display circle details
    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
   
    }
}

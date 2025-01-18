public class PersonClass{
	public static void main(String[] args) {
        // Create a person using the parameterized constructor
        Person originalPerson = new Person("Alice", 25, "123 Main Street");
        originalPerson.displayDetails();

        System.out.println();

        // Create a copy of the person using the copy constructor
        Person clonedPerson = new Person(originalPerson);
        clonedPerson.displayDetails();

        System.out.println();

        // Modify the cloned person's details
        clonedPerson.setName("Bob");
        clonedPerson.setAge(30);
        clonedPerson.setAddress("456 Elm Street");
        System.out.println("After modifying the cloned person's details:");
        clonedPerson.displayDetails();

        System.out.println();

        // Display the original person's details to confirm it remains unchanged
        System.out.println("Original person's details after modification of the clone:");
        originalPerson.displayDetails();
	}
}


 class Person {
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Display method to show person details
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

package schoolsystem;

public class Person {
        protected String name;
        protected int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public void displayRole() {
            System.out.println("Role: General Person");
        }
    }


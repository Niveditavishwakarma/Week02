 public class AnimalHierarchy{
	public static void main(String args[])
	{	Animal animal = new Animal("animal",4);
		Animal dog = new Dog("Tuffy",2);
		Animal cat = new Cat("Whisker",1);
		Animal bird = new Bird("Tweety",1);
		
		animal.makeSound();
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
		
	}
}
 class Animal{
	public String name;
	public int age;
	public Animal(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public void makeSound()
	{
		System.out.println(name + " make sounds");
	}
}
class Dog extends Animal{
	Dog(String name,int age)
	{
		super(name,age);
	}
	
	public void makeSound()
	{
		System.out.println(name + " barks");
	}
}
class Cat extends Animal{
	Cat(String name,int age)
	{
		super(name,age);
	}
	
	public void makeSound()
	{
		System.out.println(name + " meows");
	}
}
class Bird extends Animal{
	Bird(String name,int age)
	{
		super(name,age);
	}
	
	public void makeSound()
	{
		System.out.println(name + " chirps");
	}
}


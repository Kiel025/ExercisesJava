import java.util.Scanner;

public class Main{
	public static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("Please, enter aawith your name: ");
		String name = scan.nextLine();
		System.out.println("Now is your aaage: ");
		int age = scan.nextInt();
		System.out.println("And your height: ");
		double height = scan.nextDouble();
		System.out.println("Thanks!");

		Person p = new Person(name, age, height);
		p.printInfos();
	}
}

class Person{
	private String name;
	private int age;
	private double height;

	Person(String name, int age, double height){
		setName(name);
		setAge(age);
		setHeight(height);
	}

	public void printInfos(){
		System.out.println("\nYour name is " + getName());
		System.out.println("Your age is " + getAge());
		System.out.println("Your height is " + getHeight());
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return this.age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public double getHeight(){
		return this.height;
	}

	public void setHeight(double height){
		this.height = height;
	}
}
/* 2. a) Make a class Human with a name and age. Make a class Employee inherit from Human. Add instance variable salary of type double. Supply a method show Data() that prints the Employee's name, age, and salary. Make a class Manager inherit from Employee. Supply appropriate showData() methods for all classes. Provide a test program that tests these classes and methods.*/

class Human{
	public String name;
	public int age;
}

public class Employee extends Human{
	String name = "Yakeen";
	int age = 21; 
	public double salary= 100000;
	
	public void showData(){
		System.out.println(name + age + salary);
	}
	
	public static void main(String[] args){
		Employee e = new Employee();
		e.showData();
	}
}

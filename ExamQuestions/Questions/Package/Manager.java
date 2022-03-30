import livingbeing.Human;

public class Manager extends Employee{
	int salary;
	
	public static void main(String[] args){
		
		Human h = new Human();
		h.message();
			
		Manager m = new Manager();
		m.name = "Shivaji Chalise";
		m.age = 22;
		m.height = 5;
		m.salary = 10000;
		m.message();
		
		
		
	}
}
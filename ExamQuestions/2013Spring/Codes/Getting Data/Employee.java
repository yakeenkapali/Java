public class Employee extends Info{
	public static void main(String[] args){
		
		Info i = new Info();
		i.getData(23, "t");
		
		System.out.println(i.a);
		System.out.println(i.b);
	}
}
public class InterfaceDemo implements ContainsInterface{
	
	public int sum(int x, int y){
		return x + y;
	}

	public static void main(String[] args){
		InterfaceDemo id = new InterfaceDemo();
		System.out.println(id.sum(2,3));
	}
}
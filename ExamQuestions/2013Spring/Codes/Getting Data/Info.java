public class Info{
	public int a;
	public String b;
		
	public Info getData(int x, String y){
		a = x;
		b = y;
		
		Info i = new Info();
		return i;
	}
}

// Line 5 : Info = return type which returns the object i  , getData() = method
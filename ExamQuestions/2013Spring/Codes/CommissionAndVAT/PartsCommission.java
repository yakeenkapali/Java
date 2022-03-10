public class PartsCommission extends PartsVAT{
	
	public static double seatPrice, tirePrice, enginePrice;
	
	PartsCommission(){
		seatPrice = 10000;
		tirePrice = 20000;
		enginePrice = 30000;
	}
	
	public static double calcCommission(double c){
		return c * 0.1;
	}
	
	public static void displayCommission(double d){
		System.out.println("Commission = "+ d);
	}
	
}

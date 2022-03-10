/* [2011S 2a]
Create a class Parts with instance enginePrice, seatPrice, tirePrice, constructors to initialize the object, a method to calculate commission which calculates 10% of the price of each item and a method to display the details. Derive a new class Parts VAT with a method to calculate 13% VAT of the item. Write necessary constructors to that use the super  constructors. Test the classes using a main method in third class. */

public class CommissionAndVAT extends PartsCommission{
	
	public static void main(String[] args){
		
		CommissionAndVAT cv = new CommissionAndVAT();
		
		displayCommission(calcCommission(cv.enginePrice));
		displayCommission(calcCommission(cv.seatPrice));
		displayCommission(calcCommission(cv.tirePrice));
		
		displayVAT(calcVAT(cv.enginePrice));
		displayVAT(calcVAT(cv.seatPrice));
		displayVAT(calcVAT(cv.tirePrice));
	}
}



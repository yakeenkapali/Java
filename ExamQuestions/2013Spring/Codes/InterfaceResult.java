/*Write an interface Exam with a method pass (int score) that returns a boolean. Write another interface Classify with a method division(int average) which returns a string. Write class Result which implements both Exams and Classify. The pass method should return true if score is greaer than 50 otherwise false. The division method must return 'First' when average is more than 80, 'Second' when average is more than 50 otherwise "No Division". */

interface InterfaceExam{
	boolean pass(int score);
}

interface InterfaceClassify {
	//boolean pass(int score);
	String division(int average, boolean isPass);
}

public class InterfaceResult implements InterfaceExam, InterfaceClassify{
	public boolean pass(int score){
		if(score >= 50){
			return true;
		}
		else{
			return false;
		}
	}
		
	public String division(int average, boolean isPass){
		String first = "First";
		String second = "Second";
		String noDiv = "No Division";
		String fail = "Fail";

		if(isPass){
			if (average >= 80){
				return first;
			}
			else if(average >= 50){
				return second;
			}
			else{
				return noDiv;
			}
		}else{
			return fail;
		}
	}
		
	public static void main(String[] args){
		InterfaceResult r = new InterfaceResult();
		System.out.println(r.division(80, r.pass(40)));
	}
}
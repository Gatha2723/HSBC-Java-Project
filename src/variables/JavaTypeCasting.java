package variables;

public class JavaTypeCasting {

	public static void main(String[] args) {
		
		//Widening Casting(Small to Big)
		
		int digit = 34;
		float digit1 = digit;
		System.out.println(digit1);
		
		//Narrowing Casting(Big to Small)
		
		float digit2 = 3.14F;
		int digit3 = (int) digit2;
		System.out.println(digit3);
		
		
		//percentage scenario
		
		int max_Score = 500;
		int actual_Score = 432;
		
		float Per_score = (float) actual_Score / max_Score * 100F;
		System.out.println(Per_score);
		
		}

}

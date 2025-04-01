package projects;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int Number1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int Number2 =scanner.nextInt();
		
		int Result = Number1 - Number2;
		System.out.println("The result is " + Result);
		
		if(Result > 0)
		{
			System.out.println("The Number is Positive");
		}
		
		else
		{
			System.out.println("The Number is Negative");
		}
		
	    scanner.close();
		
	}

}

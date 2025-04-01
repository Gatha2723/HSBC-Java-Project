package variables;

public class SwitchCase {

	public static void main(String[] args) 
	{
		
		// Code 1
		String color = "R6ed";
		
		switch (color) 
		{
		case "Red" :
			System.out.println("You need to stop");
			break;
			
		case "Green" :	
			System.out.println("You need to go");
			break;
			
		case "Yellow" :	
			System.out.println("You need to be prepare to stop");
			break;
			
		default :
			System.out.println("Invalid signal color");
		}
		 
		
		//Code 2
		
		int day = 6;
		switch(day)
		{
		case 1:
			System.out.println("Monday");
		case 2:
			System.out.println("Tuesday");
		case 3:
			System.out.println("Wednesday");
		case 4:
			System.out.println("Thursday");
		case 5:
			System.out.println("Friday");
			System.out.println("These are Week days");
		break;
		
		case 6:
			System.out.println("Saturday");
		case 7:
			System.out.println("Sunday");
			System.out.println("These are Weekend days");
		break;
		
		}
		
			
			
	}

}

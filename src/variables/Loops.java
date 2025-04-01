package variables;

public class Loops {

	public static void main(String[] args) 
	{
		//code 1
		/*int num = 1;
		while(num <=6)
		{
			System.out.println(num);
			num++;
		}*/
		
		//code 2
		/*String text = "Welcome to Barclay Bank";
		System.out.println(text.length());
		int i = 0;
		while (i<=22)
		{
			System.out.println(text.charAt(i));
		    i++;
		} */
		
		//Do while loop 
        
	/*	int digit = 1;
		do {
			System.out.println(digit);
			digit++;
		}
		while(digit<=5); */
		
		
		// Countdown for Happy Birthday Gatha
		
		/*int min = 60;
		
		while (min > 0)
		{
			System.out.println("countdown " + min);	
			min--;
		}
		System.out.println("Happy Birthday Gatha");	*/
		
		//FOR LOOP
		
	/*	for (int i= 4; i< 8;i++)
		{
			System.out.println("For loop executed"+ i + "th time");
		}  */
		
		//code 1 for FOR Loop (even values betn 0 to 10)
	/*	for (int evennum = 0; evennum < 10; evennum = evennum+2)
		{
			System.out.println(evennum);
		}
		System.out.println("Above are the even numbers");
		
		for (int oddnum = 1;oddnum < 10;oddnum = oddnum+2)
		{
			System.out.println(oddnum);
		}
		System.out.println("Above are the odd numbers"); */
		
		//Nested loop(inner and outer loop)
		
		for (int i = 0 ;i<4; i++)
		{
			System.out.println(i);
			
			for (int j= 0; j<3; j++)
			{
				System.out.println(j);
			}
		}
		
		
	}

}

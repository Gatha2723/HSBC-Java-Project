package variables;

public class JavaConditions {

	public static void main(String[] args) {
		
		//if
		
		String name = "Suraj";
		if (name == "Rani")
		{
			System.out.println("Welcome to Baroda Internet Banking Rani!..");
		}
		
		System.out.println("You are not the correct person to logged in to Internet Banking");
		
		//if else
		
		int Age = 16 ;
		if (Age <= 18)
		{
			System.out.println("You are under 18 not allowed to logged in to this site");
		}
		
		else
		{
			System.out.println("You are matured enough to logged in to this site ");
		}
		
		//else if
		
		int a = 1;
		int b = 3;
		int c = 7;
	
		if(a == 2)
		{
			System.out.println(a);
		}
        
		else if (b != 3)
		{
			System.out.println(b);
		}
		
		else
		{
			System.out.println(c);
		}
		
	}
	
	

}

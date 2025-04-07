package variables;

public class Functions {
	

	static void myMethod()
	{
		String name = "Harsha";
		String surname = "Rebhankar";
		System.out.println(name + " " + surname);
	}
	
	public static void mynewMethod(int a, int b)
	{
		int c = a +b;
		System.out.println(c);
	}
	
	public static int addition(int a, int b)
	{
		return a+b;
		
	}
	
	public static int sum(int k) 
	{
	    if (k > 0) 
	    {
	      return k + sum(k - 1);
	    } 
	    else 
	    {
	      return 0;
	    }
	}
	
	public static void main(String[] args) {
		
	myMethod();	
	mynewMethod(4,5);
	int x = addition(5,5);
	System.out.println(addition(2,4));
	System.out.println(x);
	int result = sum(10);
	System.out.println(result);
		
	}

}

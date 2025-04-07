package variables;

class Audi{
	
	String color;
	String model;
	float prize;
	
	public void PrintColor(String color)
	{
		this.color = color;
		System.out.println(color);
	}
	
	Audi() // Constructor with no argument
	{
		System.out.println("This is the Audi Constructor");
	}
	
	Audi(String color)  // Constructor with argument
	{
		this.color = color;
		System.out.println(color);
	}
	
	Audi (Audi audiobj1)
	{
		this.color = audiobj1.color;
		this.model = audiobj1.model;
		this.prize = audiobj1.prize;
	}
}

public class Cars{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi audiobj = new Audi();
		audiobj.color = "Red";
		audiobj.model = "Audi A4";
		audiobj.prize = 49.99000F;
		
		Audi audiobj1 = new Audi();
		audiobj1.color = "Blue";
		audiobj1.model = "Audi Q4";
		audiobj1.prize = 44.99000F;
		
		audiobj.PrintColor(audiobj.color);
		audiobj1.PrintColor(audiobj1.color);
		
		Audi audiobj2 = new Audi ("red");
		
		Audi audiobj3 = new Audi(audiobj1);
		System.out.println(audiobj3.color);
		System.out.println(audiobj3.model);
		System.out.println(audiobj3.prize);
		

	}

}

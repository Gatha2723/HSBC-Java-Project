package variables;

class Marriage{
	String bride;
	String groom;
	
	public void Reception()
	{
		System.out.println("Welcome to your Reception party");
	}
	

	public static void Proposal()
	{
		System.out.println("I LOVE YOU GAURAV");
	}
	
	public static void Proposal(String groom)
	{
		String Groom = groom;
		System.out.println("I LOVE YOU "+ Groom);
	}
	
	public static void Proposal(String bride,String groom)
	{
		String Bride = bride;
		String Groom = groom;
		System.out.println("Welcome to reception of "+ Bride + " and "+ Groom);
	}
	
}

public class OOPS {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marriage m1 = new Marriage();
		m1.bride = "Harsha";
		m1.groom = "Gaurav";
		System.out.println("Welcome to wedding of "+ m1.bride +" and "+ m1.groom);
		m1.Reception();
		
		Marriage m2 = new Marriage();
		m2.bride = "Shivani";
		m2.groom = "Uday";
		System.out.println("Welcome to wedding of "+ m2.bride +" and "+m2.groom);
		
		
		//POLYMORPISM
		m1.Proposal();
		m2.Proposal();
		
		m1.Proposal(m1.groom);
		m2.Proposal(m2.groom);
		
		m1.Proposal(m1.bride,m1.groom);
		m2.Proposal(m2.bride,m2.groom);
		

	}

}

package variables;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name");
		String EmpName = input.next();
		System.out.println("Enter the Mobile Number");
		long MobNum = input.nextLong();
		System.out.println("Enter the services");
		String Services = input.next();
		System.out.println("Enter the fees");
		float Fee = input.nextFloat();
		
		System.out.println("Display Employee Details");
		System .out.println(EmpName + " " + MobNum  + " " + Services + " " + Fee);
        input.close();
	}

}

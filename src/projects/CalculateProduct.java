package projects;

import java.util.Scanner;

public class CalculateProduct {
	
	public static int CalculateProduct(int a,int b)
	{
		
		return a*b;
		
	}
	
	public static int FactorialNumber(int n)
	{
		int Factorial= 1;
		for (int i=n;i>0;i--)
		{
			Factorial = Factorial*i;
		}
		System.out.println(Factorial);
		return n;
	}
	
	public static void SumNumber(int a,int b)
	{
		int sum = a+b;
		System.out.println("Addition of two number " + a + " and " + b + " is " + sum);
	}
	
	public static void PrimeNumber(int n)
	{
		
		if (n%n == 0 && n%1 == 0 && n%2 != 0 && n%3!= 0)
		{
			System.out.println( n + " this is the prime number");
		}
		else 
			{
				System.out.println( n + " this is the not prime number");
			}	
		   
	 }
	
	public static void EvenOddNum(int n)
	{
		if(n%2 == 0)
		{
			System.out.println(n +": is the even number");
		}
		else
		{
			System.out.println(n +" : is the odd number");
		}
		
	 }
	
	public static void Table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			int c = n*i;
			System.out.println(n+"*"+i+"="+ c);
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int c = CalculateProduct(2,6);
		System.out.println(c); // first method
		System.out.println(CalculateProduct(2,6)); // Second method
		
		
		FactorialNumber(4);
		
		SumNumber(3,6);
		
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		EvenOddNum(num);
		Table(2);
		
		System.out.println("Enter the Number");
		int primenum = scanner.nextInt();
		PrimeNumber(primenum);
		scanner.close();
		
		
	}

}

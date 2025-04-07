package projects;

import java.util.Scanner;

public class ArrayIInputOutput {

	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size  = scanner.nextInt();
		int marks [] = new int [size];
		//System.out.println(marks.length);
		
		for(int i= 0;i <size; i++)
		{
			System.out.println("Enter the "+i+ " array element");
			marks[i]= scanner.nextInt();
		}
		
		
		for (int i=0;i <size;i++)
		{
			System.out.println(marks[i]);
		}	
		
		System.out.println("Enter value of X");
		int x = scanner.nextInt();
		
		for(int i=0;i<size;i++)
		{
		  if (marks[i] == x)
		   {
			System.out.println("The x is at "+ i + "th index");
		   }
		}
		
		scanner.close();
	}

}

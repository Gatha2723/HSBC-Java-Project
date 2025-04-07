package variables;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row size of array");
		int row = scanner.nextInt();
		System.out.println("Enter the col size of array");
		int col = scanner.nextInt();
		
		int Array [][] = new int[row][col];
		
		System.out.println("Enter the array element");
		for (int i= 0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			
				Array[i][j]= scanner.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(Array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the value of X");
		int X = scanner.nextInt();
		for (int i= 0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			
				if(X == Array[i][j])
				{
					System.out.println("X value is at " + "[" + i + "]" + "[" + j + "]" + "index");
				}
			}
		}
		  
		
		scanner.close(); 
		
	}
}

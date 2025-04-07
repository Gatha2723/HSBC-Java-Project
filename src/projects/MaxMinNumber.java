package projects;

import java.util.Scanner;

public class MaxMinNumber {

	public static void main(String[] args) {
		
		int max = 0;
		int min= 0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = scanner.nextInt();
		
		int numbers[] = new int [size];
		System.out.println("Enter the Array elements");
		for(int i=0;i<size;i++)
		{
		   numbers[i] = scanner.nextInt();
		}
		
		for(int i=0;i<size;i++)   //Use to hold an element of the given array.
        {
            for(int j=i+1;j<size;j++)   //Use to check for rest of the elements of the array
            {
            	//First method to get the Max and Min numbers
                if(numbers[i]<numbers[j])    //Comparing and swapping
                {
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            	 
            	//Second method to get the Max and Min numbers
               	max = Math.max(numbers[i], numbers[j]);
            	min = Math.min(numbers[i],numbers [j]);
            	
            }
        }
		
		
		System.out.println(max);
    	System.out.println(min);

       /* for (int k= 0; k< numbers.length;k++)
		{
			System.out.println(numbers[k]);
		} */
        scanner.close();
    }

}



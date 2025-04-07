package variables;

public class Array {

	public static void main(String[] args) {
	
		//Initialization and declaration of array 
		
		String[] Cars = {"Punch","Venue","Fortuner","Ertiga", "BWM","Audi"};
		
		//Access to array
		
		System.out.println(Cars[3]);
		
		// to change the value of array
		
		Cars[3] = "Tata Toyota";
		System.out.println(Cars[3]);
		System.out.println(Cars.length);
		
		//for loop for array
		
		for (int i = 0; i<Cars.length; i++)
		{
			System.out.println(Cars[i]);
		}
		
		//MultiDimensional Array
		
		int[][] Numbers = {{1,2,3},{4,5,6}};
		System.out.println(Numbers[0][1]);
		
		//Changing the value of multi Dimensional array
		Numbers[0][2]=7;
		System.out.println(Numbers[0][2]);
		System.out.println(Numbers.length); 
		
		//Another way to declare Array
		
		int numbers [] = new int [3];
		numbers[0] = 2;
		numbers[1] = 3;
		numbers[2] = 4;
		
		for (int i=0;i<3;i++)
		{
			System.out.println(numbers[i]);
		}
		
		

	}

}

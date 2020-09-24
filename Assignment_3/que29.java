//29.	Write a program to print the total number of one-D arrays in a two-D array 
//and the number of elements in every one-D array present in the two-D arrays.

import java.util.Scanner;

class que29 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);

		int array[][] = new int[3][4];

		System.out.println("Enter elements in Array: ");
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				array[i][j] = sc.nextInt();
			}
		}

		int count = 0;

		for(int new_Array[] : array)
		{
			for(int temp : new_Array)
			{
				count++;
			}
		}

		System.out.println("Total number of elements: " +count);

	}

}


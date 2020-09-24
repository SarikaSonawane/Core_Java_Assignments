//27.	Write a program to fine the smallest and greatest number present in the array of integer type.


import java.util.Scanner;

class que27

{

	public static void main(String[] args)

	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter how many elements you want to insert in Array: ");

		int array_size = scan.nextInt();

		int arr[] = new int[array_size];

		System.out.println("Enter elements in Array: ");

		for(int i = 0; i < array .length; i++)
		{
			array [i] = scan.nextInt();
		}

		
		int max = array [0];

		for(int i = 0; i < array .length; i++)
		{
			if(max < array [i])
			{
				max = max + array [i];

				array [i] =  max - array [i];

				max =  max - array [i];
			}
		}

		int min = array [0];

		for(int i = 0; i < array .length; i++)
		{
			if(min > array [i])
			{
				min = min + array [i];

				array [i] = min - array [i];

				min = min - array [i];
			}
		}
		
		System.out.println("Maximum Element: " +max);

		System.out.println("Minimum Element: " +min);

	}
}


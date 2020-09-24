//28.	Initialize one String type of array and print the elements using for each loop.

import java.util.Scanner;

class que28

{
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter how many strings elements you want to insert in Array: ");

		int array_size  =  scan.nextInt();

		String array[] = new String[array_size];		


		System.out.println("Enter strings elements in Array: ");
		for(int i = 0; i < array.length; i++)
		{

			array[i] = scan.next();

		}
		System.out.println("Strings elements of Array: ");
		for(String str : array)
		{

			System.out.println(str + " ");
		}

	}

}


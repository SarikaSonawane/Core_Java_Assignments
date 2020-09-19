//24.	Write a program to search an element in the array


	import java.util.*;
	class que24
	{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter How many elements you want to insert in array: ");
			int arr_size = scan.nextInt();

			System.out.println("Enter "+arr_size+" Elements: ");
			int arr[] = new int[arr_size];

			int flag = 0;
			
			for(int i =  0; i < arr.length; i++)
			{
				arr[i] =  scan.nextInt();
			}
			
			System.out.print("Enter a number to search in the array: ");
			int search_key =  scan.nextInt();
			for(int j =  0; j < arr.length; j++)
			{
				if(arr[j] == search_key)
				{
					System.out.println("Number found at "+j+"th index");
					flag++;
				}
			}
				
			if(flag == 0)
			{
				System.out.println("Enement not found");
			}
			
		}
	}
//25.	Write the program to find the sum of even elements and sum of odd 
//elements present in the array of integer type.


	import java.util.*;
	class que25
	{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter How many elements you want to insert in array: ");
			int arr_size = scan.nextInt();

			System.out.println("Enter "+arr_size+" Elements: ");
			int arr[] = new int[arr_size];

			for(int i=0; i<arr.length; i++)
			{
				arr[i]=scan.nextInt();
			}

			int oddSum=0;
			int evenSum=0;
			
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j]%2==0)
				{
					evenSum=evenSum+arr[j];
				}
				else
				{
					oddSum=oddSum+arr[j];
				}
			}
			
			System.out.println("Sum of Even numbers: "+evenSum);
			System.out.println("Sum of Odd numbers: "+oddSum);
		}
	}
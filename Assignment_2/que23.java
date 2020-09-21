		
// 23.	Write a program to reverse the array elements


	import java.util.*;
	class que23
	{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter How many elements you want to insert in array: ");
			int arr_size = scan.nextInt();

			System.out.println("Enter "+arr_size+" Elements: ");
			int arr[] = new int[arr_size];
			int start = 0,end =  arr.length - 1;
			
			for(int i = 0; i < arr.length; i++)
			{
				arr[i] =  scan.nextInt();
			}

			for(int j =  1; j <=  arr.length/2; j++)
			{
				arr[start] = arr[end] + arr[start];
				arr[end] = arr[start] - arr[end];
				arr[start] = arr[start] - arr[end];
				start+= 1;
				end-= 1;
			}
				
			
			System.out.println("Array in reverse order: ");
			for(int i:arr)
			{
				System.out.println(i);
			}
			
		}
	}
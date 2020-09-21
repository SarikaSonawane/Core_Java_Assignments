//22.	Sort a ten element array in descending order.


	import java.util.*;
	class que22
	{
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter 10 numbers: ");
			int arr[]=new int[10];
			int x=0,max=0;
			
			for(int i=0; i<arr.length; i++)
			{
				arr[i]=scan.nextInt();
			}

			for(int i = 0; i < arr.length; i++)
			{
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i] < arr[j])
					{
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
				
			
			System.out.println("Sorted array in descending order: ");
			for(int i=0; i<arr.length; i++)
			{
				System.out.println(arr[i]);
			}
			
		}
	}
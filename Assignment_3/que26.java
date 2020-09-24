//26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.


		import java.util.*;

		class que26

		{

			public static void main(String[] args) 

			{

				Scanner sc = new Scanner(System.in);

				int array[][] = new int[3][4];

				System.out.println("Enter elements in Array: ");
				for(int i = 0; i < array.length; i++)

				{
					for(int j = 0; j < array[i].length ; j++)
					{
						ar[i][j] = sc.nextInt();
					}
				}

				int sum = 0;

				for(int i = 0; i < array.length; i++)
				{
					for(int j : array[i])
					{
						sum = sum + j;
					}
				}

				System.out.println("Sum :"+sum);
			}
		}
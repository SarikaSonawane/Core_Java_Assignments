// 30.	Create an integer type 2-D array of size [3X3]. 
//   Take the elements from the user and then  
//   calculate the sum of the elements present in the diagonal.

	import java.util.Scanner; 



	class que30

	{

		public static void main(String[] args) 

		{

			Scanner sc  = new Scanner(System.in); 

			int [][]array = new int[3][3]; 

			

			System.out.println("Enter elements in 3*3 Array:"); 

			for(int i = 0; i < array.length; i++)

			{

				for(int j = 0; j < array[i].length; j++)

				{

					array[i][j] = sc.nextInt(); 

				}

			}

			

			System.out.println("Diagonal Elements are:"); 

			
			int sum_diag1 = 0, sum_diag2 = 0;

			for(int i = 0; i<array.length; i++)

			{

				for(int j = 0; j<array[i].length; j++)

				{

					if(i == j)

					{

						System.out.print("\t"+array[i][j]); 
						sum_diag1 = sum_diag1 + array[i][j];

					}

					if ((i + j) == (array.length - 1)) {
						System.out.print("\t"+array[i][j]); 
						sum_diag2 = sum_diag2 + array[i][j];
					}
                	

				}

			}

			System.out.println("\nSum of the elements present in the diagonal 1: " +sum_diag1);
			System.out.println("Sum of the elements present in the diagonal 1: " +sum_diag2);

		}

	}


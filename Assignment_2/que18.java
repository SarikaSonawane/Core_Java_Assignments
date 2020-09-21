		
//18.	Program to check whether number is prime or not.

	import java.util.Scanner;
	class que18
	{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num = scan.nextInt();

			
			boolean flag = true;
			if(num == 0 || num == 1)
			{
				System.out.println("Not a prime number.");
			}
			else
			{
				for(int i = 2; i <= num / 2; i++)
				{
					if(num % i == 0)
					{
						flag=false;
					}
				}

				if(flag == true)
				{
					System.out.print("Prime number");
				}
				
				else
				{
					System.out.println("Not a Prime number.");
				}
			}
		}
	}
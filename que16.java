//16.	Write a program to print table of any entered number using loop


	import java.util.Scanner;
	class que16
	{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num = scan.nextInt();
			
			for(int i = 1; i <= 10; i++)
			{
				System.out.println(num*i);
			}
		}
	}
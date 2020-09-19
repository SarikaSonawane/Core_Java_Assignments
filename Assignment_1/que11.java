
//11.	Write a program to swap two numbers without using third variable.


import java.util.Scanner;
	class que11
	{
		public static void main(String[] args)
		{
			System.out.print("Enter 1st number: ");
			Scanner scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			System.out.print("Enter 2nd number: ");
			int num2 = scan.nextInt();
			System.out.println("\nNumbers before Swapping");
			System.out.println("1st number: "+num1+"\n2nd number: "+num2);

			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;

			System.out.println("\nNumbers After Swapping");
			System.out.println("1st number: "+num1+"\n2nd number: "+num2);
		}
	}
// 06.	Write a program that takes radius of a circle as input.
// 	Read the entered radius using Scanner class. 
// 	Then calculate and print the area and circumference of the circle



import java.util.Scanner;
	
	class que6
	{
		public static void main(String[] args)
		{
			System.out.println("Enter radius of Circle: ");
			Scanner sc = new Scanner(System.in);
			float radius=sc.nextInt();

			System.out.println("Area of Circle: "+(3.14*radius*radius));

			System.out.println("Circumference of the Circle: "+(2f*3.14*radius));
		}
	}
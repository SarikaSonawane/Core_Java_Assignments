// 07.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
// 	Take the obtained marks from user using Scanner class. 
// 	Output should be in this format [ percentage marks = 99 % ]. 
// Use concatenation operator here.




import java.util.Scanner;
	class que7
	{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter marks of five subjects: ");
			float sub1 = scan.nextFloat();
			float sub2 = scan.nextFloat();
			float sub3 = scan.nextFloat();
			float sub4 = scan.nextFloat();
			float sub5 = scan.nextFloat();

			float percentage=(sub1 + sub2 + sub3 + sub4 + sub5) / 5;
			System.out.println("percentage marks = " +percentage+" %");
		}
	}
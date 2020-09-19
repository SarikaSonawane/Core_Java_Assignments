//21.	Program to show sum and average of 10 element array. 
//Accept array elements from user. 

	import java.util.Scanner;
	class que21
	{
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter 10 numbers: ");
			int array []=new int[10];
			int sum=0;
			
			for(int i=0; i<array .length; i++)
			{
				array [i]=scan.nextInt();
			}
			for(int i:array )
			{
				sum=sum+i;
			}
			System.out.println("Sum of 10 Array elements: "+sum);
			System.out.println("Average Sum of Array elements: "+(sum/array .length));
		}
	}
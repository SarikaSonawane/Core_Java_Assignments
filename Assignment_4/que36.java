//36.  Create a class MathOperation2 containing overloaded methods ‘multiply’ to calculate 
// multiplication of following arguments. 
// 	a.	 two integers 
// 	b.	 three floats 
// 	c.	 all elements of array 
// 	d.	one double and one integer 

import java.util.Scanner;
class MathOperation2
{
	
	void multiply(int num1, int num2)
	{
		int mul =num1 * num2;
		System.out.println("Multiplication of integers: " +mul);
	}
	
	void multiply(float num1, float num2, float num3)
	{
		float mul2 =num1 * num2 * num3;
		System.out.println("Multiplication of floats: " +mul2);
	}
	
	void multiply(int [] array)
	{
		int mul3 = 1;
		for(int x:array)
		{
			mul3 = mul3 * x;
		}
		System.out.println("Multiplication of all elements of array: " +mul3);
	}
	
	void multiply(double num1,int num2)
	{
		double mul4 = num2 * num1;
		System.out.println("Multiplication of integer and double: " +mul4);
	}
}

class que36
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		MathOperation2 obj = new MathOperation2();
		
		System.out.println("Enter two integers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		obj.multiply(num1,num2);
		
		System.out.println("Enter three decimals: ");

		float fnum1 = sc.nextFloat();
		float fnum2 = sc.nextFloat();
		float fnum3 = sc.nextFloat();

		obj.multiply(fnum1, fnum2, fnum3);
		

		int array_size;
		System.out.println("Enter how many elements you want to insert in Array: ");
		array_size = sc.nextInt();

		int array[] = new int[array_size];
		System.out.println("Enter Elements in Array: ");
		for(int i = 0; i < array.length; i++)
		{
			array[i] = sc.nextInt();
		}
		obj.multiply(array);
		
		System.out.println("Enter one decimal and one integer: ");

		double dnum1 = sc.nextDouble();
		int inum2 = sc.nextInt();

		obj.multiply(dnum1, inum2);
	}
}

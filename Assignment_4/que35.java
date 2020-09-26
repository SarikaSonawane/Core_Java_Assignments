//35.  Create a class MathOperation that has four static methods- 
// 	i)  add() method that takes two integer numbers as parameter and returns the sum of the numbers. 
// 	ii) subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. 
// 	iii) multiply() method that takes two integer numbers as parameter and returns the product. 
// 	iv) power() method that takes two integer numbers as parameter and returns the power of first number to second number. 

import java.util.Scanner;
import java.lang.Math;

class MathOperation
{
	
	int add(int num1, int num2)
	{
		int sum = num1 + num2;
		return sum;
	}
	
	int subtract(int num1, int num2)
	{
		int diff = num1 - num2;
		return diff;
	}
	
	int multiply(int num1, int num2)
	{
		int mul = num1 * num2;
		return mul;
	}
	
	double power(double num1, double num2)
	{
		double pow = Math.pow(num1, num2);
		return pow;
	}
}

class que35
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		MathOperation obj = new MathOperation();
		
		int sum = obj.add(num1, num2);
		System.out.println("Addition: " +sum);
		
		int diff = obj.subtract(num1, num2);
		System.out.println("Subtraction: " +diff);
		
		int mul = obj.multiply(num1, num2);
		System.out.println("Multiplication: " +mul);
		
		double pow = obj.power(num1, num2);
		System.out.println("Power: " +pow);
	}
}

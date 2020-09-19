// 10.	Write a program to convert temperature from Fahrenheit to Celsius. 
// 	Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]


	import java.util.Scanner;
	class que10
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter temperature in Fahrenheit: ");
			float fahrenheit = sc.nextFloat();
			float celsius = 5 * (fahrenheit - 32) / 9;
			System.out.print("Temperature in Celsius: "+celsius);
		}
	}
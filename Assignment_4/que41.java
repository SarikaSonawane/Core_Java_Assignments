//41.	Write a program to demonstrate this() construct functionality.

import java.util.Scanner;
class que41Demo
{
	int roll;
	String name;
	String city;
	
	 que41Demo(int roll, String name)
	{
		System.out.println("Parameterizes constructor with 2 Parameters");
		this.roll = roll;
		this.name = name;

		System.out.println("Name: " +this.name);
		System.out.println("Roll no: " +this.roll);	
		
	}
	
	 que41Demo(int roll,  String name,  String city)
	{		
		this(roll, name);
		System.out.println("Parameterizes constructor with 3 Parameters");
		System.out.println("Name: " +this.name);
		System.out.println("Roll no: " +this.roll);	
		System.out.println("City: " +city);
		
	}
}

class que41
{
	int roll;
	String name;
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Roll no: ");
		int roll = scan.nextInt();

		System.out.print("Enter Name: ");
		String name = scan.next();
		
		System.out.print("Enter City: ");
		String city = scan.next();
		
		 que41Demo s1 = new  que41Demo(roll, name, city);
	}
}

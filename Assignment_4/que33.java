//33.	Write a program to demonstrate functionalities of this keyword in java. 

import java.util.Scanner;

class que33Demo
{
	int roll;
	String name;
	String city;
	
	void setData(int roll, String name, String city)
	{
		this.roll = roll;
		this.name = name;
		this.city = city;
	}
	
	void showData()
	{
		System.out.println("Name: " + name);
		System.out.println("Roll no: " + roll);
		System.out.println("City: " + city);
	}
}

class que33
{
	int roll;
	String name;
	String city;
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Roll no: ");
		int roll = scan.nextInt();
		
		System.out.print("Enter Name: ");
		String name = scan.next();

		System.out.print("Enter City: ");
		String city = scan.next();

		que33Demo obj = new que33Demo();

		obj.setData(roll, name, city);
		obj.showData();
	}
}

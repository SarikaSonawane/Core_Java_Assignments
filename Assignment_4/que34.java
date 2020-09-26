//34.  Create a class Circle that has two data members, one to store the radius and another to store area 
// 	and three methods first init() method to input radius from user,
//     second calculateArea() method to calculate area of Circle 
// 	and third display() method to display values of radius and area. 
// 	Create class que34 ( main class) that creates the Circle object and 
//     calls init(), calculateArea() and display() methods.

import java.util.Scanner;

class Circle
{
	float radius;
	float area;
	
	void init(float radius)
	{
		this.radius = radius;
	}
	
	void calculateArea()
	{
		area = 3.14f * radius * radius;
	}
	
	void display()
	{
		System.out.println("Radius of Circle: " + radius);
		System.out.println("Area of Circle: " + area);
	}
}

class que34
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Radius of Circle: ");
		float radius = scan.nextFloat();

		Circle obj = new Circle();
		obj.init(radius);
		obj.calculateArea();
		obj.display();
	}
}

// 31.	Create a class que31 with 2 data members rno and name. 
// 	Create one method setData() that takes roll number and 
//     que31 name as parameter and stores them in data members rno and name. 
// 	Create one more method showData() to print the data member values. 
// 	Create another class ( main class) que31Demo that creates que31 class object 
//     and calls setData() and showData() methods.

import java.util.Scanner;

class que31Demo
{

	int rno;

	String name;

	
	void setData(int rno, String name)

	{

		this.rno = rno;

		this.name = name;

	}

	

	void showData()

	{

		System.out.println("Roll No: " +rno);

		System.out.println("Name: " +name);

	}

}



class que31

{

	public static void main(String[] args)

	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter roll no: ");

		int rno = scan.nextInt();

		System.out.println("Enter Name: ");

		String name = scan.next();

		

		que31Demo obj = new que31Demo();

		obj.setData(rno,name);

		obj.showData();

	}

}		


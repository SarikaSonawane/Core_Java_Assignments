	// 32.	Modify the above program (no. 31) to count the no of que32 objects created.
	//  [ In this program static variable is required ]

	import java.util.Scanner;

	class que32Demo1

	{

		int rno;

		String name;

		static int count = 0;

		

		que32Demo1()

		{

			count++;

		}

		

		void setData(int rno, String name)

		{

			this.rno=rno;

			this.name=name;

		}

		

		void showData()

		{

			System.out.println("Roll No.: "+rno);

			System.out.println("Name: "+name);

		}

	}



	class que32

	{

		public static void main(String[] args)

		{

			Scanner scan = new Scanner(System.in);

			System.out.println("Enter Roll Number: ");

			int rno = scan.nextInt();

			System.out.println("Enter Name: ");

			String name = scan.next();

			

			que32Demo1 obj = new que32Demo1();

			obj.setData(rno,name);

			obj.showData();

			

			que32Demo1 obj2 = new que32Demo1();

			que32Demo1 obj3 = new que32Demo1();

			que32Demo1 obj4 = new que32Demo1();

			que32Demo1 obj5 = new que32Demo1();

			que32Demo1 obj6 = new que32Demo1();

			

			System.out.println("Total objects: " +obj.count);

			

		}

	}	


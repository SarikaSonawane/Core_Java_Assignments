//38.  Create a class Employee with three data members (empNo, salary and totalSalary) 
// and following features.
// 	a.	Only parameterized constructor. [Do not overload the constructor]
// 	b.	totalSalary always represents salary total of all the employees created.
// 	c.	empNo should be auto incremented.
// 	d.	display total employees and totalSalary using a method.
// 	Create another class EmployeeDemo (main class) 
//    that creates some Employee objects and calls Employee method 
//    to display no. of employees and total of their salaries.

	import java.util.Scanner;

	class Employee
	{
		static int empno = 0;
		static float salary = 0;
		
		Employee(int salary)
		{
			empno++;
			this.salary+= salary;
		}
		
		void display()
		{
			System.out.println("Total Employee's: " +empno);
			System.out.println("Total salary: " +salary);
		}
	}

	class que38
	{
		public static void main(String[] args)
		{
			Employee obj1 = new Employee(25000);
			Employee obj2 = new Employee(35000);
			Employee obj3 = new Employee(45000);
			Employee obj4 = new Employee(75000);

			obj1.display();
		}
	}

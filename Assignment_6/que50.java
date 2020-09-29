// 50.	Explain the importance of toString() and equals() method of the Object class and override them on class Employee(empId,name,salary).  
// 	b. Display all employee info using toString method.

	
		package EmployeeDemoPack;

		class Employee
		{
			int empid;
			String name;
			public Employee(int empid, String name) 
			{
				super();
				this.empid = empid;
				this.name = name;
			}
			
		}
		public class Q50
		{
			public static void main(String[] args)
			{
				Employee e=new Employee(12324, "Snehal");
				System.out.println(e);
			}
		}
		
	
	//toString() METHOD WITH OVERRIDING:
		
		package EmployeeDemoPack;
		class Employee1
		{
			int empid;
			String name;
			public Employee1(int empid, String name) 
			{
				super();
				this.empid = empid;
				this.name = name;
			}
			
			public String toString()
			{
				return "Employee [empid=" + empid + ", name=" + name + "]";
			}
			
			
		}
		public class Q50A
		{
			public static void main(String[] args)
			{
				Employee1 e=new Employee1(089, "Sarika");
				System.out.println(e);
			}
		}





	// equals() METHOD WITHOUT OVERRIDING:
	
		package EmployeeDemoPack;
		class Person
		{
			int pid;
			String name;
			public Person(int pid, String name) 
			{	super();
				this.pid = pid;
				this.name = name;
			}
			
		}
		public class Q50B
		{
			public static void main(String[] args) 
			{
				Person p1=new Person(089, "Sarika");
				Person p2=new Person(090, "Shradha");
				Person p3=p2;
				System.out.println("p1 and p2 has Equal reference? =>"+p1.equals(p2));
				System.out.println("p1 and p3 has Equal reference? =>"+p2.equals(p3)); 
			}
		}




		// equals() METHOD OVERRIDING:
	
		package assignment7;
		class Person1
		{
			int pid;
			String name;
			public Person1(int pid, String name) 
			{	super();
				this.pid = pid;
				this.name = name;
			}
			public boolean equals (Object obj)
			{
				Person1 p=(Person1)obj;
				if(this.pid==p.pid && this.name==p.name)
				{
					return true;
				}
				return false;
			}
		}
		public class Q50C
		{
			public static void main(String[] args) 
			{
				Person1 p1=new Person1(089, "Sarika");
				Person1 p2=new Person1(090, "Shradha");
				Person1 p3=new Person1(091, "Shravani");
				Person1 p4=p2;
				
				System.out.println("p1 and p2 has Equal content? =>"+p1.equals(p2)); 
				System.out.println("p1 and p3 has Equal content? =>"+p1.equals(p3)); 
				System.out.println("p4 and p2 has Equal content? =>"+p2.equals(p4)); 
			}
		}
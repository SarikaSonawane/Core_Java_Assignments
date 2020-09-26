//40.  Create a class Student having data members name,  roll no.,  age and score. 
// 	Write a program to accept 10 records of student and store them in an array. 
//     And then arrange the student records based on the score group [0-50],  [50-65],  [65-80],  [80-100].


import java.util.Scanner;

class Student
{
	int roll_No, age;
	float score;
	String name;
	
	Student(int roll_No, String name, int age, float score)
	{
		this.roll_No = roll_No;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
}

class que40
{
	public static void main(String[] args)
	{	
		int roll_No, age;
		float score;
		String name;

		Scanner scan = new Scanner(System.in);
		Student s[] = new Student[10];

		Student test;
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Enter roll_No,  name,  age and score:");
			roll_No = scan.nextInt();
			name = scan.next();
			age = scan.nextInt();
			score = scan.nextFloat();
			
			Student s1 = new Student(roll_No, name, age, score);
			s[i] = s1;
			
		}
		
		System.out.println("Students who scored between ");
		System.out.println("[80-100]\t[65-80]\t\t[50-65]\t\t[45-50]");

		for(int i = 0; i<4; i++)
		{
			if(s[i].score >= 80 && s[i].score <= 100)
			{
				System.out.println("Roll: "+s[i].roll_No+"\nName: "+s[i].name+"\nAge: "+s[i].age+"\nScore: "+s[i].score+"%");
				System.out.println("---------------------------------------------------------");
			}

			if(s[i].score>= 65 && s[i].score<80)
			{
				System.out.println("\t\tRoll: "+s[i].roll_No+"\n\t\tName: "+s[i].name+"\n\t\tAge: "+s[i].age+"\n\t\tScore: "+s[i].score+"%");
				System.out.println("---------------------------------------------------------");
			}

			if(s[i].score >= 50 && s[i].score < 65)
			{
				System.out.println("\t\t\t\tRoll: "+s[i].roll_No+"\n\t\t\t\tName: "+s[i].name+"\n\t\t\t\tAge: "+s[i].age+"\n\t\t\t\tScore: "+s[i].score+"%");
				System.out.println("---------------------------------------------------------");
			}

			if(s[i].score >= 45 && s[i].score < 50)
			{ 
				System.out.println("\t\t\t\t\t\tRoll: "+s[i].roll_No+"\n\t\t\t\t\t\tName: "+s[i].name+"\n\t\t\t\t\t\tAge: "+s[i].age+"\n\t\t\t\t\t\tScore: "+s[i].score+"%");
			}

		}
		
	}
}	

// 15.	Accept person’s gender (character m for male and f for female), age (integer), as input 
// 	and then check whether person is eligible for marriage or not.


	import java.util.Scanner;
	class que15
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("If You are-male(press m) else for female(press f): ");
			char gender=sc.next().charAt(0);

			System.out.print("Enter your age: ");
			int age=sc.nextInt();

			if(gender == 'f' && age >= 18)
			{
				System.out.print("You are eligible for marriage!");
			}

			else if(gender == 'm' && age >= 22)
			{
				System.out.print("You are eligible for marriage!");
			}
			
			else
			{
				System.out.print("You are NOT eligible for marriage!");
			}
			
		}
	}
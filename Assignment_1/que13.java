// 13.	Program to find greatest in 3 numbers. 
// 	[ once using if else statement and then using ternary operator ( logical operator) ]  


	import java.util.Scanner;
	class que13
		{
			public static void main(String[] args)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter three numbers: ");
				int num1=scan.nextInt();
				int num2=scan.nextInt();
				int num3=scan.nextInt();
				
					//Using if-else
				if(num1>=num2&&num1>=num3)
					{
						System.out.println("Greatest number: "+num1);
					}
				else if(num2>=num1&&num2>=num3)
					{
						System.out.println("Greatest number: "+num2);
					}
				else
					{
						System.out.println("Greatest number: "+num3);
					}
					
						//Using Ternary operator
				int d=(num1>=num2&&num1>=num3)?num1:(num2>=num1&&num2>=num3)?num2:num3;
				System.out.println("Greatest number using ternary operator: "+d);
			}
			
		}
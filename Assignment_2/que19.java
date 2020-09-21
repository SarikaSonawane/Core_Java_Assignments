//19.	Calculate  series : 12+22+32+42+.........+n2


	import java.util.Scanner;
	class que19
	{
		public static void main(String[] args)
		{
			
			int sum = 0;

			System.out.println("Enter the number i.e. max value of the series: ");
			Scanner scan = new Scanner(System.in);
			int num=scan.nextInt();

			sum = (num * (num + 1) * (2 * num + 1)) / 6;

			System.out.println("Sum of the series : ");
			for (int i = 1; i <= num; i++) {
				if(i != num)
				{
					System.out.print(i+"^2 + ");
				}
				else {
					System.out.println(i+"^2 = "+sum);
				}
			}
		}
	}
//61.	Create a Thread class to print following star (*) pattern on screen with delay of 1 
//second between each * print. Number of lines in the pattern should be passed to the 
//constructor of Thread class.  *  * * * *  * * * * * * * * * * Use this class in main method 
//and ask user to enter number of lines to print.


package multithreading.com;
import java.util.*;


 class Demo4 implements Runnable
 
 {
	 
	 int lines;
	 
	 Demo4(int lines)
	 {
		 this.lines = lines;
		 
	 }
	 
	 
	public void run()
	
	{
		for(int i = 0 ; i<=lines ; i++)
		{
			try 
			
			{
				Thread.sleep(1000);
			} 
			
			catch (InterruptedException e)
			{

				 System.out.println(e);

			}
			
			System.out.print("*");
		}
		
	}
}

public class que61 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter how many lines you want");
		
		int line = scanner.nextInt();

		Demo4 d1 = new Demo4(line);
		
		Thread t1 = new Thread(d1);
		
		t1.start();
		
	}

}
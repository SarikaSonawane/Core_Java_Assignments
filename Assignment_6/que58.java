//58.	Store name of weekdays in an array (starting from “Sunday” at 0 index). Ask day 
//position from user and print day name. Handle array index out of bound exception and give 
//proper message if user enter day index outside range (0-6). 


package string.com;
import java.util.*;

public class Stringcount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String name = scanner.nextLine();
		
		int count = 0;
		
		int len = name.length();
		
		for(int i = 0 ; i<=len-1 ; i++)
		{
			count = count+1;
		}
		
		 System.out.println("Number of words in the String are = "+count);

	}

}
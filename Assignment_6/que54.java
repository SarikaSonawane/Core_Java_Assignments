// 54.	Write a program to reverse the given String.



package string.com;
import java.util.*;

public class StringEveryWord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the words");
		
		String name = scanner.nextLine();
		
		String arrayname[] = name.split(" ");
		
		String namereserved = "";
		
		int size = arrayname.length;
		
		
		for(int i = 0 ; i<size ; i++)
		{
			
			String temp = arrayname[i];
			
			String temprev = "";
			
			int len = temp.length();
			
            for(int j = len-1 ; j>=0 ; j-- )
            {
            	
            	temprev = temprev + temp.charAt(j);
            	
            }

            namereserved = namereserved + temprev + " " ;
			
		}
		
         System.out.println(namereserved);
		
	}

}
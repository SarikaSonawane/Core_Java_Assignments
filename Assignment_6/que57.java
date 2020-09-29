//57. Write a program to reverse every word of the String.

package string.com;
import java.util.*;

public class StringVowels {

	public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter the String = ");
      
      String name = scanner.nextLine();
      
      int len = name.length();
      
      int count = 0;
      
      for(int i = 0 ; i<=len-1 ; i++)
      {
    	  
    	  if(name.charAt(i)=='A' || name.charAt(i)=='O' || name.charAt(i)=='U' ||
    			  
    			  name.charAt(i)=='E'|| name.charAt(i)=='I' || name.charAt(i)=='a' ||
    			  
    			  name.charAt(i)=='o' || name.charAt(i)=='u' || name.charAt(i)=='e' ||
    			  
    			  name.charAt(i)=='i')
    	  {
    		  
    		    count = count+1;
    		  
    	  }
    	  
    	 
      }

        System.out.println("number of vowels are = "+count);

	}

}
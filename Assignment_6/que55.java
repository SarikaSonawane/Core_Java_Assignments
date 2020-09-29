//55. Write a program to count no of words in the String.

package string.com;
import java.util.*;

public class StringSplit {

	public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Enter the sequennce String");
     
      String temp = scanner.nextLine();
      
      int len = temp.length();
      
      String array[] = temp.split(",");
      
       int size = array.length;
      
      int sum = 0;
      
      int numarray[] = new int[size];
      
      for(int i = 0 ; i<array.length ; i++)
      {
    	  
    	  String var = array[i];
    	 
    	  numarray[i] = Integer.parseInt(var); 
    	  
      }
      
        for(int i = 0 ; i<numarray.length ; i++)
        {
        	sum = sum+numarray[i];
        }
        
          System.out.println("sum od split array is = "+sum);

	}

}
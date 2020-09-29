// 53.	Input data exactly in the following format, 
// and print sum of all integer values. “67, 89, 23, 67, 12, 55, 66”.   
// (Hint use String class split method and Integer class parseInt method) .


package com.exception;
import java.io.IOException;
import java.util.*;

  class Voter
  {
	 int voterid;
	 String name;
	 int age;
	  
	  Voter(int voterid,String name,int age)
	  {
		   this.voterid = voterid;
		   this.name = name;
		    this.age = age;
	  }
	  
	  void age1()throws IOException
	  {
		  if(age<=18)
		  {
			  throw new ArithmeticException("invalid age for voter");  
		  }
		  
		  else
		  {
			  System.out.println("Welcome to voter list");
		  }
	  }

	    
  }

public class ExceptionDemo2 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Enter voterid = ");
		 
		 int voter1 = scanner.nextInt();
		 
		 System.out.println("Enter Name = ");
		 
		 String name1 = scanner.next();
		 
		 System.out.println("Enter Age = ");
		 
		 int age1 = scanner.nextInt();

           Voter v1 = new Voter(voter1 , name1 , age1);
           
            v1.age1();
	}

}
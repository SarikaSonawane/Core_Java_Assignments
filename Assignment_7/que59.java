//59.	Create a class Voter(voterId, name, age) with parameterized constructor.  
//The parameterized constructor should throw a checked exception if age is less than 18.
//The message of exception is “invalid age for voter ” 


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
			  throw new ArithmeticException("Invalid age for voter");  
		  }
		  
		  else
		  {
			  System.out.println("Welcome to voter list");
		  }
	  }

	    
  }

public class que59 {

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
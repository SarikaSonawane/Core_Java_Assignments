//60.	Create Interface StudentFee and declare following method.  getFee() throws 
//InvalidFeeException. This method ask fees from user and throws exception if user enters 
//invalid or negative fees Create class Student with members (name, fees) and implement the 
//StudentFee Interface.


package com.exception;
import java.util.*;

     interface StudentFee 
{
    	 
    	void getFee();
	
}
     
    class Student implements StudentFee
    {
    	public void getFee()
    	{
    		Scanner scanner = new Scanner(System.in);
    		
    		String name = scanner.next();
    		
    		float fee = scanner.nextFloat();
    		
    		if(fee<0)
    		{
    			throw new ArithmeticException("Invalid FeeException");  
    		}
    		else
    		{
    			System.out.println("Fee is right = "+fee);
    		}
    	}
    }
     

public class que60 {

	public static void main(String[] args) {

		
		 StudentFee s1 = new Student();
		 
		 s1.getFee();
		 
	}
}
			

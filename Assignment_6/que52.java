// 52.	Input name of a person and count how many vowels it contains.  Use String class functions. 


package com.exception;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {

  try
  {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter length of String array");
		
		int size = scanner.nextInt();
		
		String arrayname[] = new String[size];
		 
		int count = 0;
		
		for(int i = 0 ; i <=arrayname.length ; i++)
		{
			System.out.println("Element at "+i+" index"+" = ");
			arrayname[i] = scanner.next();
			
		}
		
		
  }catch(ArrayIndexOutOfBoundsException ex)
  {
	  System.out.println("Check the length " + ex);
  }
		
	}

}

//63.	Write a program to count how many times character ‘t’ occurs in a file. 


package com.file;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class que63 {

	public static void main(String[] args) throws IOException {
		
		 String path = "C:\\Users\\hp\\Desktop\\check.txt";
		 
		 int count = 0;
		 
		 try {
			 
			FileReader file = new FileReader(path);
			
			int i ;
			
			while((i = file.read()) != -1)
			{
				
				if( i == 't')
				{
					count = count+1;
				}
					
				
			}
			
			System.out.println("T occurs in file is = " + count);
			
		} 
		 
		 catch (FileNotFoundException e) 
		 
		 {


			e.printStackTrace();
		}

		


	}

}
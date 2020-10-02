//64.   Write a program to count no of words in a text file and average word size.

import java.io.BufferedReader;  
import java.io.FileReader;  
   
public class que64  
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int count = 0;  
          
        
        FileReader file = new FileReader("C:\\Users\\dnyan\\Documents\\Programming\\Java\\Core\\Sample.txt");  
        BufferedReader br = new BufferedReader(file);  
              
          
        while((line = br.readLine()) != null) {  
             
            String words[] = line.split(" ");  
             
            count = count + words.length;  
        }  
          
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
    }  
} 
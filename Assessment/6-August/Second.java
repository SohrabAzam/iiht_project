package com.packk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try      
			{   
				int[] b=new int[10];
		 		b[11]=5;
		 }
		catch(ArrayIndexOutOfBoundsException e)   
			{  
				System.out.println("index bond 1"); 
				try    
				{  
					File file =new File("E://file.txt"); 
					FileReader fr=new FileReader(file);
		 
  				}
				catch(FileNotFoundException e1)   
				{  
					System.out.println("file exception");    
			}   }
	}
}


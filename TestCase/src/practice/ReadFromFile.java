package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class ReadFromFile
{
    
	public static boolean binarySearch(String ar[],String t) 
    {
		
			int left=0;
			int right=ar.length-1;
		
		
			while(left<=right) 
			{	int middle= left+(right-left)/2;
				if(ar[middle].equals(t))
					return true;
				if(t.compareToIgnoreCase(ar[middle])<0)
				right=middle-1;
				else
			    left=middle+1;
			}
		
			return false;
	
	}
	public static void main(String[] args) throws IOException 
	{      Scanner sc=new Scanner(System.in);
	     System.out.println("enter the word to search");
	     String t=sc.next();
		BufferedReader br= new BufferedReader(new FileReader("/home/admin1/Documents/new.txt"));
		String[] words=null;
		String content;
	
		  while((content=br.readLine())!=null)
		  {
			  words=content.split(" ");
		  }
		    	   
		    Arrays.sort(words);
		
		    		
		  for(int i=0;i<words.length;i++) 
		  {
			  System.out.println(words[i]);
		  }
		   
		      boolean rs= binarySearch(words,t);
		            
		       if(rs)
		    	   System.out.println("the word you searched for is found");
		       else
		    	   System.out.println("not found");
		      sc.close();
		      br.close();
		  }
	
			  
	}


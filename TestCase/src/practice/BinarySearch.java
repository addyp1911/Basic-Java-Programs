package practice;

import java.util.Scanner;

public class BinarySearch 
{
	static Scanner sc= new Scanner(System.in);
	public static int[] readArray() 
	{  
		
		System.out.println("enter the length of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) 
		{
			System.out.println("enter the element ");
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	
	public static void dispArray(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	
	public static boolean binarySearch(int b[])
{    	
     int left=0;
     int right=b.length-1;
   
     System.out.println("enter the number to search");
     int t=sc.nextInt();
    
      while(left<=right) 
      {  
    	  int m= left +(right-left)/2;
    	    if(b[m]==t)
    	         return true;
    	  if(t<b[m])
    		  right=m-1;
    	  else
    		  left=m+1;
      }
     
		
		return false;
}
	
	public static void main(String[] args) 
	{  
		System.out.println("enter an array of integers");
	       int ar[]= readArray();
		    dispArray(ar);
		  boolean rs= binarySearch(ar);
	
		  if(rs)
			  System.out.println("number is found");
		  else
			  System.out.println("number is not found");
		    
	} 
	
	
}

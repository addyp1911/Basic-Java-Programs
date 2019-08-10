package practice;

import java.util.Scanner;

public class InsertionSort 
{
   
	public static int[] insertionSort(int ar[]) 
	{
		for(int i=1;i<ar.length;i++) 
		{
			int key=ar[i];
			int j=i-1;
			while(j>=0 && ar[j]>key)
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
		return ar;
	}
	
	
	
	
	public static void main(String[] args)
	{
		  Scanner sc= new Scanner(System.in);
		  int ar[]= {23,34,45,12,31,9};
		  int rs[]=insertionSort(ar);
		  for(int i=0;i<rs.length;i++) {
			  System.out.print(rs[i]+ " ");
		  }
          
    }
}

package practice;

import java.util.Scanner;

public class PowerOf2 
{
	
	public static long pow(int k,int p) 
	{
		long pt=1;
		while(p>0) 
		{
			pt=pt*k;
			p--;
		}
		return pt;
	}
	
	
	
	
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the highest power of 2");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++) 
	{
		System.out.println(pow(2,i));
	}
	
	
	
	
}
}

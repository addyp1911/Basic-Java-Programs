package practice;

import java.util.Scanner;

public class HarmonicNumber
{
public static double calculateHarmonics(int num)
{   
    double sum=0;
	for(double i=1;i<=num;i++)
	{
		sum=sum+ 1/i;
	}
	return sum;
}	
	
	
	public static void main(String[] args) 
	{
	 Scanner sc= new Scanner(System.in);
	System.out.println("find the number whose harmonics you want to print");
	int n=sc.nextInt();
	   double result=calculateHarmonics(n);
	   System.out.println(result);
	   sc.close();
	}

}

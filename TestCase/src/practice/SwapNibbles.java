package practice;

import java.util.Scanner;

public class SwapNibbles 
{
public static int binToDec(int bin)
{ 
	int dec=0;
    int c=0;
	while(bin!=0) 
	{
		int r=bin%10;
		 dec= dec + r*pow(2,c++);
		  bin=bin/10;
	}
	return dec;

}

public static String decToBin(int dec)
{
          String bin="";
          while(dec!=0) 
          {
        	  int r=dec%2;
        	  bin= r+ bin;
        	  dec=dec/2;
          }
      return bin;

}

public static int pow(int k,int p) 
{
	int pt=1;
	while(p>0) 
	{
		pt=pt*k;
		p--;
	}
	return pt;
}

public static int swapNibbles(String bin) 
{  
	int n=bin.length();
  System.out.println(n);
	if(n<8) 
	{
		while(n!=8)
		{
			bin="0"+bin;
		        n++;                                                                                                                                         
	     }
	}
	System.out.println(bin);
  String s= bin.substring(4)+bin.substring(0,4);
  System.out.println("after swapping the nibbles"+ s);
     int i=Integer.valueOf(s);
     int j= binToDec(i);
     return j;
      
}

public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any decimal number");
	int dec=sc.nextInt();
	System.out.println("the binary equivalent is");
	  String bin= decToBin(dec);
	  System.out.println(bin);
	 long rs= swapNibbles(bin);
	 System.out.println("final decimal number is"+ rs);
	   sc.close();
}
}
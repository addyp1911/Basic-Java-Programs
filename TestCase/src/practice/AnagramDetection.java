package practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection
{
   public static boolean checkAnagram(String s1,String s2) 
   {   char ch1[]=s1.toCharArray();
	    Arrays.sort(ch1);
    char ch2[]=s2.toCharArray();
	    Arrays.sort(ch2);
	    if(Arrays.equals(ch1,ch2))
	   {
	    	return true;
	  }
	    else
	  return false;
	   
   }
   public static void main(String[] args) 
   {
	Scanner sc= new Scanner(System.in);
	   System.out.println("enter two strings");
	   String s1=sc.next();
	   String s2=sc.next();
	  boolean result= checkAnagram(s1,s2);
	     if(result)
	    	 System.out.println("the strings are anagrams");
	     else
	    	System.out.println("the strings are not anagrams");
	     
	     sc.close();
} 
}

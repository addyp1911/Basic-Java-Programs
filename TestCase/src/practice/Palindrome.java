package practice;
import java.util.*;
public class Palindrome {

	public static boolean isPrime(int n) 
	{
		for(int i=2;i<=n/2;i++) 
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	
	public static boolean isPalindrome(int n) {
		int t=n;
		int rev=0;
		while(n!=0) 
		{
			rev=rev*10 + n%10;
			n=n/10;
		}
		return rev==t;
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		for(int i=0;i<=1000;i++) 
		{
			if(isPrime(i))
			{
				if(isPalindrome(i))
					System.out.println(i);
			}
		}
		
	} 
	
}

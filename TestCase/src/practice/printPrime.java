package practice;
import java.util.*;
public class printPrime 
{
    	public static boolean isPrime(int num)
		{
			for(int i=2;i<=num/2;i++) 
			{
				if(num % i==0)
				{
					return false;
				}
			}
	      return true;
	    }
			
    	public static boolean isAnagram(int i,int j)
    	{
    		
    		String s1=String.valueOf(i);
    		String s2=String.valueOf(j);
    		char ch1[]=s1.toCharArray();
    		char ch2[]=s2.toCharArray();
    		   Arrays.sort(ch1);
    		   Arrays.sort(ch2);
    		  if(Arrays.equals(ch1, ch2))
    			  return true;
    		  else
    			  return false;
    		
    	}
			public static void main(String[] args) 
		    {	
	             Scanner sc= new Scanner(System.in); 
	             for(int i=1;i<=1000;i++) 
	             {
	            	 if(isPrime(i))
	            	 { 
	            		 for(int j=i+1;j<=1000;j++)
	 	            		  {
	 	            			  if(isAnagram(i,j)) 
	 	            			  {
	 	            				  System.out.println(i);
	 	            				  System.out.println(j);
	 	            			  }
	 	            		  }
	 	               }
	 	             
	              }
		    }
}

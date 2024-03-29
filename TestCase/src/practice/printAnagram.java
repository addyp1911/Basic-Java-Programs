package practice;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import practice.MyList.Node;
public class printAnagram
{
	public class Node
	{
	     int data;
		Node next;
		
		public Node(int data) 
		{
			this.data=data;
		}
		
	}
	Node head;
		
	public boolean add(int obj) {
		Node n= new Node(obj);
	
		if(head==null) 
		{
			head=n;
			return true;
		}
		else 
		{
			Node t=head;
			while(t.next!=null) 
			{
				t=t.next;
			}
			t.next=n;
			return true;
			
		}
	}
		
		public void display() 
		{
			Node t=head;
			while(t!=null) 
			{
				System.out.println(t.data + " ");
				t=t.next;
			}
		}
	   
		  public boolean isPrime(int n) 
		  {
			  for(int i=2;i<=n/2;i++)
			  {
				  if(n%i==0) 
				  {
					  return false;
				  }
			  }
			  return true;
		  }
	  
		  public boolean isAnagram(int p,int k) 
		  {  

			  String s1=String.valueOf(p);
			  String s2=String.valueOf(k);
			  char ch1[]=s1.toCharArray();
			  Arrays.sort(ch1);
			  char ch2[]=s2.toCharArray();
			  Arrays.sort(ch2);
			  return Arrays.equals(ch1, ch2);
			  
			  
		  }
		  
	
	public static void main(String[] args)
		  {
		printAnagram pa=new printAnagram();
         int k=0;
        int ar[]=new int[500];
		for(int n=1;n<=1000;n++)
		{
			if(pa.isPrime(n) && n>10) 
			{
			
				ar[k++]=n;
			}
		}
		
		for(int i=1;i<k;i++) 
		{   
			for(int j=i+1;j<k;j++) 
			{   
				if(pa.isAnagram(ar[i],ar[j])) 
				{
					{
						   System.out.println(ar[i]);
						   System.out.println(ar[j]);
					}
				     
				}
			}
		}
		
		pa.display();
	}
	
	
	
	
	
}
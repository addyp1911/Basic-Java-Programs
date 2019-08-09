package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class MyList<T extends Comparable<T>>
{
public class Node
{
	T data;
	Node next;
	public Node(T data) 
	{
		this.data=data;
	}
}
	Node head;
	
	public boolean addFirst(T s)
	{     
		Node n= new Node(s);
		if(head==null)
		{
			head=n;
			return true;
		}
		else
		{
			n.next=head;
			head=n;
		}
		return true;
	
	}
	public void sort(Node head) 
	{
		Node t=head;
		Node index=null;
		if(head==null)
		{
			return;
	    }
		else 
		{
			while(t!=null) 
			{
				index = t.next;
	
		     while(index!=null)
		  {
			   if((t.data).compareTo(index.data)>0)
			{
				T p=t.data;
				t.data=index.data;
				index.data=p;
				
			}
			index =index.next;
		  }
			t=t.next;
			
		   }	
			
		}
		Node k=head;
		while(k!=null) 
		{
	    System.out.print(k.data + " ");
	     k=k.next;
	    }
		System.out.println();
	}
		
		public void print() 
		{ 
			Node t=head;
			while(t!=null) 
			{
		    System.out.print(t.data + " ");
		     t=t.next;
		    }
			System.out.println();
		}



	public static void main(String[] args) throws FileNotFoundException 
	{  MyList<String> ml= new MyList<String>();
	String content = new String();
;
	BufferedReader reader = new BufferedReader(new FileReader("/home/admin1/Documents/Sample.txt"));
	String[] words=null;
	 


	 try {
		   while((content = reader.readLine())!= null)  
	       {
			  
			         words=content.split(" ");
			         
			         for(int i=0;i<words.length;i++) 
			         {  
			        	   ml.addFirst(words[i]);
			        	
			         }
			        
		   }
		   ml.print(); 
	 }
	catch(FileNotFoundException fnf)
	 {
	fnf.printStackTrace();
	}
	catch (Exception e)
	 {
	e.printStackTrace();

	   
	
	System.out.println("\nProgram terminated Safely...");

	
	System.out.println("the sorted list is");
		ml.sort(ml.head);
	 

}
	}
}



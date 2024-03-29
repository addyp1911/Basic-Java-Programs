package practice;

import java.util.*;
import java.io.*;
public class MyLinkedList 
{
 public class Node
 {
	 String data;
	 Node next;
	 
     public Node(String data) 
     {
    	 this.data=data;
	 
     }
 }
Node head;

public boolean addFirst(String s) 
{
	Node n= new Node(s);
if(head==null) 
{
	head=n;
	n.next=null;
	return true;
}
else {
	n.next=head;
     head=n;

}
return true;
}


public void printList() {
	Node currNode=head;
	while(currNode!=null) {
		System.out.print(currNode.data+" ");
		currNode=currNode.next;
	}
	System.out.println();
}
public String remove(String str) 
{ 
	Node t=head; 
	Node prev=null;
	if(head==null) 
	{
		System.out.println("list is empty");
	}
	else 
	{
		if(t!=null && t.data.equals(str)) {
			head=t.next;
			return t.data;
		}else {
			while((t!=null) && !(t.data.contains(str))) {
				prev=t;
				t=t.next;
			}
			if(t!=null) {
				prev.next=t.next;
				return t.data;
			}
			if(t==null) {
				addFirst(str);
			}
		}
	}
	return null;			

		
}
 
public static void main(String args[])throws IOException{
	Scanner sc= new Scanner(System.in);
String content = new String();
MyLinkedList ml=new MyLinkedList();
BufferedReader reader = new BufferedReader(new FileReader("/home/admin1/Documents/Sample.txt"));
String[] words=null;
 


 try {
	   while((content = reader.readLine())!= null)  
       {
		  
		         words=content.split(" ");
		         
		         for(String s:words) 
		         {
		        	   ml.addFirst(s);
		        	
		         }
		        
	   }
 }
catch(FileNotFoundException fnf)
 {
fnf.printStackTrace();
}
catch (Exception e)
 {
e.printStackTrace();
System.out.println("\nProgram terminated Safely...");
}


 ml.printList();

 System.out.println("enter the string to be searched");
 String str=sc.next();
 ml.remove(str);
 
 ml.printList();

	  

}
}

	 
	


package practice;
import java.util.*;
import java.io.*;

public class Sample1 {
public static void main(String args[])throws IOException{
		Scanner sc= new Scanner(System.in);
	String content = new String();
	BufferedReader reader = new BufferedReader(new FileReader("/home/admin1/Documents/Sample.txt"));
	String[] words=null;
	LinkedList<String> list = new LinkedList<String>();
	System.out.println("enter the string you want to search");
	String str=sc.next();
	
	
	
	 try {
		   while((content = reader.readLine())!= null)  
	       {
			  
			         words=content.split(" ");  //Split the word using space
			          for (String word : words) 
			          {
			        	  list.add(word);
			          }
			      }
	           
			 System.out.println(list);

		   }
	catch(FileNotFoundException fnf){
	fnf.printStackTrace();
	}
	catch (Exception e) {
	e.printStackTrace();
	}

	
	 ListIterator<String> it = list.listIterator();
	 while (it.hasNext())
	 {
	     String s = it.next();
	     if (s.equals(str)) 
	     {
	         it.remove();
	     }
	     else
	    	 {
	    	 it.add(str);
	    	 break;
	    	 }
	    	 

		}
	 System.out.println(list);
	   try
	   {
	     ObjectOutputStream out = new ObjectOutputStream(
	                                new FileOutputStream("add.txt"));
	     for (Iterator<String> itr=list.iterator();itr.hasNext();)
	    {               
	      out.writeObject(itr.next());
	    }
	    out.close();
	   } 
	   catch (Exception e1) 
	  {
	    e1.printStackTrace();
	  }
	}

}



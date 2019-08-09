package practice;
import java.util.*;
import java.io.*;
public class Sample {
  public static void read() throws Exception{
	  Scanner sc= new Scanner(System.in);
	FileReader fr= new FileReader("/home/admin1/Documents/Sample.txt");
	int i;
	while((i=fr.read())!=-1) {
		System.out.print((char)i);
	}
	sc.hasNextLine();
}
public static void main(String[] args) {
	try {
		Sample.read();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
}
}
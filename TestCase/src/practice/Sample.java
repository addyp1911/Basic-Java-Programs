package practice;
import java.util.*;
import java.io.*;
public class Sample {
public static void main(String[] args) {
	String s= "))))))))))()"; 
	Stack<Character> str= new Stack<>();
	int open=0,close=0;
    Stack<Character> sk = new Stack<Character>();

    for( char c : s.toCharArray())
    {
        if(c=='(') {
            sk.push(c);
            open++;
            }
        else if(c==')') {
            if(sk.isEmpty()==false) 
            {    sk.pop();
            }
            close++;
            }
    }

    if(open-close!=0)
        System.out.println("unbalanced ");
    else
        System.out.println("balanced");
    System.out.println(" count of balanced brace="+Math.min(open, close));
}
       
}

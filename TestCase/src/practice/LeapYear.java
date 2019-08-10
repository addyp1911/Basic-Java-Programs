package practice;
import java.util.Scanner;
public class LeapYear 
{
public static void main(String[] args) 
{
	System.out.println("enter the year ");
	Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
 String rs=((year%4==0) || (year % 400==0) && (year% 100!=0))?"the year is a leap year":"the year is not a leap year";
         System.out.println(rs);
         sc.close();
}
}

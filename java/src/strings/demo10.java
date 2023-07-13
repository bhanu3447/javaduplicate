package strings;

import java.util.Scanner;

public class demo10 
{
  public static void main(String[] args)
  {
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter a string");
	  String s1=scn.nextLine();
	  System.out.println("enter a string to be continued");
	  String s2=scn.nextLine();
	  
	  String s3=s1.replace(s2, "");
	  int count=s1.length()-s3.length();
	  count=count/s2.length();
	  System.out.println(s2+ " exist " +count+ " times ");
   }
}

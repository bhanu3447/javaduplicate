package strings;

import java.util.Scanner;

public class demo11
{
  public static void main(String[] args)
  {
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter a string");
	  String s1=scn.nextLine();
	  char c;
	  String s2;
	  while(s1.length()>0)
	  {
		  c=s1.charAt(0);
		  s2=s1.replace(c+"", "");
		  int count=s1.length()-s2.length();
		  System.out.println(c+"="+count);
		  s1=s2;
	  }
  }
}

package arrays;

import java.util.Scanner;

public class swapping_string 
{
  public static void main(String[] args) 
  {
    Scanner scn=new Scanner(System.in);
    System.out.println("enter 1 string");
	String s1=scn.next();
	System.out.println("enter 2 string");
	String s2=scn.next();
	s1=s1+s2;
	s2=s1.substring(0,s1.indexOf(s2));
	s1=s1.substring(s2.length());
	System.out.println(s1);
	System.out.println(s2);
  }
}

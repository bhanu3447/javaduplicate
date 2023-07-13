package strings;

import java.util.Scanner;

public class consecutive_characters 
{
  public static void main(String[] args)
  {
	Scanner scn= new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scn.next();
	char a[]=s1.toCharArray();
	String s2="";
	int i=0;
	while(i<a.length)
	{
		char c=a[i];
		i++;
		int count=1;
	while(i<a.length&&a[i]==c)
	{
		count++;
		i++;
	}
	s2+=c;
	s2+=count;
	
	}
	System.out.print(s2);
 }
	
}

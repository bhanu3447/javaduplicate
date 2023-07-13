package doublylinkedlist;

import java.util.Scanner;

public class reverse 
{
  public static void main(String[] args)
  {
	 System.out.println("enter a string");
	 Scanner scn=new Scanner(System.in);
	 String s1=scn.nextLine();
	 
	 String s2="";
	 
	 
	 char[] c = s1.toCharArray();
	int i=c.length-1;
	int j=c.length-1;
	
	while(j>0)
	{
	while(j>=0&&c[j]!=' ')j--;
	String t=" ";
	int k=j+1;
	while(k<=i)
	{
		t+=c[k];
		k++;
	}
	j--;
	i=j;
	s2+=t+" ";
	s2=s2.trim();
	}
	System.out.println(s2);
  }

}

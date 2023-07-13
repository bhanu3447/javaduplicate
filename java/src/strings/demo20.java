package strings;

import java.util.Scanner;

public class demo20 
{
   public static void main(String[] args) 
   {
	Scanner scn=new Scanner(System.in);
	String s1=scn.nextLine();
	String s2="";
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		if(s2.indexOf(ch)==-1) s2+=ch;
	}
	System.out.println(s2);
   }
}

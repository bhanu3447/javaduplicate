package Practice;

import java.util.Scanner;

public class A 
{ 
 public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String s=scn.nextLine();
	String[] split = split(s);
	for(String a:split)
	{
		System.out.println(a);
	}

}
 public static String[] split(String s)
 {
	 int spaces=0;
	 for(int i=0;i<s.length();i++)
	 {
		 if(s.charAt(i)==' ') spaces++;
	 }
	 String []split=new String[spaces+1];
	 String s2="";
	 int index=0;
	 for(int i=0;i<s.length();i++ )
	 {
		 if(s.charAt(i)==' ') 
			 {
			 split[index]=s2;
			 s2="";
			 }
		 else 
			 {
			    s2+=s.charAt(i);
			 }
	 }
	 return split;
 }
}

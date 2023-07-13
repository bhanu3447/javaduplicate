

import java.util.Scanner;

public class StringLengthWIthoutInbuilt
{
  public static void main(String[] args) 
  {
	    Scanner sc=new Scanner(System.in);
	    
	    String s=sc.next();
		Scanner scn=new Scanner(s);
		scn.useDelimiter("");
		int count=0;
		while(scn.hasNext())
		{
		
			scn.next();
			count++;
		}
		System.out.println(count);
		
		
//	String s="my name is d bhanu prakash";
//	Scanner scn=new Scanner(s);
//	int count=0;
//	while(scn.hasNext())
//	{
//		System.out.println(scn.next());
//		count++;
//	}
//	System.out.println(count);
  }
}

package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class s 
{
  public static void main(String[] args) 
  {
	  
//	  enter a string   ..internally uses regex to split at space
//	  my name is bhanu
//	  my
//	  name
//	  is
//	  bhanu
//	Scanner s=new Scanner(System.in);
//	System.out.println("enter a string");
//	String l = s.nextLine(); 
//	Scanner scn=new Scanner(l); 
//	
//	while(scn.hasNext())
//	{
//		System.out.println(scn.next());
//	}
	  
	  
//	  enter a string
//	  madam
//	  madamis a palindrome

//	  Scanner s=new Scanner(System.in);
//		System.out.println("enter a string");
//		String l = s.nextLine(); 
//		Scanner scn=new Scanner(l); 
//		scn.useDelimiter("");
//		String s2="";
//		while(scn.hasNext())
//		{
//			String next = scn.next();
//			s2=next+s2;
//		}
//		if(s2.equals(l)) System.out.println(l+"is a palindrome");
//		else System.out.println(l+"is not a palindrome");
	  
	  
	  
//	  
//	  enter a string
//	  banana
//	  [a, b, n]
//	  [a, b, n]
//
	  Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String l = s.nextLine(); 
		Scanner scn=new Scanner(l); 
		scn.useDelimiter("");
//		
		Set<String> se = new LinkedHashSet();
		String s2="";
		while(scn.hasNext())
		{
			se.add(scn.next());
		}
		StringBuilder sa = new StringBuilder();
		for(String ss:se)
		{
			sa.append(ss);
		}
		System.out.println(sa);
		
		
		String string = se.toString();
		System.out.println(string);
		System.out.println(se);
  }
}
	  
	  
	  
	  
//	  enter a string
//	  my name is d bhanu prakash
//	  26
///
//enter a string
//my name is d bhanu prakash
//21

//	  Scanner s=new Scanner(System.in);
//		System.out.println("enter a string");
//		String l = s.nextLine(); 
//		Scanner scn=new Scanner(l); 
//		scn.useDelimiter("");
//		
//	    int c=0;
//		while(scn.hasNext())
//		{
//			String next = scn.next();
//			if(!next.equals(" "))c++;
//		}
//		System.out.println(c);

	  
	  
	  
	  
//	  enter a string
//	  my name is bhanu prakash
//	  my 2
//	  name 4
//	  is 2
//	  bhanu 5
//	  prakash 7

//	  Scanner s=new Scanner(System.in);
//		System.out.println("enter a string");
//		String l = s.nextLine(); 
//		Scanner scn=new Scanner(l); 
//
//		while(scn.hasNext())
//		{
//			String next = scn.next();
//			    int count = count(next);
//			    
//			    System.out.println(next+ " " +count);
//		}
//		
//
//	 
//  }
//  public static int count(String s)
//  {
//	Scanner scn=new Scanner(s); 
//	scn.useDelimiter("");
//    int c=0;
//	while(scn.hasNext())
//	{
//		String next = scn.next();
////		
//c++;
//	}
//	return c;
//  }
//}

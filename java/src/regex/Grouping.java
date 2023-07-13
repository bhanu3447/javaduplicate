package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grouping 
{
	
	public static void main(String[] args) 
	   {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scn.next();
		
		Pattern p=Pattern.compile("([a-z])\\1*");
		Matcher m = p.matcher(str);
		
		String s2="";
		while(m.find())
		{
			String temp=m.group();
			s2=s2+temp.charAt(0)+temp.length();
		}
		System.out.println(s2);
	   }
}

//	public static void main(String[] args) 
//	   {
//		Pattern p=Pattern.compile("([a-z]+)\\1+");
//		Matcher m = p.matcher("banana");
//		
//		while(m.find())
//		{
//			System.out.println(m.group());
//		}
//	   }
//}


//	public static void main(String[] args) 
//	   {
//		Pattern p=Pattern.compile("([a-z])\\1+");
//		Matcher m = p.matcher("aaaaabbbcddc");
//		
//		while(m.find())
//		{
//			System.out.println(m.group());
//		}
//	   }
//}
	
//	public static void main(String[] args) 
//	   {
//		Pattern p=Pattern.compile("([a-z])([0-9])(\\1|\\2)");
//		Matcher m = p.matcher("a2aa22a333");
//		
//		while(m.find())
//		{
//			
//			System.out.println(m.group());
//		}
//	   }
//}
	
//	  public static void main(String[] args) 
//	   {
//		Pattern p=Pattern.compile("([a-z])\\1");
//		Matcher m = p.matcher("aaabbaa");
//		
//		while(m.find())
//		{
//			System.out.println(m.group());
//		}
//	   }

//	public static void main(String[] args) 
//	{
//		Pattern p=Pattern.compile("([a-z])([0-9])\\1");
//		Matcher m = p.matcher("a1ab2ba33");
//		
//		while(m.find())
//		{
//			System.out.println(m.group());
//		}
//	}
//}
	
 
	
	


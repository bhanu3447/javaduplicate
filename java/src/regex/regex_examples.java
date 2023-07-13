package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_examples 
{
	public static void main(String[] args) 
	 {
	
			 Pattern p=Pattern.compile("a.*");
				Matcher m=p.matcher("acabcabbc&*$@##");
				int count=0;
				while(m.find())
				{
					count++;
					System.out.println("start="+m.start());
					System.out.println("end="+m.end());
					System.out.println("group="+m.group());
					System.out.println("the total no of occurences="+count);
					System.out.println("*************************************");
				} 
//		 Pattern p=Pattern.compile("ab?c");
//			Matcher m=p.matcher("acabcabbc");
//			int count=0;
//			while(m.find())
//			{
//				count++;
//				System.out.println("start="+m.start());
//				System.out.println("end="+m.end());
//				System.out.println("group="+m.group());
//				System.out.println("the total no of occurences="+count);
//				System.out.println("*************************************");
//			} 
	
//	public static void main(String[] args) 
//	 {
//		 Pattern p=Pattern.compile("ab+c");
//			Matcher m=p.matcher("acabcabbc");
//			int count=0;
//			while(m.find())
//			{
//				count++;
//				System.out.println("start="+m.start());
//				System.out.println("end="+m.end());
//				System.out.println("group="+m.group());
//				System.out.println("the total no of occurences="+count);
//				System.out.println("*************************************");
//			} 
	
// public static void main(String[] args) 
// {
//	 Pattern p=Pattern.compile("ab*c");
//		Matcher m=p.matcher("acabcabbc");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		} 
		
//	  Pattern p=Pattern.compile("ab{2,}c");
//		Matcher m=p.matcher("abcabbcabbbcabc");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		} 
	 
//	 Pattern p=Pattern.compile("ab{2,4}c");
//		Matcher m=p.matcher("abbcabbbcabbbbcabcabbbbbc");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		} 
	 
//	 
//	    Pattern p=Pattern.compile("^ada");
//		Matcher m=p.matcher("aaa2da99j2d3ma3");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		} 
	 
//	    Pattern p=Pattern.compile(".");
//		Matcher m=p.matcher("a2H");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		} 
	 
//	    Pattern p=Pattern.compile("a[2#$%*]");
//		Matcher m=p.matcher("a*d9j$a23m3");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//			
//		} 
		
//	 Pattern p=Pattern.compile("[a-d][0-9]");
//		Matcher m=p.matcher("a2d9j23c3");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		} 
	 
//	 Pattern p=Pattern.compile("[ad][0-9]");
//		Matcher m=p.matcher("a2d9j23m3");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		} 
	 
//	 Pattern p=Pattern.compile("a[0-9]");
//		Matcher m=p.matcher("a29j23m3");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		} 
	 
	 
//	 Pattern p=Pattern.compile("[0-9][0-9]");
//		Matcher m=p.matcher("av29j23m3");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		}
		
//		Pattern p=Pattern.compile("[a-z A-Z]");
//		Matcher m=p.matcher("acQM");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		}
		
		
//		Pattern p=Pattern.compile("[a-z]");
//		Matcher m=p.matcher("acQM");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		}
		
	 
//	 Pattern p=Pattern.compile("[abc]");
//		Matcher m=p.matcher("a1bcda6");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		}
	 
//	 
//	 Pattern p=Pattern.compile("[^abc]");
//		Matcher m=p.matcher("a1bcda6");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		}
		
//	 Pattern p=Pattern.compile("[^abc]");
//		Matcher m=p.matcher("a1bcda6");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		}
//		

//	 Pattern p=Pattern.compile("[0-9]");
//		Matcher m=p.matcher("a1bcda6");
//		int count=0;
//		while(m.find())
//		{
//			count++;
//			System.out.println("start="+m.start());
//			System.out.println("end="+m.end());
//			System.out.println("group="+m.group());
//			System.out.println("the total no of occurences="+count);
//			System.out.println("*************************************");
//		}
		

//	Pattern p=Pattern.compile("a");
//	Matcher m=p.matcher("a1bcda6");
//	int count=0;
//	while(m.find())
//	{
//		count++;
//		System.out.println("start="+m.start());
//		System.out.println("end="+m.end());
//		System.out.println("group="+m.group());
//		System.out.println("the total no of occurences="+count);
//		System.out.println("*************************************");
//	}
	
	
 }
}

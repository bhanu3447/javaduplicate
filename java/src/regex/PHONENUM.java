package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PHONENUM
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter phone number");
		String  phonum=scn.next();
		
//		String re ="[6-9][0-9]{9}";
//		String re ="0?[6-9][0-9]{9}";
		String re ="0?|91[6-9][0-9]{9}";
		Pattern p=Pattern.compile(re);
		Matcher m = p.matcher(phonum);
		
		if(m.matches())  System.out.println("valid");
		else System.out.println("invalid");
	
	}
}
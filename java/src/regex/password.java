package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class password
{
	public static void main(String[] args) 
		
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter password");
		String  password=scn.next();
		
		String re ="(?=.*[!@#$&*])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{5,8}";
		Pattern p=Pattern.compile(re);
		Matcher m = p.matcher(password);
		
		if(m.matches())  System.out.println("valid");
		else System.out.println("invalid");	
	}
}
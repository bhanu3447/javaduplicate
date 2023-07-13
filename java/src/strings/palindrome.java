package strings;

import java.util.Scanner;

public class palindrome
{
	public static boolean palindrome(String s)
	{
		char[]c=s.toLowerCase().toCharArray();
		int i=0,j=c.length-1;
		while(i<j)
		{
			if(c[i]!=c[j]) return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		System.out.println(palindrome(s));
		
	}

}

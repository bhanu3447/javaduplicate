package strings;

import java.util.Scanner;

public class demo5 
{
  public static void main(String[] args) 
  {
	  Scanner scn=new Scanner(System.in);
	  String s=scn.next();
	  for(int i=0; i<s.length()-1; i++)
	  {
		  for(int j=i+2;j<=s.length();j++)
		  {
			  String s1=s.substring(i,j);
			  if(isPalindrome(s1))
				  System.out.println(s1);
		  }
	  }
	  
  }
  static boolean isPalindrome(String s)
  {
	  s=s.toLowerCase();
	  int i=0;
	  int j=s.length()-1;
	  while(i<j)
	  {
		if(s.charAt(i)!=s.charAt(j))
			return false;
		i++;
		j--;
	  }
	  return true;
  }
}

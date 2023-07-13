package practice;

import java.util.Scanner;

public class stringruf
{
  public static void main(String[] args)
  {
	Scanner scn=new Scanner(System.in);
	String s = scn.nextLine();
	if(ispalindrome(s)) System.out.println("yes");
	else System.out.println("not a palindrome");
  }

	public static boolean ispalindrome(String s)
	{
	int i=0;
	int j=s.length()-1;
	while(i<=j)
	{
		if(s.charAt(i)!=s.charAt(j)) return false;
		i++;
		j--;
		}
	return true;

  }
}

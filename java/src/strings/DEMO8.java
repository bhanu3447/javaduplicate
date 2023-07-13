package strings;

import java.util.Scanner;

public class DEMO8 
{
	public static void main(String[] args) 
	{
	  Scanner scn=new Scanner(System.in);
	  String s=scn.next();
	  char []a=s.toCharArray();
	  int sum=0;
	  int count=0;
	  for(char c:a)
	  {
		  if(c>='0'&&c<='9') 
			  {
			  count++;
			  sum+=(c-'0');
			  }
	  }
	  System.out.println(count);
	  System.out.println("sum="+sum);
	}
}
	  
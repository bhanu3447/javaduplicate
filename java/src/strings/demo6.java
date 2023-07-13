package strings;

import java.util.Scanner;

public class demo6 
{
	public static void main(String[] args)
	{
		 Scanner scn=new Scanner(System.in);
		  String s=scn.next();
		  char a[]=s.toLowerCase().toCharArray();
		  int count=0;
//		  for(int i=0;i<=s.length()-1;i++)
//		  {
//			  char c=s.charAt(i);
//			  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//			  {
//				  count++;
//				  System.out.println(c);
//			  }
//		  }
		  for(char c:a)
		  {
			  switch(c)
			  {
			    case 'a':
			    case 'e':
			    case 'i':
			    case 'o':
			    case 'u':count++;
			    System.out.println(c);
			  }
		  }
		  System.out.println("no of vowels"+count);
				  
	}

}

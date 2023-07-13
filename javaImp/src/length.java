

import java.util.Scanner;

public class length 
{
  public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String s=scn.nextLine();
	char[] charArray = s.toCharArray();
	int count=0;
	for(char a:charArray)
	{
		count++;
	}
	System.out.println(count);
}
}

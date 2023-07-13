package exception;

import java.util.Scanner;

public class parseint 
{
	public static void main(String[] args) 
  {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter number");
	
      int n=scn.nextInt();
	  System.out.println(n);  
	
	
	
//	int n=0;
//	while(true)
//	{
//		try
//		{
//			String s=scn.nextLine();
//			n=Integer.parseInt(s);
//			break;
//		}catch(NumberFormatException E)
//		{
//			System.out.println("wrong input .please enter a number");
//		}
//	}
	System.out.println("n="+n);
	
	
	
  }
}
	
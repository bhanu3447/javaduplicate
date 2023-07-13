package basics;

import java.util.Scanner;

public class basicsproblems 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
     	System.out.println("enter a number");
     	int num=scn.nextInt();
     	int a=0,b=1,c;
     	while(b<=num)
     	{
     		
     		c=a+b;
     		System.out.println(a);
         	a=b;
         	b=c;
     	}
	}
}
     	
     	
     			
     	
     	
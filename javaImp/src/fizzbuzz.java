import java.util.Scanner;

public class fizzbuzz 
{
  public static void main(String[] args)
  {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	int n1=scn.nextInt();
	System.out.println("enter a number");
	int n2=scn.nextInt();
	
	int a[]= {10,11,12,13,14,15,16,17,18,19,20};
	
	String[]s=new String[a.length];
	for(int i=0;i<a.length;i++)
	{
	  if(a[i]%3==0&&a[i]%5==0) s[i]="fizz buzz";
	  else if(a[i]%3==0) s[i]="fizz";
	  else if(a[i]%5==0) s[i]="buzz";
	  else s[i]=a[i]+"";	
	  }
	


	for(String p:s)
	{
		System.out.println(p);
	}
  }
}

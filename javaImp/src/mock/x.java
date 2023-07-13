package mock;

import java.util.Scanner;

public class x 
{
  public static void main(String[] args)
  {
	  Scanner Scn=new Scanner(System.in);
	  int n=Scn.nextInt();
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=n;j++)
		  {
			  if(i==j||j==n+1-i) System.out.print(j);
			  else System.out.print(" ");
		  }
		  System.out.println();
	  }
  }
}

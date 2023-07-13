import java.util.Scanner;

public class a 
{
  public static void main(String[] args) 
  {
	 Scanner scn=new Scanner(System.in);
	 int a[]= {5,2,1,3,4,0,8,7,2};
	 int b[]=new int[a.length];
	 int sum=0;
	 for(int i=0;i<=a.length;i++)
	 {
		 sum+=a[i];
		
		 b[i]=sum;
	 }
	 System.out.println(b[7]);
}
}

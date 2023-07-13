import java.util.Arrays;
import java.util.Scanner;

public class startinglastIndexArray
{
 public static void main(String[] args)
 {
	 Scanner scn=new Scanner(System.in);
	 System.out.println("enter a number");
	 int n=scn.nextInt();
	int a[]= {1,2,4,4,4,3,3,7,7};
	Arrays.sort(a);
	
	String startIndex="";
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]==n) 
    		{
    		startIndex=i+"" ;
    		break;
    		}
    	
    }
    String lastIndex="";
    for(int i=a.length-1;i>=0;i--)
    {
    	if(a[i]==n) 
    	{
    		lastIndex=i+"";
    		break;
    	}
    }
    System.out.println("startindex :"+startIndex+" and "+"lastindex :"+lastIndex);;
 }
}

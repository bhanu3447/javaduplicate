import java.util.Arrays;
import java.util.Scanner;

public class sortingBanana
{
  public static void main(String[] args) 
  {
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter string");
	  String s=scn.nextLine();
//	  System.out.println("before"+" "+s);
//	  s= sort(s);
//	  System.out.println("after"+" "+s);
	  
	  System.out.println("unSorted string: " + s);
	  s = sortInbuilt(s);
	  System.out.println("Sorted string: " + s);

	
  } 
  
  public static String sort(String s)
  {
	  char[] c = s.toLowerCase().toCharArray();
	  for(int i=0;i<s.length();i++)
	  {
		  boolean flag=false;
		  for(int j=0;j<s.length()-1-i;j++)
		  {
			  if(c[j]>c[j+1])
			  {
				  char temp=c[j];
				  c[j]=c[j+1];
				  c[j+1]=temp;
				  flag=true;
			  }
		  }
		  if(flag==false) break;
	  }
	  return new String(c);
  }
  
  
  public static String sortInbuilt(String s)
  {
	  char[] c = s.toUpperCase().toCharArray();
	  Arrays.sort(c);
	  return new String(c);
  }
}

import java.util.Scanner;

public class RotatingString 
{
  public static void main(String[] args) 
  {
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter 1 string");
	  String s1=scn.nextLine();
	  System.out.println("enter 2 string");
	  String s2=scn.nextLine();
	  
	 boolean rotatingString = rotatingString(s1, s2);
	 System.out.println(rotatingString);
	
  }
  public static boolean rotatingString(String s1,String s2)
  {
	  if(s1.length()!=s2.length()) return false;
	  
	  
	  for(int i=0;i<s2.length();i++)
	  {
		  s2=s2.substring(1)+s2.charAt(0);
		  if(s2.equals(s1)) return true;
	  }
	  return false;
	  
//	   char[] c = s2.toLowerCase().toCharArray();
//	   
//	   for(char i=0;i<c.length;i++)
//	   {
//		   int j=c.length-1;
//		   char temp=c[i];ss
//		   c[i]=c[j];
//		   c[j]=temp;
//		   
//		   String rotated = new String(c);
//		   if(rotated.equals(s1)) return true;
//	   }
//	return false;
	  
  }
 
}

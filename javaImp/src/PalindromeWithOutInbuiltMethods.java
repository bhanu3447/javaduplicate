import java.util.Scanner;

public class PalindromeWithOutInbuiltMethods 
{
  public static void main(String[] args) 
  {
	 Scanner scn=new Scanner(System.in);
	 String s=scn.nextLine();
	 Scanner sc=new Scanner(s);
	 
	 sc.useDelimiter("");
	 int count=0;
	 while(sc.hasNext())
	 {
		 sc.next();
		 count++;
	 }
	 System.out.println(isPalindrome(s, count));
}
  public static boolean isPalindrome(String s,int n)
  {
	  if(s==null||s.isEmpty()) return true;
	  int i=0;
	  int j=n-1;
	  
	  byte[] b = s.getBytes();
	  
	  for(byte d:b)
	  {
		  System.out.println(d);
	  }
	  while(i<j)
	  {
		  if(b[i]!=b[j]) return false;
		  i++;
		  j--;
	  }
	  return true;
  }
}

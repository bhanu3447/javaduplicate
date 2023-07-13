import java.math.BigInteger;
import java.util.Scanner;

public class rgs 
{
  public static void main(String[] args) 
  {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	String s=scn.nextLine();
	BigInteger input1=new BigInteger(s);
	System.out.println("enter a number");
	String input2=scn.nextLine();
	
	
	String secretKeyGenerator = secretKeyGenerator(input1, input2);
	System.out.println(secretKeyGenerator);

  }
  
  public static String secretKeyGenerator(BigInteger input1,String input2)
  {
	  StringBuilder sb=new StringBuilder();
	  
	  String s1 = input1.toString();
	  
	  int index1=0;
	  int index2=input2.length()-1;
	  
	  
	  while(index1<s1.length())
	  {
		  int i=0;
		  boolean even=false;
		  
		  while(index1<s1.length()&&!even)
		  {
			  int digit=Character.getNumericValue(s1.charAt(index1));
			  i+=digit;
			  index1++;
			  
			  if(i%2==0) even=true;
		  }
		  
		  if(index2>=0)
		  {
			  char a=input2.charAt(index2);
			  sb.append(i).append(a);
			  index2--;
		  }
	  }
	  return sb.toString();
	  
  }
  
}


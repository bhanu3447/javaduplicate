import java.util.Scanner;
class SwappingWithoutVariable
{
	public static void main(String[] args) 
	{
	   Scanner scn=new Scanner(System.in);
	   System.out.println("Enter the value of X and Y");  
       int x = scn.nextInt();  
       int y = scn.nextInt(); 
       System.out.println("before swapping numbers: "+x +"  "+ y);   
       x=x+y;
	   y=x-y;
	   x=x-y;
       System.out.println("After swapping: "+x +"   " + y);  
	}
}

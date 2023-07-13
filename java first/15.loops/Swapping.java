import java.util.Scanner;
class Swapping
{
	public static void main(String[] args) 
	{
	   Scanner scn=new Scanner(System.in);
	   System.out.println("Enter the value of X and Y");  
       int x = scn.nextInt();  
       int y = scn.nextInt(); 
	   int z;
       System.out.println("before swapping numbers: "+x +"  "+ y);   
       z=x;
	   x=y;
	   y=z;
       System.out.println("After swapping: "+x +"   " + y);  
	}
}

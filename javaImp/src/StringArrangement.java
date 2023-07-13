import java.util.Arrays;
import java.util.Scanner;

public class StringArrangement 
{
	  
//	  public static void main(String[] args)
//	  {
//		  Scanner scn = new Scanner(System.in);
//		    System.out.println("Enter a string:");
//		    String s = " mmmmmmmmmmmm iii ii aa hhhhhh ii i mmmm";
//		    
		  
	  
//		    Scanner scn = new Scanner(System.in);
//		    System.out.println("Enter a string:");
//		    String s = " mmmmmmmmmmmm iii ii aa hhhhhh ii i mmmm";
//
//		    String[] a = s.split(" "); // Split into individual characters
//
//		    for (String z : a) {
//		        System.out.println(z);
//		    }
//
//		    for (int i = 0; i <a.length - 1; i++) {
//		        for (int j = 0; j < a.length-1 - i; j++) {
//		        	if(a[j].length()==a[j+1].length())
//		        	{
//		        		
//		        	}
//		            if (a[j].length() > a[j + 1].length()) {
//		                String temp = a[j];
//		                a[j] = a[j + 1];
//		                a[j + 1] = temp;
//		            }
//		        }
//		    }
//		    Arrays.sort(a);
//
//		    // Print the sorted characters
//		    System.out.println("Sorted characters:");
//		    for (String z : a) {
//		        System.out.println(z);
//		    }
//		}
	
	public static void main(String[] args)
	  {
		  Scanner scn = new Scanner(System.in);
//		    System.out.println("Enter a string:");
		    String s = "mmmmmmmmmmmm iii ii aa hhhhhh ii i mmmm";
		    
		    String[] a = s.split(" ");
		    Arrays.sort(a);
		    
		    for(String c:a)
		    {
		    	System.out.println(c);
		    }
		    System.out.println("*****************************");
		    for (int i = 0; i <a.length - 1; i++) {
		        for (int j = 0; j < a.length-1 - i; j++) {
		        	
		            if (a[j].length() > a[j + 1].length()) {
		                String temp = a[j];
		                a[j] = a[j + 1];
		                a[j + 1] = temp;
		            }
		        }
		    }
		    for(String c:a)
		    {
		    	System.out.println(c);
		    }
	  }
}
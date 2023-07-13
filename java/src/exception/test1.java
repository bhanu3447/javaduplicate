package exception;

import java.util.Scanner;

public class test1
{   
    //function to check if person is eligible to vote or not   
    public static void validate(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[])
    {  
       Scanner scn=new Scanner(System.in);
       System.out.println("enter  a number");
       
        while(true)
    	{
        	try
        	{
        		int y=scn.nextInt();
                validate(y); 
                System.out.println("rest of the code..."); break;
        	}catch(Exception e)
        	{
        		System.out.println("wrong input");
        	}
         
    	}
           
  }    
}    
package exception;

import java.util.Scanner;

class insufficientbalexception extends Exception
{
 public insufficientbalexception()
 {
	 super("less balance");
 }
 public insufficientbalexception(String s)
 {
	 super(s);
 }
 
}





package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter 
{
  public static void main(String[] args) throws IOException
  { 
	  FileWriter f=new FileWriter("abc.txt");
	  f.write(100);
	  f.write("bhanu \n is a very good boy");
	  f.write('\n');
	  char []ch= {'a','b','c'};
	  f.write(ch);
	  f.write('\n');
	  f.flush();
	  f.close();
	  
  }
}

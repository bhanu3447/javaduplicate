package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader
{
  public static void main(String[] args) throws IOException
  {
//	FileReader f=new FileReader("abc.txt");
//    int i=f.read();
//    
//    while(i!=-1)
//    {
//    	System.out.print((char)i);
//    	i=f.read();
//    }
	  
	  File f=new File("abc.txt");
	  char ch[]=new char[(int)f.length()];
	  FileReader f1=new FileReader(f);
	  f1.read(ch);
	  for(char s:ch)
	  {
		  System.out.print(s);
	  }
	  
  }
}

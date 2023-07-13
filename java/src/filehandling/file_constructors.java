package filehandling;

import java.io.File;
import java.io.IOException;

public class file_constructors
{
  public static void main(String[] args) throws IOException
  {
//	File f=new File("bhanu.txt");
//	f.createNewFile();
	  
	  File f=new File("D:\\bhanu\\durga123");
	  f.mkdir();
//	  File f1=new File("durga123","abc.txt");
	  File f1=new File(f,"abc.txt");
	  f1.createNewFile();
	  
	  
//	  File f=new File("D:\\bhanu","demo.txt");
//	  f.createNewFile();
//	  System.out.println(f.exists());
  }
}

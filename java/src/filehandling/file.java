package filehandling;

import java.io.File;
import java.io.IOException;

public class file 
{
  public static void main(String[] args) throws IOException
  {
	File f=new File("aa2b2c.txt");
	System.out.println(f.exists());
	f.mkdir();
//	System.out.println(f.exists());
//	f.createNewFile();
	System.out.println(f.exists());
	
	
	
	
	System.out.println(f.canExecute());
	System.out.println(f.canRead());
	System.out.println(f.canWrite());
	
  }
}

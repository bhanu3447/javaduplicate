package filehandling;

import java.io.File;
import java.io.IOException;

public class methods 
{
   public static void main(String[] args) throws IOException
  {
//	File f=new File("bhu");
//	f.mkdir();//create a dir
////	System.out.println(f.exists());
//	System.out.println(f.isDirectory());
	   
//	File f=new File("abc.txt");
//	f.createNewFile();
//	System.out.println(f.exists());
//	System.out.println(f.isFile());
//	System.out.println(f.delete());
	
	File f=new File("D:\\bhanu");
	System.out.println(f.length());
	String[] s=f.list();
	for(String n:s)
	{
		File f1=new File(f,n);
		if(f1.isDirectory())  System.out.println(n);
//		if(f1.isFile())  System.out.println(n);
		
	}
	}
}

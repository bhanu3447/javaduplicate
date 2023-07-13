package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedreader 
{
 public static void main(String[] args) throws IOException
 {
	 FileReader f=new FileReader("abc.txt");
	BufferedReader r=new  BufferedReader(f);
	String line = r.readLine();
	while(line!=null)
	{
		System.out.println(line);
		line=r.readLine();
	}
	
	r.close();
 }
}

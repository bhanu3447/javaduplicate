package filehandling;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedwriter 
{
  public static void main(String[] args) throws IOException 
  {
	  FileWriter f=new FileWriter("abc.txt");
	BufferedWriter w=new BufferedWriter(f);
	w.write(100);
	w.newLine();
	char ch[]= {'a','b','c'};
	w.write(ch);
	w.newLine();
	w.write("my name is bhanu");
	w.flush();
	w.close();
  }
}

package collectionmethods;

import java.util.ArrayList;

public class arraylist 
{
  public static void main(String[] args) 
  {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(60);
	a1.add(30);
	a1.add(40);
	System.out.println(a1);
	ArrayList a2=new ArrayList();
	a2.add(10);
	a2.add(40);
	a2.add(60);
	a2.add(20);
	a1.retainAll(a2);
	System.out.println(a1);
  }
}

package collectionmethods;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlist 
{
  public static void main(String[] args) 
  {
	LinkedList a1=new LinkedList();
	a1.add(10);
	a1.add(60);
	a1.add(30);
	a1.add(40);
	System.out.println(a1);
	
	Object[]arr=a1.toArray();
	for(Object o:arr)
	{
		System.out.println(o);
	}
  }
}

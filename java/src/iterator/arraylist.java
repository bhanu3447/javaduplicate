package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist 
{
 public static void main(String[] args)
 {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(60);
	a.add(30);
	a.add(50);
	a.add(13);
	
//	Iterator i=a.iterator();
//	
//	while(i.hasNext())
//	{
//		Integer i1=(Integer)i.next();
//		if(i1%2!=0) i.remove(); 
//	}
//	System.out.println(a);
	
	
   Iterator i=a.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}

 }
}

package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection 
{
 public static void main(String[] args)
 {
	Collection c=new ArrayList();
	c.add(10);
	c.add(60);
	c.add(30);
	c.add(50);
	
	Iterator i=c.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
 }
}

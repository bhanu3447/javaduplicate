package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIterator
{
   public static void main(String[] args)
	{
      List l=new ArrayList();
      l.add(1);
      l.add(2);
      l.add(3);
      l.add(4);
      l.add(8);
      l.add(2);
//      l.set(1,4);
      
      ListIterator i=l.listIterator();
      
      while(i.hasNext())
      {
    	  System.out.print(i.next());
      }
      System.out.println();
      while(i.hasPrevious())
      {
    	  System.out.print(i.previous());
      }
	}
}

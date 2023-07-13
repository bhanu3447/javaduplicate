package collectionmethods;

import java.util.*;

public class sortedset 
{
  public static void main(String[] args) 
  {
	SortedSet s=new TreeSet();
	s.add(40);
	s.add(20);
	s.add(100);
	s.add(60);
	
	System.out.println(s.first());
	System.out.println(s.last());
	  
     SortedSet s1=s.headSet(40);
     display(s1);
     
     SortedSet s2=s.tailSet(40);
     display(s2);
     
     SortedSet s3=s.subSet(40,100);
     display(s3);
 }
  static void display(SortedSet s)
  {
	  for(Object o:s)
	  {
		  System.out.print(o+" ");
	  }
	  System.out.println();
  }
}

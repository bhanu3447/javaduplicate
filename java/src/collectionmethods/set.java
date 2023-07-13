package collectionmethods;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set
{
 public static void main(String[] args)
  {
//	 Set s=new TreeSet();
//		System.out.println(s.add(10));
//		System.out.println(s.add(60));
//		System.out.println(s.add(20));
//		System.out.println(s.add(30));
//		System.out.println(s.add(20));
//
//		
//		
//		System.out.println("size="+s.size());
//		for(Object o:s)
//		{
//			System.out.println(o);
//		}
		
//	 Set s=new LinkedHashSet();
//		System.out.println(s.add(10));
//		System.out.println(s.add(60));
//		System.out.println(s.add(20));
//		System.out.println(s.add(30));
//		System.out.println(s.add(20));
//
//		
//		
//		System.out.println("size="+s.size());
//		for(Object o:s)
//		{
//			System.out.println(o);
//		}
	 
	Set s=new HashSet();
	System.out.println(s.add(10));
	System.out.println(s.add(60));
	System.out.println(s.add(20));
	System.out.println(s.add(30));
	System.out.println(s.add(20));

	
	
	System.out.println("size="+s.size());
	for(Object o:s)
	{
		System.out.println(o);
	}
  }
}

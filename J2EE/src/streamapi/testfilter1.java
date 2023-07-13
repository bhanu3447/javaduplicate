package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testfilter1 
{
	public static void main(String[] args) 
	{
      List<Integer> l1=new ArrayList<Integer>();
      l1.add(10);
      l1.add(5);
      l1.add(2);
      l1.add(13);
      l1.add(12);
      l1.add(18);

      
      List<Integer> l2=new ArrayList<Integer>();

      
      for(Integer c:l1)
      {
    	  if(c%2==0)  l2.add(c);
      }
      
      System.out.println(l2 );
//      
      
      
//      List<Integer> l2= l1.stream().filter(e->e%2==0).collect(Collectors.toList());
//      System.out.println(l2 );        
      
      


      
      
	}
  
}

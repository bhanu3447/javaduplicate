package distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class distinct1 
{
   public static void main(String[] args) 
   {
	List <Integer> l=new ArrayList();
	l.add(20);
	l.add(10);
	l.add(20);
	l.add(10);
	l.add(30);
	l.add(40);
	l.add(50);
//	   List <Integer> l=List.of(2,20,11,2,20,50);
	
	List <Integer> l2=l.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(l2);
   }
}

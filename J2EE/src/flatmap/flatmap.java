package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatmap 
{
  public static void main(String[] args)
  {
	List<Integer> l1=List.of(1,2,5,6);
	List<Integer> l2=List.of(3,4,7,10);
	List<Integer> l3=List.of(8,9,11,12);
	
	List<List<Integer>> list=List.of(l1,l2,l3); 
	System.out.println(list);
	
	
	
//	System.out.println(list2);
	
	
//	List<Integer> list2=list.stream().flatMap(e->e.stream()).collect(Collectors.toList());
//	System.out.println(list2);
////	
//	List<Integer> list3=list2.stream().flatMap(e->Stream.of((e*e),(e*2))).collect(Collectors.toList());
//	System.out.println(list3);
////	
	List<Integer> list4=list.stream().flatMap(e->e.stream()).flatMap(e->Stream.of((e*e),(e*2))).collect(Collectors.toList());
	System.out.println(list4);
  }
}

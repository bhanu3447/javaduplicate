package impmethodreference;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

 class demo
{
  public static void displaystatic(Object o)
  {
	  System.out.println(o);
  }
  public  void displaynonstatic(Object o)
  {
	  System.out.println(o);
  }
}


 public class trail
{
  public static void main(String[] args)
  {
	List<Integer> l1=List.of(1,2,5,6);
	List<Integer> l2=List.of(3,4,7,10);
	List<Integer> l3=List.of(8,9,11,12);
	
	List<List<Integer>> list=List.of(l1,l2,l3); 
//	System.out.println(list);
	
//	list.forEach(e->System.out.println(e));

	List<Integer> list2= list.stream().flatMap(e->e.stream()).collect(Collectors.toList());
//	list2.forEach(e->System.out.println(e));	
//	list2.forEach(System.out::println);
	
	Consumer<? super Integer> con=demo::displaystatic;
	list2.forEach(con);
//	list2.forEach(demo::displaystatic);
//	System.out.println("*************");
//	demo d=new demo();
//	list2.forEach(d::displaynonstatic);
  }
}

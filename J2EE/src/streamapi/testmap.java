package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class testmap 
{
 public static void main(String[] args)
 {
	 
	 
	 
	 List<Integer> l=List.of(5,5,2,8,8,2,3);//from 1.9 update
	 
	 
	 
//	 Function <Integer,String> f=new  Function <Integer,String>()
//	 {
//
//		@Override
//		public String apply(Integer t)
//		{
//			return t*t+"";
//		}
//		 
//	 };
//	 
//	 List<String> l2 = l.stream().map(f).collect(Collectors.toList());
//	 System.out.println(l2);

	 
//	 List<Integer> l2 = l.stream().map(e->e*e).collect(Collectors.toList());
//	 System.out.println(l2);

	 List<String> l2 = l.stream().map(e->e*e+"").collect(Collectors.toList());
	 System.out.println(l2);
	 
 }
}

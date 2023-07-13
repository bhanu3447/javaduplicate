package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lamdaexp.student;

public class teststudent
{
  public static void main(String[] args)
  {
	  List<student> l=new ArrayList<student>();
		l.add(new student(1,"bhanu","java"));
		l.add(new student(2,"chandrashekar","r"));
		l.add(new student(3,"tiger","#c"));
		l.add(new student(4,"cherry","css"));
		
		
//		Function<student,student> f = new Function<>() {
//
//			@Override
//			public student apply(student s) {
//				String Name = s.getName();
//				char[] c = Name.toCharArray();
//				String result = " ";
//				for(int i = 0 ;i<c.length;i++)
//				{
//					if(Name.charAt(i) >='a' && Name.charAt(i) <='z' )
//					{
//						result +=(char) (Name.charAt(i)-32);
//					}
//					else
//					{
//						result += Name.charAt(i);
//					}
//				}
//				s.setName(result);
//				return s;
//			}
//			
//		};
//		List<student> l2=l.stream().map(f).collect(Collectors.toList());
//	    for(student s:l2)
//	    {
//	    	System.out.println(s);
//	    }
		
		
//		 Function <student,student> f=new  Function <student,student>()
//		 {
//
//			public student apply(student s) 
//			{
//				 s.setName(s.getName().toUpperCase());
//				 return s;
//				
//			}
//	
//			 
//		 };
//		 
//			List<student> l2=l.stream().map(f).collect(Collectors.toList());
//		    for(student s:l2)
//		    {
//		    	System.out.println(s);
//		    }

	
		List<String> l2=l.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
		
		
		
//		
//		List <student>  l2=l.stream().map(e->
//		{
//			e.setName(e.getName().toUpperCase());
//			return e;
//		}).collect(Collectors.toList());
//		
//		for(student s:l2)
//		{
//			System.out.println(s);
//		}
//			
		
			
			
//			List <student>  l2=l.stream().map(e->
//			{
//				e.setName(e.getName().toLowerCase());
//				return e;
//			}).collect(Collectors.toList());
//			
//			for(student s:l2)
//			{
//				System.out.println(s);
//			}

  }
}













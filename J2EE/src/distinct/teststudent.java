package distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class teststudent
{
  public static void main(String[] args)
  {
	  List<student> l=new ArrayList<student>();
		l.add(new student(1,"bhanu","java"));
		l.add(new student(2,"chandrashekar","r"));
		l.add(new student(3,"tiger","#c"));
		l.add(new student(1,"bhanu","java"));
		
		
//		List <student> l2=l.stream().distinct().collect(Collectors.toList());
//		for(student s:l2)
//		{
//			System.out.println(s);
//		}
		
		
		List<student> l2=l.stream().distinct().collect(Collectors.toList());
        Consumer c=new Consumer()
        {

			@Override
			public void accept(Object t)
			{
				System.out.println(t);
			}
			
       };
       l2.forEach(c);
		
		
		
  }
}
		  

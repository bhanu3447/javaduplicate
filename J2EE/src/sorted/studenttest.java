package sorted;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lamdaexp.student;

public class studenttest
{
  public static void main(String[] args)
  {
	  List<student> l=new ArrayList<student>();
	    l.add(new student(3,"tiger","#c"));
		l.add(new student(4,"cherry","css"));
		l.add(new student(1,"bhanu","java"));
		l.add(new student(2,"achandrashekar","r"));
		
		
		
		List<student> l2=l.stream().sorted((e1,e2)->{
			return e1.getName().compareToIgnoreCase(e2.getName());
		}).collect(Collectors.toList());
		
		for(student s:l2)
		{
			System.out.println(s);
		}
  }
}
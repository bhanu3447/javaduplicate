package flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class teststudent
{
  public static void main(String[] args)
  {
//	  List<student> l1=new ArrayList<student>();
//		l1.add(new student(1,"bhanu","java"));
//		l1.add(new student(2,"chandrashekar","r"));
//		l1.add(new student(3,"tiger","#c"));
//		l1.add(new student(4,"cherry","css"));
//		
//	 List<student> l2=new ArrayList<student>();
//		l2.add(new student(1,"sathwik","java"));
//		l2.add(new student(2,"hari","r"));
//		l2.add(new student(3,"srinu","#c"));
//		l2.add(new student(4,"ajay","css"));
//		
//	 List<student> l3=new ArrayList<student>();
//		l3.add(new student(1,"suman","java"));
//		l3.add(new student(2,"jagan","r"));
//		l3.add(new student(3,"sunil","#c"));
//		l3.add(new student(4,"likhil","css"));
//		
//		List<List<student>> list=List.of(l1,l2,l3);
//		for(List<student> s:list)
//		{
//			System.out.println(s);
//		}
		
//		System.out.println("********************");
//		List<String> list2=list.stream().flatMap(e->e.stream()).flatMap(e->Stream.of((e.getName().toUpperCase()),(e.getName().toLowerCase()))).collect(Collectors.toList());
//		list2.forEach(e->System.out.println(e));
//		
//		
//		
//		list2.forEach(System.out::println);
		
	  
	  
	  
	  
	  List<String> a1=List.of("monday","tuesday");
	  List<String> a2=List.of("wednesday","thursday");
	  List<String> a3=List.of("friday","saturday");
	  List<String> a4=List.of("sunday");
	  
	  List<List<String>> list = List.of(a1,a2,a3,a4);
	  list.forEach(e->System.out.println(e));
	  
	  List <String> list2=(List<String>) list.stream().flatMap(e->e.stream()).flatMap(e->Stream.of((e.toUpperCase()),(e.toLowerCase()))).collect(Collectors.toList());
	  list2.forEach(e->System.out.println(e));	
//	  list2.forEach(System.out::println);
	  
//	  
	  
	  

		
		
		

		
		
		
  }
}
		  

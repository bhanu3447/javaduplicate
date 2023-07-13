package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
		  
//		teststudent.sortbycourse(l);
//		System.out.println("*************");
//		teststudent.sortbyname(l);
//		System.out.println("*************");
//		teststudent.sortbyname(l);
		
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=scn.nextInt();
	
		switch(a)
		{
		case 1:sortbycourse(l);  break;
		
		case 2:sortbyname(l);  break;
		
		case 3:sortbyid(l);  break;
		}
		
	
		
  }
  public static void sortbycourse(List<student> l)
  {
		List<student> l3=l.stream().filter(e->
		{
			return e.getCourse().startsWith("java");
		}).collect(Collectors.toList());
		
		for(student s:l3)
		{
			System.out.println(s);
		}
  }
  
  public static void sortbyname(List<student> l)
  {
		List<student> l3=l.stream().filter(e->
		{
			return e.getName().startsWith("c");
		}).collect(Collectors.toList());
		
		for(student s:l3)
		{
			System.out.println(s);
		}
  }
  
  public static void sortbyid(List<student> l)
  {
		List<student> l3=l.stream().filter(e->
		{
			return e.getId()/2==2;
		}).collect(Collectors.toList());
		
		for(student s:l3)
		{
			System.out.println(s);
		}
  }
		

		
  }
































//public class teststudent
//{
//  public static void main(String[] args)
//  {
//	  List<student> l=new ArrayList<student>();
//		l.add(new student(1,"bhanu","java"));
//		l.add(new student(2,"chandrashekar","r"));
//		l.add(new student(3,"tiger","#c"));
//		l.add(new student(4,"cherry","css"));
//		
//		
//		
////		Predicate <student> p=new Predicate <student>()
////				{
////
////					@Override
////					public boolean test(student t)
////					{
////						
//////						if(t.getName().startsWith("c")) return true;
//////						return false;
//////						
////						
////						return t.getName().charAt(0)=='c';
////                        
////						
////						
////						
//////						String s=t.getName();
//////						char c=s.charAt(0);
//////						if(c=='c') return true; 
//////						return false;
////						
////					}
////			
////				};
////		List<student> l2=l.stream().filter(p).collect(Collectors.toList());
////		for(student s:l2)
////		{
////			System.out.println(s);
////		}
//		
//	
//		
//		List<student> l2=l.stream().filter(e->
//		{
//			return e.getName().startsWith("c");
//		}).collect(Collectors.toList());
//		
//		for(student s:l2)
//		{
//			System.out.println(s);
//		}
		


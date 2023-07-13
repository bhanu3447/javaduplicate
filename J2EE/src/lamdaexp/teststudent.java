package lamdaexp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import JAVA8.car;

public class teststudent
{
//  public void sortbyname(List<student> l)
//  {
//	  Collections.sort(l,(e1,e2)->
//		{
//			return e1.getName().compareToIgnoreCase(e2.getName());
//		});
//	  
//	  for(student s:l)
//		{
//			System.out.println(s);
//		}
//  }
//  
//  
//  public void sortbycourse(List<student> l)
//  {
//	  Collections.sort(l,(e1,e2)->
//		{
//			return e1.getCourse().compareToIgnoreCase(e2.getCourse());
//		});
//	  
//	  for(student s:l)
//		{
//			System.out.println(s);
//		}
//  }
//  
//  
//  public void sortbyid(List<student> l)
//  {
//	  Collections.sort(l,(e1,e2)->
//		{
//			return e1.getId()-e2.getId();
//		});
//	  
//	  for(student s:l)
//		{
//			System.out.println(s);
//		}
//  }
  public static void main(String[] args)
  {
	List<student> l=new ArrayList<student>();
	l.add(new student(1,"bhanu","java"));
	l.add(new student(2,"hemanth","html"));
	l.add(new student(3,"tiger","css"));
	
	
	
//	
//        teststudent t=new teststudent();
//        t.sortbycourse(l);
//        System.out.println("***********");
//        t.sortbyname(l);
//        System.out.println("***********");
//        t.sortbyid(l);
//        
	
	
	
	
	Collections.sort(l,(e1,e2)->
	{
		return e1.getCourse().compareToIgnoreCase(e2.getCourse());
	});
	
	for(student s:l)
	{
		System.out.println(s);
	}	
	
    
 }
}

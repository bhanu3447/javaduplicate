package distinct;

import java.util.ArrayList;
import java.util.List;

public class min_student 
{
  public static void main(String[] args)
   { 
	List<student> l=new ArrayList<student>();
	l.add(new student(2,"Ahandrashekar","r"));
	l.add(new student(1,"bhanu","java"));
	l.add(new student(3,"tiger","#c"));
	l.add(new student(4,"cherry","css"));
	
//	student l2=l.stream().min((e1,e2)->e1.getName().compareToIgnoreCase(e2.getName())).get();
//	System.out.println(l2);
	
//	student l2=l.stream().max((e1,e2)->e1.getName().compareToIgnoreCase(e2.getName())).get();
//	System.out.println(l2);
	
//	//class cast exception
//	List<student> l2=(List<student>) l.stream().min((e1,e2)->e1.getName().compareToIgnoreCase(e2.getName())).get();
//	System.out.println(l2);
	
//	student l2=l.stream().max((e1,e2)->e1.toString().compareToIgnoreCase(e2.toString())).get();
//	System.out.println(l2);
	
	  
	  
//	  List<student> l=new ArrayList<student>();
//		l.add(new student(2,"Ahandrashekar","r"));
//		l.add(new student(1,"bhanu","java"));
//		l.add(new student(1,"bhanu","ava"));
//		l.add(new student(3,"tiger","#c"));
//		l.add(new student(4,"cherry","css"));
	
//	student l2=l.stream().min((e1,e2)->e1.toString().compareToIgnoreCase(e2.toString())).get();
//	System.out.println(l2);
	
//	student l2=l.stream().max((e1,e2)->e1.toString().compareToIgnoreCase(e2.toString())).get();
//	System.out.println(l2);

   }
}

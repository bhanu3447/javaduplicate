package javapractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class testStudent {

	public static void main(String[] args)
			{
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(1,"hemanth","java"));
		list1.add(new Student(2,"vasanth","c++"));
		list1.add(new Student(3,"rajkumar","javaScript"));
		list1.add(new Student(4,"hemapriya","html"));
		list1.add(new Student(5,"anandh","ruby"));
		list1.add(new Student(6,"harsha","boostrap"));
		list1.add(new Student(7,"pardhu","python"));
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		switch(n)
		{
		case 1 :	filterName(list1);
						
						break;
		case 2 :  filterCourse(list1);
						break;
		default : System.out.println(" Invalid  input ");
		}
		
 
	}
	public static void filterName(List<Student> list1)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting character of the name ");
		String s = sc.nextLine();
	List<Student> list2 = list1.stream().filter(e -> e.getName().startsWith(s)).collect(Collectors.toList());
	for(Student n : list2)
	{
		System.out.println(n);
	}
	}
	public static void filterCourse(List<Student> list1)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting character of the Course ");
		String s = sc.nextLine();
		List<Student> list2 = list1.stream().filter(e -> e.getCourse().startsWith(s)).collect(Collectors.toList());
		for(Student n : list2)
		{
			System.out.println(n);
		}
	}
	 

}
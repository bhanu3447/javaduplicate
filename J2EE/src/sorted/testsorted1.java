package sorted;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class testsorted1 
{
 public static void main(String[] args) 
 {
	List<Integer> l=new ArrayList();
	l.add(12);
	l.add(3);
	l.add(48);
	l.add(5);
	l.add(6);
	l.add(7);
	
	List<Integer> l2=l.stream().sorted().collect(Collectors.toList());
	System.out.println(l2);
 }
}
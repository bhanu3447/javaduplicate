package collectionmethods;

import java.util.*;

class desc implements Comparator
{
	
	public int compare(Object arg1, Object arg2)
	{
		Integer o1=(Integer)arg1;
		Integer o2=(Integer)arg2;
		return o2.intValue()-o1.intValue();
		
	}
}
public class queue 
{
 public static void main(String[] args)
 {
		Queue q=new PriorityQueue(new desc());
		q.add(10);
		q.add(40);
		q.add(60);
		q.add(30);
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	
		
//	 Queue q=new LinkedList();
//		q.add(10);
//		q.add(40);
//		q.add(60);
//		q.add(30);
//		while(!q.isEmpty())
//		{
//			System.out.println(q.poll());
//		}
	 
//	 Queue q=new ArrayDeque();
//		q.add(10);
//		q.add(40);
//		q.add(60);
//		q.add(30);
//		while(!q.isEmpty())
//		{
//			System.out.println(q.poll());
//		}
	 
//	Queue q=new PriorityQueue();
//	q.add(10);
//	q.add(40);
//	q.add(60);
//	q.add(30);
//	while(!q.isEmpty())
//	{
//		System.out.println(q.poll());
//	}
 }
}

package collections;

public class demolinkedlist
{
 public static void main(String[] args) 
 {
//	 node first=null;
//	 first=new node(10,null);
//	 first.next=new node(20,null);
//	 first.next.next=new node(30,null);
//	 first.next.next.next=new node(40,null);
//	 node curr=first;
//	 while(curr!=null)
//	 {
//		 System.out.println(curr.element);
//		 curr=curr.next;
//	 }
//	 
	 linkedlist l=new linkedlist();
	 l.add(10);
	 l.add(69);
	 l.add(40);		 
	 l.add(50);
	 l.add(45);
	System.out.println(l);
	System.out.println(l.size());
	System.out.println(l.get(0));
	l.add(2,20);
	System.out.println(l);
	l.remove(0,10);
	System.out.println(l);
	l.reverse();
	System.out.println(l);
	l.clear();
	System.out.println(l);
 }
}
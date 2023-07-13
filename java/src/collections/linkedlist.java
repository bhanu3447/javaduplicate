package collections;

public class linkedlist 
{
 private node first=null;
 private int count=0;
 private node last=null;
  
 public void add(Object e)
 {
//	 if(first==null)
//		 {
//			 first=new node(e,null);
//			 last=first;
//			 count++;
//			 return;
//		 }
//	 node last=first;
//	 while(last.next!=null)
//	 {
//		 last=last.next;
//	 }
//	 last.next=new node(e,null);
//	 count++;
	 
	 if(first==null)
	 {
		 first=new node(e,null);
		 last=first;
		 count++;
		 return;
	 }
	 last.next=new node(e,null);
	 last=last.next;
	 count++;
 }
 public int size()
 {
	 return count++;
 }
 public String toString()
 {
	 if(first==null) return"[]";
	 String s="["+first.element;
	 node curr=first;
	 while(curr.next!=null)
	 {
		 curr=curr.next;
		 s=s+","+curr.element;
	 }
	 s+="]";
	 return s;
 }
 public Object get(int index)
 {
	 if(index<=-1||index>=size())
	 {
		 throw new IndexOutOfBoundsException();
	 }
	 node curr=first;
	 for(int i=1;i<=index;i++)
	 {
		 curr=curr.next;
	 }
	 return curr.element;
 }
 public void add(int index,Object e)
 {
	 if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
	 if(index==0)
	 {
	  first=new node(e,first);
	  count++;
	  return;
	 }
	 node curr=first;
	 for(int i=1;i<index;i++)
	 {
		 curr=curr.next;
	 }
	 curr.next=new node(e,curr.next);
	 count++;
 }
 public void remove(int index,Object e)
 {
	 if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
	 if(index==0)
	 {
	  first=first.next;
	  count--;
	  return;
	 }
	 node curr=first;
	 for(int i=1;i<index;i++)
	 {
		 curr=curr.next;
	 }
	 curr.next=curr.next.next;
	 if(index==size()-1)
	 {
		 last=curr;
	 }
	 count--;	 
 }
 public void clear()
 {
	 first=null;
	 last=null;
	 count=0;
 }
 public void reverse()
 {
	 node prev=null;
	 node curr=first;
	 node next =null;
	 while(curr!=null)
	 {
		 next=curr.next;
		 curr.next=prev;
		 prev=curr;
		 curr=next;
	 }
	 first=prev;
 }
 
}

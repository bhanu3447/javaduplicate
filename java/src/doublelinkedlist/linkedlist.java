package doublelinkedlist;

public class linkedlist 
{
 private node first=null;
 private node last=null;
 private int count;
 
 public void add(Object e)
 {
	 if(first==null)
	 {
		 first=new node(e,null,null);
		 last=first;
		 count++;
		 return;
	 }
	 last.next=new node(e,null,last);
	 last=last.next;
	 count++;
 }
 public int size()
 {
	 return count;
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
 	 return curr.ele;
 }
}
package doublylinkedlist;

public class doublyLinkedList 
{
  private Node head=null;
  
  private Node tail=null;
  
  private int count=0;
  
  public void add(Object ele)
  {
	  if(head==null)
	  {
		  head=new Node(ele,null,null);
		  tail=head;
		  count++;
		  return ;
	  }
	  tail.next=new Node(ele,null,tail);
	  tail=tail.next;
	  count++;
	  return;  
  }
  
  
  public int size()
  {
	  return count;
  }
  
  
  public Object get(int index)
  {
	  if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
	  
	  
	  Node curr=head;
	  
	  for(int i=1;i<=index;i++)
	  {
		  curr=curr.next;
	  }
	  return curr.element;

  }
  
  public void remove(int index)
  {
	  if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
	  Node curr=head;
	  
	  for(int i=1;i<index;i++)
	  {
		  curr=curr.next;
	  }
	  if(curr.prev==null)
	  {
		  head=curr.next;
	  }
	  curr.prev.next=curr.next
	  
  }
  
}

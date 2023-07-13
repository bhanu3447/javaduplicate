package linkedlist;



public class circularlinkedlist
{
	public static void main(String[] args) 
	{
		cll c = new cll();
		c.insertAtHead(10);
		c.insertAtIndex(120,1);
		c.insertAtIndex(170,1);
		c.display();
		c.reverse();
		c.display();
		c.insertAtIndex(80,1);
		c.display();
		c.deleteAtHead();
		c.display();
		c.deleteAtTail();
		c.display();
		c.deleteAtTail();
		c.display();
//		c.deleteAtIndex(2);
		c.display();
		
	}
}


class cll
{
	class node
	{
		int data;
		node next;
		public node(int data) {
			super();
			this.data=data;
			this.next = null;
		}
		
	}
	
	node head=null;
	node tail=null;
	int size=0;
	public boolean isEmpty()
	{
		return size==0;
	}
	public int getSize()
	{
		return size;
	}
	public void insertAtHead(int data)
	{
	  node newnode=new node(data);
	  if(isEmpty()) 
	  {
		  head=newnode;
		  newnode.next=head;
		  tail=head;
	  }
	  else
	  {
		  newnode.next=head;
		  head=newnode;
		  tail.next=head;
	  }
	  size++;
	}
	public void insertAtTail(int data)
	{
		node newnode=new node(data);
		if(isEmpty())
		{
			head=newnode;
			newnode.next=head;
			tail=head;
		}	
		else
		{
			newnode.next=head;
			tail.next=newnode;
			tail=newnode;
		}
		size++;
	}
	public void insertAtIndex(int data, int index)
	{
		node newnode=new node(data);
	    if (index < 0 || index > size) {
	        throw new IndexOutOfBoundsException("Invalid index");
	    }
	    if(index==0) insertAtHead(data);
	    else if(index==size) insertAtTail(data);
	    else 
	    {
	    	node curr=head;
	    	for(int i=1;i<index;i++)
	    	{
	    		curr=curr.next;
	    	}
	    	newnode.next=curr.next;
	    	curr.next=newnode;

	    }
	    size++;
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("circular linkedlist is empty");
		}
		else
		{
		  node curr=head;
		  do
		  {
			  System.out.print(curr.data+"->");
			  curr=curr.next;
		  }while(curr!=head);
		  System.out.println();
			
//		  node curr=head;
//		  while(true)
//		  {
//			  System.out.print(curr.data+"->");
//			  curr=curr.next;
//			  if(curr==head) break;
//		  }
//		  System.out.println();
		}
	}
	public void reverse()
	{
		if(isEmpty()||head==tail)return;
		node prev=null;
		node curr=head;
		node next=null;
		
		do {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}while(curr!=head);
		tail=head;
		head=prev;
		tail.next=head;
		
		
		
		
	}
	public void deleteAtHead()
	{
		if(isEmpty()) return;
		if (head == tail) 
		{
	        head = null;
	        tail = null;
	    } else 
	    {
	        tail.next = head.next;
	        head = head.next;
	    }
		size--;
	}
	public void deleteAtTail()
	{
		if (isEmpty()) {
	        return; // Empty list
	    }

	    if (head == tail) {
	        head = null;
	        tail = null;
	    } else {
	        node curr= head;
	        while (curr.next != tail) {
	            curr = curr.next;
	        }
	        curr.next = head;
	        tail = curr;
	        
	    }
	    size--;
	}
	public void deleteAtIndex(int index)
	{
		if(isEmpty()||index<0||index>=size) throw new IndexOutOfBoundsException();
		if(index==0) 
			{
			deleteAtHead();
			return;
			}
		else if(index==size-1)
		{
			deleteAtTail();
			return;
		}
		node curr=head;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		size--;
	}
}


package linkedlist;



public  class singlelinkedlist
{
	public static void main(String[] args)
	{
		linkedlist l=new linkedlist();
		System.out.println("insert at head");
		l.insertAtHead(10);
		l.display();
		System.out.println("insert at index");
		l.insertAtIndex(20, 1);
		l.display();
		System.out.println("insert at tail");
		l.insertAtTail(25);
		l.display();
		System.out.println("insert at head");
		l.insertAtHead(50);
		l.display();
		System.out.println("insert at index");
		l.insertAtIndex(80,2);
		l.display();
		System.out.println("reverse");
		l.reverse();
		l.display();
		System.out.println("insert at tail");
		l.insertAtTail(66);
		l.display();
		System.out.println("get");
		System.out.println(l.get(2));
		System.out.println("find");
		System.out.println(l.find(25));
	}
}
	

class linkedlist
{
  public node head=null;
  public node tail=null;
  int size;
  
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
  public int getsize()
  {
	  return size;
  }
  public boolean isempty()
  {
	  return size==0;
  }
  public void insertAtHead(int k)
  {
	  node newnode=new node(k);
	  if(isempty())
	  {
		  head=newnode;
		  tail=newnode;
	  }else
	  {
		  newnode.next=head;
		  head=newnode;
	  }
	 
//	  newnode.next=head;
//	  head=newnode;
//	  if(tail==null)
//	  {
//		  tail=newnode;
//	  }
	  size++;
  }
  public void insertAtTail(int k)
  {
	  node newnode=new node(k);
	  if(isempty())
	  {
		  head=newnode;
		  tail=newnode;
	  }
	  else
	  {
		  tail.next=newnode;
		  tail=newnode;
	  }
//	  else
//	  {
//		  node curr=head;
//		  while(curr.next!=null)
//		  {
//			  curr=curr.next;
//		  }
//		  curr.next=newnode;
//	  }
	  size++;
  }
   public void insertAtIndex(int data,int index)
   {
	   if(index<0||index > size) throw new IndexOutOfBoundsException("invalid index");
	   if(index==0) insertAtHead(data);
	   else if(index==size) insertAtTail(data);
	   else
	   {
		   node newnode = new node(data);
		   node curr=head;
		   for(int i=1;i<index;i++)
		   {
			   curr=curr.next;
		   }
		   newnode.next=curr.next;
		   curr.next=newnode;
		   size++;
	   }
		 
   }
   public void deleteAtHead()
   {
	   if(isempty()) throw new RuntimeException("list is empty");
	   head=head.next;
	   if(head==null)
	   {
		   tail=null;
	   }
	   size--;
   }
   public void deleteAtTail()
   {
	   if(isempty())
	   {
		   throw new RuntimeException("list is empty");
	   }
	   if(size==1)
	   {
		   head=null;
		   tail=null;
	   }
	   else
	   {
	   node curr=head;
	   while(curr.next.next!=null)
	   {
		   curr=curr.next;
	   }
	   curr.next=null;
	   tail=curr;
	   }
	   size--;
   }
	   
   public void deleteAtIndex(int index)
   {
	   if(index<0||index>size) throw new IndexOutOfBoundsException("invalid index");
	   if(index==0) deleteAtHead();
	   else if(index==size-1) deleteAtTail();
	   else
	   {
		   node curr=head;
		   for(int i=1;i<index;i++)
		   {
			   curr=curr.next;
		   }
		   curr.next=curr.next.next;
	   }
	   size--;
   }
   public void display()
   {
	   if(isempty())
	   {
		   System.out.println("list is empty");
		   return;
	   }
	   node curr=head;
	   while(curr!=null)
	   {
		   System.out.print(curr.data+"-> ");
		   curr=curr.next;
	   }
	   System.out.println();
   }
  public void reverse()
  {
	  if(isempty()||head.next==null) return;
	  node curr=head;
	  node next=null;
	  node prev=null;
	  
	  while(curr!=null)
	  {
		   next= curr.next;
		   curr.next=prev;
		   prev=curr;
		   curr=next;
	  }
	  
	  tail=head;
	  head=prev;
  }
  
  public int get(int index)
  {
	  if(index<0||index>size) throw new IndexOutOfBoundsException("invalid index");
	  
	  node curr=head;
	  for(int i=0;i<index;i++)
	  {
		  curr=curr.next;
	  }
	  return curr.data;
  }
  public int find(int value)
  {
	  node curr=head;
	  int index=0;
	  while(curr!=null)
	  {
		  if(curr.data==value) return index;
		  curr=curr.next;
		  index++;
	  }
	  return -1 ;
//	  
//	  for (int index = 0; index < size; index++) {
//	        if (current.data == value) {
//	            return index;
//	        }
//	        current = current.next;
//	    }
	  
  }
  
  

}


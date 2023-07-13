package hashingobject;


public class set 
{
 private node[] a=new node[10];
 int count=0;
 
 public boolean add(Object k)
 {
	 int index=k.hashCode()%10;
	 index=Math.abs(index);
	 if(a[index]==null)
	 {
		 a[index]=new node(k, null);
		 count++;
		 return true;
	 }
	 node prev=null;
	 node curr=a[index];
	 while(curr!=null)
	 {
		 if(k.equals(curr.key)) return false;
		 prev=curr;
		 curr=curr.next;
	 }
	 prev.next=new node(k,null);
	 count++;
	 return true;
   }
 void display()
 {
	 for(int i=0; i<a.length; i++)
	 {
		 node curr=a[i];
		 while(curr!=null)
		 {
			 System.out.println(curr.key);
			 curr=curr.next;
		 }
	 }
 }
 
 public int size()
 {
	 return count;
 }
}

package collections;

public class queue 
{
	private node first=null;
	private node last=null;
	private int count=0;
	
	public void add(Object e)
	{
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
	
	public Object poll()
	{
		if(isempty()) return null;
		Object element=first.element;
		first=first.next;
		count--;
		if(isempty()) last=null;
		return element;
	}
	public Object peek()
	{
		if(isempty()) return null;	
		return first.element;
	}
	public int size()
	{
		return count;
	}
	public boolean isempty()
	{
		if(size()==0) return true;
		return false;
	}


}

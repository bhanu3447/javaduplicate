package collections;

import java.util.EmptyStackException;

public class stack 
{
  private node first=null;
  private int count=0;
  
  public void push(Object e)
  {
	  if(first==null)
	  {
		  first=new node(e,null);
		  count++;
		  return;
	  }
	  first=new node(e,first);
	  count++;
  }
  
  public int size()
  {
	  return count;
  }
  public boolean isempty()
  {
	  if(first==null) return true;
	  return false;
  }
  public Object pop()
  {
	  if(isempty()) throw new EmptyStackException();
	  Object ele=first.element;
	  first=first.next;
	  count--;
	  return ele;
  }
  public Object peek()
  {
	  if(isempty())  throw new EmptyStackException();
	  return first.element;
  }
}

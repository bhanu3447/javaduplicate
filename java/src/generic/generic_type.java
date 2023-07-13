package generic;

class container1<E>
{
	private E obj;
	public void add(E  e)
	{
		obj=e;
	}
	public E get()
	{
		return obj;
	}
}
public class generic_type 
{
  public static void main(String[] args) 
  {
	container1<String> c1=new container1<String>();
//	c1.add(10);
	c1.add("surya");
//	String s1=(String) c1.get();
	String s1=c1.get();
	System.out.println(s1);
	
  }
}


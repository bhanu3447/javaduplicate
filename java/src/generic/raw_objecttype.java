
package generic;

class container
{
	private Object obj;
	public void add(Object  e)
	{
		obj=e;
	}
	public Object get()
	{
		return obj;
	}
}
public class raw_objecttype 
{
  public static void main(String[] args) 
  {
	container c1=new container();
	c1.add("surya");
	String s1=(String) c1.get();
	System.out.println(s1);
	
  }
}


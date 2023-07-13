package collectionmethods;

class container2 <T>
{
 private T obj;
 public void add(T e)
 {
	 obj=e;
 }
 public T get()
 {
	 return obj;
 }
}


class generictype2
{
	public static void main(String[] args)
	{
	    container2  c1 = new container2();
		c1.add("rascal student");
		String s1=(String)c1.get();	
	}
}
package collectionmethods;

class container <T>
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
 class generictype
{
	public static void main(String[] args)
	{
	container <String> c1 = new container<String>();
		c1.add("bhanu");
		String s1=c1.get();
		System.out.println(s1);
	}
}
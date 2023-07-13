class Parent 
{
	public void call()
	{
		System.out.println("8897819907");
	}
}
class Child extends Parent
{
  public void call()   //overriding
	{
	  System.out.println("8639343784");
	}
}
class AskingNotes
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.call();
	}
}

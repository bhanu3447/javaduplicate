class C
{
	public void m1()
	{
		System.out.println("Good logic");
	}
}
class D
{
		C c;
		public D(C c)
		{
			this.c=c;
		}
		public void m2()
		{
			c.m1();      
		}
}
public class Test2
{
	public static void main(String[] args) 
	{
		C c=new C();                       //D d=new D(new (c));
		D d=new D(c);                      //d.m2();
		d.m2();
	}
}

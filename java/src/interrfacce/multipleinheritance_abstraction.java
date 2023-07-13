package interrfacce;

interface I1
{
	void m1();
	void m2();
}
interface I2 extends I1
{
	void m1();
	void m3();
}
class C extends Object implements I1,I2
{
	@Override
	public void m1() 
	{
		System.out.println("m1() implemeted of class C");
	}
	@Override
	public void m2() 
	{
		System.out.println("m2() implemeted of class C");

	}
	@Override
	public void m3() 
	{
		System.out.println("m3() implemeted of class C");

	}
}
public class multipleinheritance_abstraction 
{
    public static void main(String[] args) 
    {
    	I2 i=new C();
    	i.m1();
    	i.m2();
    	i.m3();
	}
    
}

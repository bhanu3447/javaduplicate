package interrfacce;

interface I1
{
	void m1();
	void m2();
}
interface I2
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
public class multipleinheritance 
{
    public static void main(String[] args) 
    {
		C c = new C();
		c.m1();
		c.m2();
		c.m3();  //method is not abstracted if you do like this
		
//		I1 i1=new C();
//		i1.m1();
//		i1.m2();
//		
//         I2 i2=new C();
//         i2.m1();
//         i2.m3();
	}
    
}

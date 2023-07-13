package coupling;

interface I
{
	public void m1();
}
class Bs implements I
{

	@Override
	public void m1() 
	{
		System.out.println("hi");
		
	}
	
}
public class loosecoupling
{
	public static void main(String[] args) 
	{
		Bs b=new Bs();
		b.m1();
		
    }

}

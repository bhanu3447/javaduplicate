package practice;

interface a extends Runnable
{

}
interface b extends a
{

	@Override
	public default void run() {
		System.out.println("run method executed");
		
	}
	
}
public class test implements b
{
	public static void main(String[] args)
	{
		test t = new test();
		Thread th=new Thread();
		th.start();
	}
}

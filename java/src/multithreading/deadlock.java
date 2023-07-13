package multithreading;

class A
{
	public  synchronized  void d1(B b)
	{
		System.out.println("thread1 starts execution of d1() method");
		try
		{
			Thread.sleep(3000);
		}catch(InterruptedException e)
		{
			
		}
		System.out.println("thread1 trying to call b's last() method" );
		b.last();
	}
	public  synchronized void last()
	{
		System.out.println("inside A, last method");
	}
}
class B
{
	public synchronized void d2(A a)
	{
		System.out.println("thread2 starts execution of d2() method");
		try
		{
			Thread.sleep(3000);
		}catch(InterruptedException e)
		{
			
		}
		System.out.println("thread2 trying to call A's last() method ");
		a.last();
	}
	public  void last()
	{
		System.out.println("inside B, last method");
	}
}
public class deadlock extends Thread
{
   A a=new A();
   B b=new B();
   
   public void m1()
   {
	   this.start();
	   a.d1(b);  //this line executed by main thread
   }
   public void run()
   {
	   b.d2(a);   //this line executed by child thread
   }
   public static void main(String[] args)
   {
	deadlock d=new deadlock();
	d.m1();
   }
}

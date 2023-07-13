//package multithreading;
//
//
//class display
//{
//	public static synchronized void displayn()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.err.println(i);
//			try
//			{
//				Thread.sleep(1000);
//			}catch(InterruptedException e)
//			{
//				
//			}
//		}
//	}
//	
//	public static synchronized void displayc()
//	{
//		for(int i=65;i<=75;i++)
//		{
//			System.out.println((char)i);
//			try
//			{
//				Thread.sleep(1000);
//			}catch(InterruptedException e)
//			{
//				
//			}
//		}
//	}
//}
//
//class mythread1 extends Thread
//{
//	display d;
//	mythread1(display d)
//	{
//		this.d=d;
//	}
//	public void run()
//	{
//		d.displayn();
//	}
//}
//
//class mythread2 extends Thread
//{
//	display d;
//	mythread2(display d)
//	{
//		this.d=d;
//	}
//	public void run()
//	{
//		d.displayc();
//	}
//}
//
//
//public class static_synchronized
//{
//   public static void main(String[] args)
//   {
//	display d=new display();
//	mythread1 t1=new mythread1(d);
//	mythread2 t2=new mythread2(d);
//	t1.start();
//	t2.start();
//   }
//}

//package multithreading;
//
//class Mythread extends Thread
//{
//	static Thread mt;
//	public void run()
//	{
//		try
//		{
//			mt.join();
//		}catch(InterruptedException e)
//		{
//			
//		}
//		
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("child thread");
//		}
//	}
//}
//public class joincase2 
//{
//	public static void main(String[] args) throws InterruptedException
//	{
//		Mythread.mt=Thread.currentThread();
//		Mythread t1=new Mythread();
//		t1.start();
////		t1.join();
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("main thread");
//			Thread.sleep(1000);
//		}
//	}
//
//}
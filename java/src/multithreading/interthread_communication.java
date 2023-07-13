//package multithreading;
//
//
//
//class thread extends Thread
//{
//	int total=0;
//	public void run()
//	{
//		
//		for(int i=1;i<=100;i++)
//		{
//			total=total+i;
//			
//		}
//		System.out.println(total);
//	}
//}
//public class interthread_communication 
//{
//  public static void main(String[] args) throws InterruptedException 
//  {
//	thread t=new thread();
//	t.start();
////	t.wait();
////	t.join();
//	Thread.yield();	//	Thread.sleep(1000);
//    System.out.println("main");
//  }
//}



package multithreading;



class thread extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
		   System.out.println("child thread starts caluclation");
		   for(int i=1;i<=100;i++)
		   {
			  total=total+i;
		   }
		   System.out.println("child thread giving notification call");
		   this.notify();
		}
	}
}
public class interthread_communication 
{
  public static void main(String[] args) throws InterruptedException 
  {
	thread t=new thread();
	t.start();

	Thread.sleep(1000);
	synchronized(t)
	{
	   System.out.println("main thread calling wait() method");
//	   t.wait();
	   t.wait(5000);
	   System.out.println("main thread got notification call");
       System.out.println(t.total);
	}
	
  }
}


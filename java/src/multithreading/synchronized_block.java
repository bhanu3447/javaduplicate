package multithreading;

//class display
//{
//	public static synchronized void wish(String name)
//	{
//		;;;;;;;;
//		
//	
//		for(int i=0;i<10;i++)
//		{
//			System.out.print("good morning:");
//			try
//			{
//				Thread.sleep(1000);
//			}catch(InterruptedException e)
//			{
//				
//			}
//			System.out.println(name);
//		}
//		;;;;;;;
//	}
//}
//
//class Mythread extends Thread
//{
//	display d;
//	String name;
//	Mythread(display d,String name)
//	{
//		this.d=d;
//		this.name=name;
//	}
//	public void run()
//	{
//		d.wish(name);
//	}
//
//}
//
//
//public class synchronized_block 
//{
//  public static void main(String[] args)
//  {
//	display d=new display();
//	Mythread t1=new Mythread(d,"dhoni");
//	Mythread t2=new Mythread(d,"yuvaraj");
//	t1.start();
//	t2.start();
//	
//  }
//}

//class display
//{
//	public void wish(String name)
//	{
//		;;;;;;;;
//		
//	synchronized(this)
//	 {
//		for(int i=0;i<10;i++)
//		{
//			System.out.print("good morning:");
//			try
//			{
//				Thread.sleep(1000);
//			}catch(InterruptedException e)
//			{
//				
//			}
//			System.out.println(name);
//		}
//		;;;;;;;
//	 }
//	}
//}
//
//class Mythread extends Thread
//{
//	display d;
//	String name;
//	Mythread(display d,String name)
//	{
//		this.d=d;
//		this.name=name;
//	}
//	public void run()
//	{
//		d.wish(name);
//	}
//
//}
//
//
//public class synchronized_block 
//{
//  public static void main(String[] args)
//  {
//	display d=new display();
//	Mythread t1=new Mythread(d,"dhoni");
//	Mythread t2=new Mythread(d,"yuvaraj");
//	t1.start();
//	t2.start();
//	
//  }
//}






//package multithreading;

//class display
//{
//	public static synchronized void wish(String name)
//	{
//		;;;;;;;;
//		
//	   synchronized(display.class)
//	   {
//		for(int i=0;i<10;i++)
//		{
//			System.out.print("good morning:");
//			try
//			{
//				Thread.sleep(1000);
//			}catch(InterruptedException e)
//			{
//				
//			}
//			System.out.println(name);
//		}
//		;;;;;;;
//	   }
//	}
//}
//
//class Mythread extends Thread
//{
//	display d;
//	String name;
//	Mythread(display d,String name)
//	{
//		this.d=d;
//		this.name=name;
//	}
//	public void run()
//	{
//		d.wish(name);
//	}
//
//}
//
//
//public class synchronized_block 
//{
//  public static void main(String[] args)
//  {
//	display d1=new display();
//	display d2=new display();
//	Mythread t1=new Mythread(d1,"dhoni");
//	Mythread t2=new Mythread(d2,"yuvaraj");
//	t1.start();
//	t2.start();
//	
//  }
//}




////package multithreading;
//
//class display
//{
//	public void wish(String name)
//	{
//		;;;;;;;;
//		
//	synchronized(new display())
//	 {
//		for(int i=0;i<10;i++)
//		{
//			System.out.print("good morning:");
//			try
//			{
//				Thread.sleep(1000);
//			}catch(InterruptedException e)
//			{
//				
//			}
//			System.out.println(name);
//		}
//		;;;;;;;
//	 }
//	}
//}
//
//class Mythread extends Thread
//{
//	display d;
//	String name;
//	Mythread(display d,String name)
//	{
//		this.d=d;
//		this.name=name;
//	}
//	public void run()
//	{
//		d.wish(name);
//	}
//
//}
//
//
//public class synchronized_block 
//{
//  public static void main(String[] args)
//  {
//	display d1=new display();
////	display d2=new display();
//	Mythread t1=new Mythread(d1,"dhoni");
////	Mythread t2=new Mythread(d2,"yuvaraj");
//	t1.start();
////	t2.start();
//	
  }
}


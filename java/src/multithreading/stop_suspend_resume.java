package multithreading;

class mythread  extends Thread
{
   public void run()
   {
	   for(int i=0;i<5;i++)
	   {
		   System.out.println("chid thread");
		   try
		   {
			   Thread.sleep(1000);
		   }catch(InterruptedException e) {}
	   }
   }
}
public class stop_suspend_resume 
{
  public static void main(String[] args) throws InterruptedException
  {
     mythread t=new mythread();
     t.start();
     t.suspend();
     Thread.sleep(5000);
     t.resume();
//     t.stop();
     System.out.println("end of main thread");
  }
}
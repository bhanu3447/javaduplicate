package exception;

public class finalize 
{
  public static void main(String[] args) 
  {
	finalize f = new finalize();
	System.out.println(f.hashCode());
	f=null;
	System.gc();
	System.out.println("end of garbage collection");
  }
  @Override
  protected void finalize() 
  {
	  System.out.println("finalize method called");
  }
}

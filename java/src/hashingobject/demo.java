package hashingobject;


public class demo
{
  public static void main(String[] args) 
  {
	set s=new set();
	System.out.println(s.add("java"));
	System.out.println(s.add("c"));
	System.out.println(s.add("html"));
	System.out.println(s.add("python"));
	System.out.println(s.add("python"));
	
	System.out.println("size="+s.size());
	s.display();
	
  }
}

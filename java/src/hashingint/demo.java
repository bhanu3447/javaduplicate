package hashingint;

public class demo
{
  public static void main(String[] args) 
  {
	set s=new set();
	System.out.println(s.add(6));
	System.out.println(s.add(15));
	System.out.println(s.add(22));
	System.out.println(s.add(45));
	System.out.println(s.add(15));
	
	System.out.println("size="+s.size());
	s.display();
	
  }
}

package collections;

public class demostack 
{
	public static void main(String[] args) 
	{
	  stack s=new stack();
	  s.push(10);
	  s.push(20);
	  s.push(30);
	  s.push(40);
	  System.out.println(s.isempty());
	  System.out.println(s.size());
	  System.out.println("**************");
	  System.out.println(s.peek());
	  while(!s.isempty())
	  {
		  System.out.println(s.pop());
	  }
	  System.out.println("*************");
	  System.out.println(s.size());
	  System.out.println(s.isempty());
	 

	}

}

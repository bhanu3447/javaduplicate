
package collections;

public class queuedemo 
{
  public static void main(String[] args)
  {
	queue q=new queue();
	q.add(10);
	q.add(20);
	q.add(30);
	q.add(40);
	q.add(50);
	System.out.println(q.size());
	System.out.println(q.peek());
	System.out.println("*************");
	while(!q.isempty())
	{
		System.out.println(q.poll());
	}
	System.out.println(q.isempty());

  }
}

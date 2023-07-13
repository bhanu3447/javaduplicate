package doublylinkedlist;

public class Test 
{
  public static void main(String[] args) 
  {
	doublyLinkedList d = new doublyLinkedList();
	d.add(10);
	d.add(70);
	d.add(30);
	d.add(40);
	d.add(60);
	
	System.err.println(d.size());
	System.out.println(d.get(3));
  }
}

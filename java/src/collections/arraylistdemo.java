package collections;

public class arraylistdemo {

	public static void main(String[] args)
	{
		 arraylist a = new arraylist();
		 System.out.println("size"+a.size());
		 System.out.println(a);
		 a.add(10);
		 a.add(40);
		 a.add(60);
		 a.add(90);
		 a.add(110);
		 a.add(20);
//		 a.add(11,20);
		 System.out.println("size="+a.size());
		 System.out.println(a);
		 a.remove(3);
		 System.out.println(a);
		 int i=(Integer)a.get(4);
		 System.out.println(i);
		 a.clear();
		 System.out.println(a);
	}
}

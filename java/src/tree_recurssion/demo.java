package tree_recurssion;

public class demo
{
  public static void main(String[] args) 
  {
	  binarytree b=new binarytree();
	  System.out.println(b.add(50));
	  System.out.println(b.add(25));
	  System.out.println(b.add(75));
	  System.out.println(b.add(40));
	  System.out.println(b.add(10));
	  System.out.println(b.add(10));
	  System.out.println(b.add(60));
	  System.out.println(b.add(100));
	  
	  System.out.println("size="+b.size());
	  b.levelorder();
	  b.preordertraverse();
   	  b.postordertraverse();
	  b.inordertraverse();
	  
  }
}

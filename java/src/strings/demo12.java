package strings;

public class demo12 
{
   public static void main(String[] args)
   {
	String s1="developer";
	System.out.println(s1.indexOf('e'));
	System.out.println(s1.indexOf("lop"));
	System.out.println(s1.indexOf('c'));
	System.out.println(s1.indexOf('e', 5));
	System.out.println(s1.lastIndexOf('e'));
	System.out.println(s1.lastIndexOf('r'));
	System.out.println(s1.indexOf("lop",6));

	
   }
}

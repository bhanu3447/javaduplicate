package strings;


public class demo1 
{
   public static void main(String[] args)
   {
	   String s1=new String("java");
	   System.out.println(s1);
	   String s2="jAva";
	   System.out.println(s2);
	   System.out.println(s1==s2);
	   System.out.println(s1.equalsIgnoreCase(s2)); 
   }
}

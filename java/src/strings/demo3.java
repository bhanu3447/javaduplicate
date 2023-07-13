package strings;

public class demo3
{
	public static void main(String[] args)
	{
	   String s="java";
	   for(int i=0; i<=s.length()-1;i++)
	   {
		   char c=s.charAt(i);
		   System.out.println(c);
	   }
//	   char[] a=s.toCharArray();
//			   for(char ch:a)
//			   {
//				   System.out.println(ch);
//			   }
			   
			   char a[]= {'j','a','v','a'};
			   for(char ch:a)
			   {
				   System.out.println(ch);
			   }
	}
}

package regex;

public class demo2 
{
   public static void main(String[] args) 
   {
	 String s1="a\"b\"c";
	 System.out.println(s1);	
	 
	 String s2="D:\\folder1\\folder1.1";
	 System.out.println(s2);
	 
	 String s3="ab+cd+ef";
	 String []a=s3.split("\\+");
	 System.out.println(s3);
   }
}

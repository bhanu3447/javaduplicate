package regex;

public class demo1 
{
   public static void main(String[] args) 
   {
	String s1="j1[0-9]a2v3a";
	
	System.out.println(s1.replace("[0-9]", "")); 
	
	String s2="j1a2v3a";
	
	System.out.println(s2.replaceAll("[0-9]", ""));
	
	
	String arr[]=s2.split("[0-9]");
	for(String a:arr)
		
	{
		System.out.println(a);
	}
			
   }
}

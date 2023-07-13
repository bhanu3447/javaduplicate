package comparable;

import java.util.Arrays;

public class bookdemo 
{
 public static void main(String[] args)
 {
	book[]arr= {
			    new book("java",450),
			    new book("c",560),
			    new book("sql",240),
			    new book("html",150),
	           };
	Arrays.sort(arr);
	for(book b:arr)
	{
		System.out.println(b);
	}
 }
}
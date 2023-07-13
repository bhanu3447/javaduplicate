package comparable;

import java.util.Arrays;

public class demo2 
{
 public static void main(String[] args) 
 {
	emp[]a= {
			new emp("bhanu",6300),
			new emp("hari",2500),
			new emp("hemanth",8900),
          	};
	Arrays.sort(a);
	for(emp n:a)
	{
		System.out.println(n);
	}
 }
}

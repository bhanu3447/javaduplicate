package comparable;

import java.util.Arrays;

public class comparator 
{
  public static void main(String[] args) 
  {
	String arr[]= {"rajesh","joy","arun","vishnuprasad","balayya"};
	Arrays.sort(arr,new lencomp());
	for(String s:arr)
	{
		System.out.println(s);
	}
	System.out.println("******************");
	Arrays.sort(arr);
	for(String s:arr)
	{
		System.out.println(s);
	}
  }
}

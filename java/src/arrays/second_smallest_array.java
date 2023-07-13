package arrays;

public class second_smallest_array 
{
  public static void main(String[] args)
  {
	int[]a= {8,8,5,9,2,8,6};
//	int[]b= {2,4,5,8,9,3,6};
//	int[]c= {2,4,5,8,9,3,2};
	int s1=a[0];
	int s2=a[0];
	for(int i=1; i<a.length; i++)
	{
		if(a[i]<s1)
		{
			s2=s1;
			s1=a[i];
		}
		else if(a[i]<s2||s1==s2)
		{
			if(a[i]!=s1)
				s2=a[i];
		}
	}
	System.out.println(s2);
  }
}

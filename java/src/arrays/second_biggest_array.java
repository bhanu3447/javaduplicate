package arrays;

public class second_biggest_array 
{
  public static void main(String[] args)
  {
	int[]a= {8,8,15,14,9,2,8,6};

	int s1=a[0];
	int s2=a[0];
	for(int i=1; i<a.length; i++)
	{
		if(a[i]>s1)
		{
		 s2=s1;	
		 s1=a[i];
		}
		else if(a[i]>s2||s1==s2)
		{
			if(a[i]!=s1) s2=a[i];
		}
	}
	System.out.println(s2);
  }
}

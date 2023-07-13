package arrays;

public class biggest_array
{
  public static void main(String[] args) 
  {
	int[]a= {-8,-4,5,19,-2,3,-6};
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max) max=a[i];
	}
	System.out.println(max);
  }
}

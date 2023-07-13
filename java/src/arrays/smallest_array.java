package arrays;

public class smallest_array
{
  public static void main(String[] args) 
  {
	int[]a= {8,4,5,9,2,3,6};
	int smallest=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<smallest) smallest=a[i];
	}
	System.out.println(smallest);
  }
}

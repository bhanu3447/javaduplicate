package arrays;

public class array1 
{
   public static void main(String[] args)
   {
	int []a=new int[3];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	int[]b=a;
	b[0]=25;
	for(int n:a)
	{
		System.out.println(n);
	}
   }
}

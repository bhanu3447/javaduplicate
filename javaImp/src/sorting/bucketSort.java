package sorting;

import java.util.Iterator;

public class bucketSort
{
	  public static void main(String[] args)
	  {
		int a[]= {91,21,86,79,0,89};
		bucketSort(a, a.length);
		for(int c:a)
		{
			System.out.println(c);
		}
	  }
	  private static int getMax(int a[])
	  {
		  int max=a[0];
		  for(int i=1;i<a.length;i++)
		  {
			  if(a[i]>max) max=a[i];
		  }
		  return max;
	  }
	  public static void bucketSort(int a[],int n)
	  {
		  int max=getMax(a);
		  int bucket[]=new int[max+1];
		  
		  for(int i=0;i<n;i++)
		  {
			 ++bucket[a[i]];
		  }
		  for(int i=0,j=0;i<=max;i++)
		  {
			  a[j++]=i;
			  bucket[i]--;
		  }
	  }
		
}

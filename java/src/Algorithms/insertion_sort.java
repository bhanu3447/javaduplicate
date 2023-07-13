package Algorithms;

public class insertion_sort 
{
  public static void main(String[] args) 
  {
	  int a[]= {19,2,10,4,1,6,5,5};
	  sort(a);
	  for(int n:a) System.out.println(n);
  }
  static void sort(int[]a)
  {
	  for(int i=1; i<a.length; i++)
	  {
		  int key=a[i];
		  int j=i-1;
		  while(j>=0&&a[j]>key)
//			  while(j>=0&&a[j]>key)
		  {
			  a[j+1]=a[j];
			  j--;
		  }
		  a[j+1]=key;
	  }
  }
}

package Algorithms;

public class Bubble_sort 
{
  public static void main(String[] args)
  {
	int[]a= {3,9,4,8,52,7};
	sort(a);
	for(int n:a) System.out.println(n);
	
  }
  public static void sort(int []a)
  {
	  for(int i=0; i<a.length; i++)
	  {
		  int flag=0;
		  for(int j=0; j<a.length-1-i; j++)
		  {
			  if(a[j]>a[j+1])
			  {
				  int temp=a[j];
				  a[j]=a[j+1];
				  a[j+1]=temp;
				  flag=1;
			  }
		  }
		  if(flag==0) break;
	  }
  }
}

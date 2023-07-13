package Algorithms;

public class Merge_sort 
{
  public static void main(String[] args)
  {
	int[]a= {4,5,8,12,6,3,10,15,7};
	sort(a);
	for(int n:a) System.out.println(n+" ");
	System.out.println();
  }
  public static void sort(int []a)
  {
	  if(a.length==1) return;
	  int[] l=new int[a.length/2];
	  int[] r=new int[a.length-l.length];
	  int i=0;
	  while(i<l.length)
	  {
		  l[i]=a[i];
		  i++;
	  }
	  int j=0;
	  while(j<r.length)
	  {
		  r[j]=a[i];
		  j++;
		  i++;
	  }
	  sort(l);
	  sort(r);
	  merge(l,r,a);
  }
  
  private static void merge(int []a, int[]b, int[]c)
  {
	  int i=0,j=0,k=0;
	  while(i<a.length && j<b.length)
	  {
		  if(a[i]<b[j])
		  {
			  c[k]=a[i];
			  k++;
			  i++;
		  }
		  else
		  {
			  c[k]=b[j];
			  k++;
			  j++;
		  }
		  
	  }
	  while(i<a.length) 
	  {
		  c[k]=a[i];
		  k++;
		  i++;
	  }
	  while(j<b.length) 
	  {
		  c[k]=b[j];
		  k++;
		  j++;
	  }
  }
	
}

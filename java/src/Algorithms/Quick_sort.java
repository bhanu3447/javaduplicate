package Algorithms;

public class Quick_sort 
{
 public static void main(String[] args) 
 {
	int[]a= {25,3,6,2,1,9,8,11 };
	sort(a,0,a.length-1);
	for(int n:a)
	{
		System.out.println(n+" ");
	}
 }
 public static void sort(int []a,int start,int end)
 {
	 if(start>=end) return;
	 int i=start, j=end;
	 int pivot=a[(start+end)/2];
	
	 while(i<=j)
	 {
		 while(a[i]<pivot) i++;
		 while(a[j]>pivot) j--;
		 if(i<=j)
		 {
			 int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			 i++;
			 j--;
		 }
	 }
	 sort(a,start,j);
	 sort(a,i,end);
 }
}

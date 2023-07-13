package Algorithms;

public class binary_search_for_loop 
{
 public static void main(String[] args)
 {
	int []a= {3,5,6,7,9,10,25};
	System.out.println(search(a,10));
	System.out.println(search(a,5));
 }
 public static int search(int []a,int x)
 {
	 int start=0,end=a.length-1;
	 while(start<=end)
	 {
		 int mid=(start+end)/2;
		 if(x==a[mid]) return mid;
		 else if(x<a[mid]) end=mid-1;
		 else start=mid+1;
	 }
	 return -1;
 }
}

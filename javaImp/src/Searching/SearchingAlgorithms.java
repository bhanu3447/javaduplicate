package Searching;

public class SearchingAlgorithms 
{
	public static void main(String[] args)
	{
//		int a[]= {6,0,2,1,5,6,9};
		int a[]= {1,2,6,8,10,12};
//		System.out.println(linerSearch(a,9));
//		System.out.println(binarySearch(a, 9));
		System.out.println(binarysearchRecurrsion(a, 6, 0, a.length-1));
	}
    public static int linerSearch(int a[],int x)
    {
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]==x) return i;
    	}
    	return -1;
    }
    public static int binarySearch(int a[],int x)
    {
    	int start=0;
    	int end=a.length-1;
    	while(start<=end)
    	{
    	int mid=(start+end)/2;
    	if(x==a[mid]) return mid;
    	else if(x<a[mid]) end=mid-1;
    	else start=mid+1;
    	}
    	return -1;
    }
    public static int binarysearchRecurrsion(int a[],int x,int start,int end)
    {
    	if(start>end) return -1;
    	int mid=(start+end)/2;
    	if(x==a[mid]) return mid;
    	else if(x<a[mid]) return  binarysearchRecurrsion(a, x, start, mid-1);
    	else return  binarysearchRecurrsion(a, x, mid+1, end);
		
    }
  
}

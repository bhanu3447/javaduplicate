package practice;
public class radixsort
{
	 public static void main(String[] args) 
	 {
		 int []a= {11,220,890,101};
		 int max = getMax(a);
		 for(int pos=1;max/pos>0;pos*=10)
		 {
		 countingSort(a, a.length,pos);
		 }
		 for(int s:a)
		 {
			 System.out.println(s);
		 }
		 
	 }
	 private static int getMax(int a[])
	 {
		 int max=a[0];
		 for(int i=1;i<a.length;i++)
		 {
			if( a[i]>max ) max=a[i];
		 }
		 return max;
	 }
	 public static void countingSort(int a[],int n,int pos)
	 {
		int count[]=new int[10];
	    int output[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    {
	    	++count[(a[i]/pos)%10];
	    }
	    for(int i=1;i<=10;i++)
	    {
	    	count[i]=count[i]+count[i-1];
	    }
	    for(int i=n-1;i>=0;i--)
	    {
	    	output[--count[(a[i]/pos)%10]]=a[i];
	    }
	    for(int i=0;i<n;i++)
	    {
	    	a[i]=output[i];
	    }
	 }
}

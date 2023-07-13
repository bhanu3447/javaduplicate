
package sorting;

public class shellsort
{
  public static void main(String[] args)
  {
	int a[]= {23,29,15,19,31,7,9,5,2};
//	shellsortjenny(a);
	shellsort(a);
	for(int s:a)
	{
		System.out.println(s);
	}
  }

  public static void shellsort(int[] a)
  {
	    int n = a.length;
	    for (int interval = n / 2; interval > 0; interval = interval / 2)
	    {
	        for (int i = interval; i < n; i++)
	        {
	            int temp = a[i];
	            int j;
	            for (j = i; j >= interval && a[j - interval] > temp; j = j - interval)
	            {
	                a[j] = a[j - interval];
	            }
	            a[j] = temp;
	        }
	    }
	}

  public static void shellsortjenny(int a[])
  {
	  int n=a.length;
	  for(int interval=n/2;interval>0;interval=interval/2)
	  {
		  for(int j=interval;j<n;j++)
		  {
		    int i;
		    for(i=j-interval;i>=0;i-=interval)
		    {
			  if(a[i+interval]>a[i]) break;
			  else
			  {
				  int temp=a[i+interval];
				  a[i+interval]=a[i];
				  a[i]=temp;
			  }
		    }
		  }
	  }
  }
}

package ruf;

import java.util.Arrays;
import java.util.Scanner;

public class algorithms 
{
	public static void main(String[] args) 
	{
		int a[]= {101,12,900,156,28};
		int k = getMax(a);
		for(int pos=1;k/pos>0;pos*=10)
		{
			radixSort(a, a.length, pos);
		}
		for(int c:a)
		{
			System.out.println(c);
		}
	}
	public static int getMax(int a[])
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)max=a[i];
		}
		return max;
	}
	public static void radixSort(int a[],int n,int pos)
	{
		int output[]=new int[n];
		int count[]=new int[10];
		
		for(int i=0;i<n;i++)
		{
			++count[(a[i]/pos)%10];
		}
		for(int i=1;i<10;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		for(int i=n-1;i>=0;i--)
		{
			output[--count[(a[i]/pos%10)]]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			a[i]=output[i];
		}
	}
}
//	public static void main(String[] args) 
//	 {
//		 int []a = {8,12,121,869,400,3,56};
//		 
//		 radixSort(a, a.length);
//		 for(int c:a)
//		 {
//			 System.out.println(c);
//		 }
//	 }
//	public static void radixSort(int []a,int n)
//	{
//		int range=a[0];
//		for(int i=1;i<n;i++)
//		{
//			if(a[i]>range) range=a[i];
//		}
//		for(int place=1;range/place>0;place*=10)
//		{
//			countingSort(a, a.length, place);
//		}
//		
//	}
//	public static void countingSort(int a[],int n,int pos)
//	{
//		int []output=new int[n+1];
//		int []count=new int[10];
//		
//		for(int i=0;i<n;i++)
//		{
//			++count[(a[i]/pos)%10];
//		}
//		for(int i=1;i<=n;i++)
//		{
//			count[i]=count[i]-count[i-1];
//		}
//		for(int i=n-1;i>=0;i--)
//		{
//			output[--count[(a[i]/pos)%10]]=a[i];
//			count[(a[i] / pos) % 10]--;
//		}
//		
//		for(int i=0;i<n;i++)
//		{
//			a[i]=output[i];
//		}
//	}
//}
   ///*counting sort*///
//public static void main(String[] args) 
// {
//	 int []a = {0,1,1,2,6,3,2,1,0};
//	 countingSort(a, a.length);
//	 for(int c:a)
//	 {
//		 System.out.println(c);
//	 }
// }
//	
//	public static void countingSort(int a[],int n)
//	{
//		int range=a[0];
//		for(int i=1;i<n;i++)
//		{
//			if(a[i]>range) range=a[i];
//		}
//		
//		int count[]=new int[range+1];
//		
//		for(int i=0;i<n;i++)
//		{
//			++count[a[i]];
//		}
//		
//		for(int i=1;i<=range;i++)
//		{
//			count[i]=count[i-1]+count[i];
//		}
//		int b[]=new int[a.length];
//		for(int i=n-1;i>=0;i--)
//		{
//			b[--count[a[i]]]=a[i];
//		}
//		for(int i=0;i<n;i++)
//		{
//			a[i]=b[i];
//		}
//	}
//		
//	}
// public static void countingSort(int a[],int n)
// {
//	 int []b=new int[a.length];
//	 int range=a[0];
//	 for(int i=1;i<n;i++)
//	 {
//		 if(range<a[i])range=a[i];
//	 }
//	int count[]=new int[range+1];
//	
////	for(int i=0;i<n;i++)
////	{
////		count[i]=0;
////	}
//	for(int i=0;i<n;i++)
//	{
//		count[a[i]]++;
//	}
//	for(int i=1;i<=range;i++)
//	{
//		count[i]=count[i-1]+count[i];
//	}
//	for(int i=n-1;i>=0;i--)
//	{
//		b[--count[a[i]]]=a[i];
//	}
//	for(int i=0;i<n;i++)
//	{
//		a[i]=b[i];
//	}
//  }
// }
 
package javapractice;


import java.util.Scanner;

public class algorithms 
{
///*bubble sort*/
	
	
public static void main(String[] args) 
 {
	 Scanner scn = new Scanner(System.in);
	 System.out.println("enter array");
	 int []a = {0,1,1,2,6,8,5,5,5,4,3,3,2,1,0};
	 
	 countingSort(a, a.length);
	 for(int c:a)
	 {
		 System.out.println(c);
	 }
 }
 public static void countingSort(int a[],int n)
 {
	 int []b=new int[a.length];
	 int range=a[0];
	 for(int i=1;i<n;i++)
	 {
		 if(range<a[i])range=a[i];
	 }
	int count[]=new int[range+1];
	
	for(int i=0;i<n;i++)
	{
		count[i]=0;
	}
	for(int i=0;i<n;i++)
	{
		count[a[i]]++;
	}
	for(int i=1;i<=range;i++)
	{
		count[i]=count[i-1]+count[i];
	}
	for(int i=n-1;i>=0;i--)
	{
		b[--count[a[i]]]=a[i];
	}
	for(int i=0;i<n;i++)
	{
		a[i]=b[i];
	}
  }
 }
 
	
/*bubble sort*/
	
//	
//public static void main(String[] args) 
// {
//	 Scanner scn = new Scanner(System.in);
//	 System.out.println("enter array");
//	 int []a=new int[10];
////	 int []a = {11,5,1,265,87,3,4,5,99,4};
//	 int n=a.length;
//	 for(int i=0;i<n;i++)
//	 {
//		 a[i]=scn.nextInt();
//	 }
//	bubbleSort(a);
//	for(int c:a)
//	{
//		System.out.println(c);
//	}
// }
//	public static void bubbleSort(int []a)
//	{
//		for(int i=0;i<a.length-1;i++)
//		{
//			boolean flag=false;
//			
//			for(int j=0;j<a.length-1-i;j++)
//			{
//				if(a[j]>a[j+1])
//				{
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//					flag=true;
//				}
//			}
//			if(flag==false) break;
//		}
//		
//	}
//}
	
	
	
	/*insertion sort*/
	
//	
//	public static void main(String[] args) 
//	 {
//		
//		 int []a= {10,5,89,77,35,68};
//		insertionSort(a);
//	    for(int n:a)
//	    {
//	    	System.out.println(n);
//	    }
//	 }
//
//		public static void insertionSort(int []a)
//		{
//			for(int i=1;i<a.length;i++)
//			{
//				int key=a[i];
//				int j=i-1;
//				while(j>=0&&a[j]>key)
//				{
//					a[j+1]=a[j];
//					j--;
//				}
//				a[j+1]=key;
//			}
//		}
//	}
	
	
	
	/*selection sort*/
	
	
//	public static void main(String[] args) 
//	 {
//		
//		 int []a= {10,5,89,1,9,77,35,68};
//		selectionSort(a);
//	    for(int n:a)
//	    {
//	    	System.out.println(n);
//	    }
//	 }
//	public static void selectionSort(int []a)
//	{
//		for(int i=0;i<a.length-1;i++)
//		{
//			int index=i;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[j]<a[index]) index=j;
//			}
//			if(i!=index)
//			{
//				int temp=a[i];
//				a[i]=a[index];
//				a[index]=temp;
//			}
//		}
//		
//	}
//
	
	
	
	
	
	/*quick sort*/
	
	
//	public static void main(String[] args) 
//	 {
//		
//		 int []a= {10,5,89,1,9,77,35,68};
//		quickSort(0,a.length-1,a);
//	    for(int n:a)
//	    {
//	    	System.out.println(n);
//	    }
//	 }
//	public static void quickSort(int start,int end,int a[])
//	{
//		if(start>=end) return;
//		int i=start;
//		int j=end;
//		int pivot=a[(start+end)/2];
//		while(i<=j)
//		{
//			while(a[i]<pivot)i++;
//			while(a[j]>pivot)j--;
//			if(i<=j)
//			{
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//				i++;
//				j--;
//			}
//			
//		}
//		quickSort(start,j,a);
//		quickSort(i,end,a);
//	}
//}
	
	
	
	
	
	/*merge sort*/
	
	
	
//	public static void main(String[] args) 
//	 {
//		
//		 int []a= {10,5,89,1,9,77,35,68};
//		 sort(a);
//		
//	    for(int n:a)
//	    {
//	    	System.out.println(n);
//	    }
//	 }
//	public static void sort(int a[])
//	{
//		if(a.length==1) return;
//		int [] l=new int[a.length/2];
//		int [] r=new int[a.length-l.length];
//		int i=0;
//		while(i<l.length)
//		{
//			l[i]=a[i];
//			i++;
//		}
//		int j=0;
//		while(j<r.length)
//		{
//			r[j]=a[i];
//			i++;
//			j++;
//		}
//		sort(l);
//		sort(r);
//		merge(l,r,a);
//	}
//	
//	public static void merge(int []a,int[]b,int []c)
//	{
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<a.length&&j<b.length)
//		{
//			if(a[i]<b[j])
//			{
//				c[k]=a[i];
//				k++;
//				i++;
//			}
//			else
//			{
//				c[k]=b[j];
//				k++;
//				j++;
//			}
//		}
//		while(i<a.length)
//		{
//			c[k]=a[i];
//			k++;
//			i++;
//		}
//		while(j<b.length)
//		{
//			c[k]=b[j];
//			k++;
//			j++;
//		}
//		
//	}
//}
	
	
	
	/*linear search*/
	
//	public static void main(String[] args) 
//	 {
//		
//		 int []a= {10,5,89,1,9,77,35,68};
//		 System.out.println("enter a number");
//		 Scanner scn = new Scanner(System.in);
//		 int n=scn.nextInt();
//		 System.out.println(search(a, n));
//		
//	 }
//	public static int search(int a[],int x)
//	{
//		 for(int i=0;i<a.length;i++)
//		 {
//			 if(a[i]==x) return i;
//		 }
//		 
//		 return -1;
//	}
//}
	
	/*binary search using for loop*/
	
//	public static void main(String[] args) 
//	 {
//		
//		 int []a= {1,8,9,12,62,89};
//		 System.out.println("enter a number");
//		 Scanner scn = new Scanner(System.in);
//		 int n=scn.nextInt();
//		 System.out.println(search(a, n));
//		
//	 }
//	public static int search(int a[],int x)
//	{
//		 int start=0;
//		 int end=a.length-1;
//		 while(start<=end)
//		 {
//			 int mid=(start+end)/2;
//			 if(x==a[mid]) return mid;
//			 else if(x<a[mid]) end=mid-1;
//			 else start=mid+1;
//			
// 		 }
//		return -1;
//		 
//	}
//}
	
	
	/*binary using recurrsion*/
	
//	public static void main(String[] args) 
//	 {
//		
//		 int []a= {1,8,9,12,62,89};
//		 System.out.println("enter a number");
//		 Scanner scn = new Scanner(System.in);
//		 int n=scn.nextInt();
//		 System.out.println(search(a, n,0,a.length-1));
//		
//	 }
//	public static int search(int a[],int x,int start,int end)
//	{
//		if(start>end) return -1;
//		 int mid=(start+end)/2;
//		 if(x==a[mid]) return mid;
//		 else if(x<a[mid]) return search(a, x, start, mid-1);
//		 else  return search(a, x, mid+1,end);
//		 
//	}
//}
	
	

	

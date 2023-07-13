package javapractice;

public class arrays 
{
	
	/*reverse swapping an array*/
	
//	public static void main(String[] args)
//	   {
//		int []a={8,5,6,8,9};
//		System.out.println("orginal array");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		System.out.println("reverse array");
//		for(int i=a.length-1;i>=0;i--)
//		{
//			System.out.println(a[i]);
//		}
//	   }
	
	
	
	
	/*second biggest array*/
	
//	public static void main(String[] args)
//	   {
//		int []a={8,5,6,8,9};
//		int biggest1=a[0];
//		int biggest2=a[0];
//		
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]>biggest1)
//			{
//				biggest2=biggest1;
//				biggest1=a[i];
//			}
//			else if(a[i]>biggest2)
//			{
//				biggest2=a[i];
//			}
//		}
//		System.out.println(biggest2);
//		
//	   }
	
	
	/*second smallest array*/
	
//	public static void main(String[] args)
//	   {
//		int []a={8,5,6,8,9};
//		int smallest1=a[0];
//		int smallest2=a[0];
//		
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]<smallest1)
//			{
//				smallest2=smallest1;
//				smallest1=a[i];
//			}
//			else if(a[i]<smallest2)
//			{
//				smallest2=a[i];
//			}
//		}
//		System.out.println(smallest2);
	
	
	/*smallest in a array*/
	
//	public static void main(String[] args)
//	   {
//		int []a={8,5,6,8,9};
//		int smallest=a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]<smallest) smallest=a[i];
//		}
//		System.out.println(smallest);
//	  }
//	
	
	
	/*biggest in a array*/
	
//	public static void main(String[] args)
//	   {
//		int []a={8,5,6,8,9};
//		int biggest=a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]>biggest) biggest=a[i];
//		}
//		System.out.println(biggest);
//	  }
	
	
	
	/*8+5+6+8+9+=36 using array for each*/
	
//	public static void main(String[] args)
//	   {
//		int []a={8,5,6,8,9};
//		int sum=0;
//		String s="";
//		for(int n:a)
//		{
//			s+=n+"+";
//			if(n<a.length-1)
//			s+=",";
//			sum+=n;
//		}
//		s+="="+sum;
//		System.out.println(s);
//	  }
	
	
	
	/*8+5+6+8+9+=36 using array for loop*/
	
	
//	public static void main(String[] args)
//	   {
//		int []a={8,5,6,8,9};
//		int sum=0;
//		String s="";
//		for(int i=0;i<a.length;i++)
//		{
//			s+=a[i];
//			sum+=a[i];
//			if(i<a.length-1) s+="+";
//		}
//		s+="="+sum;
//		System.out.println(s);
//	  }
	
	
	
	
	
	
	
         /* array sum*/
	
//	public static void main(String[] args)
//   {
//	int []a={8,5,6,8,9};
//	
//	int sum=0;
//	for(int n:a)
//	{
//		sum+=n;
//	}
//	System.out.println(sum);
//  }
	
	
	
	
	
	/*2nd method for array declaration*/
	
//	public static void main(String[] args)
//   {
//	int []a={8,5,6,8,9};
//	
//	for(int n:a)
//	{
//		System.out.println(n);
//	}
//  }
	
	
	
	
	/*1st method for array declaration*/
	
	
	
//  public static void main(String[] args)
//  {
//	int []a=new int[4];
//	a[0]=1;
//	a[1]=2;
//	a[2]=4;
//	a[3]=12;
//	for(int n:a)
//	{
//		System.out.println(n);
//	}
// }
}

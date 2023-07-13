
package arrays;

public class reverse_swapping_array 
{
 public static void main(String[] args)
 {
	int[]a= {8,4,5,9,2,3,6};
	int i=0, j=a.length-1;
	while(i<j)
	{
		int temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	    i++;
	    j--;
	    System.out.println(a[j]);
	}
	
 }
}

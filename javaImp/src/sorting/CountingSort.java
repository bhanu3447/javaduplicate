package sorting;

import java.util.Arrays;

public class CountingSort
{
//	public static void sort(int a[])
//	{
//		int n=a.length;
//		int max=a[0];
//		for(int i=1;i<n;i++)
//		{
//			if(a[i]>max) max=a[i];
//		}
//		int count[]=new int[max+1];
//		for(int i=0;i<n;i++)
//		{
//			count[a[i]]++;
//		}
//		for(int i=1;i<=max;i++)
//		{
//			count[i]=count[i]+count[i-1];
//		}
//		int []sorted=new int[n];
//		for(int i=n-1;i>=0;i--) {
//			sorted[count[a[i]]-1]=a[i];
//		}
//	}


//public class CountingSort {
    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a count array to store the count of each element
        int[] count = new int[max + 1];

        // Count the occurrences of each element in the array
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Calculate the cumulative count
        for (int i = 1; i <max; i++) {
            count[i] += count[i - 1];
        }

        // Create a temporary array to store the sorted output
        int[] sorted = new int[n];

        // Build the sorted array
        for (int i = n - 1; i >= 0; i--) {
            sorted[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted array back to the original array
        System.arraycopy(sorted, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
//        sort(arr);
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
       countingSort(arr); 
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}


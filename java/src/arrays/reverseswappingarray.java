package arrays;

public class reverseswappingarray
{  
   public static void main(String[] args) 
    {  
        int [] arr = new int [5] ; 
        arr[0]=1;
        arr[1]=4;
        arr[2]=8; 
        arr[3]=12;
        arr[4]=10;
        
//        arr[5]=11;

        
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) 
        {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
   
        for (int i = arr.length-1; i >= 0; i--)
        {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  
package two_dimesionl_arrays;

public class matrix_multiplicATION 
{
   public static void main(String[] args)
   {
	   int a[][]= {{1,2,3},
			       {4,5,6},
			       {7,8,9}};
	   int b[][]= {{3,1,2},
		           {2,3,2},
		           {1,2,1}};
	   int c[][]=multiply(a,b);
	   displaymatrix(c);
   }
   public static int[][] multiply(int[][]a,int[][]b)
   {
	   
	   int len=a.length;
	   int c[][]=new int [len][len];
	   for(int i=0;i<len;i++)
	   {
		   for(int j=0;j<len;j++)
		   {
			   for(int k=0;k<len;k++)
			   {
				   c[i][j]+=a[i][k]*b[k][j];
			   }
		   }
	   }
	  return c;   
   }
   public static void displaymatrix(int [][]a)
   {
	   for(int[]temp:a)
	   {
		   for(int n:temp)
		   {
			   System.out.print(n+" ");
		   }
		   System.out.println();
	   }
   }
}

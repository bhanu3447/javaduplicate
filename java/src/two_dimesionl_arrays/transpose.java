package two_dimesionl_arrays;

public class transpose 
{
  public static void main(String[] args)
  { 
	  int a[][] = {{1, 2, 3},    
                   {4, 5, 6},    
                   {7, 8, 9}};   
	  int[][] b= transpose(a);
	  for(int[] n:b)
	  {
		  for(int m:n)
		  {
			  System.out.print(m+"\t");
		  }
	  System.out.println();
	  }
  }
  public static int[][] transpose(int [][]a)
  {
	  int [][]b=new int[a[0].length] [a.length];
	  for(int i=0; i<a.length; i++)
	  {
		  for(int j=0; j<a.length; j++)
		  {
			  b[j][i]=a[i][j];
		  }
		  
	  }
	return b;
  }
}

package dsa;

public class SingleNumber 
{
  public static void main(String[] args) 
  {
	int a[]= {1,2,2,4,4,5};
	int ans=0;
    for(int i=0;i<a.length;i++)
    {
    	ans=ans^a[i];
    }
    System.out.println(ans);
  }
}

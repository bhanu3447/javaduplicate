package comparable;

public class emp implements Comparable
{
  String name;
  int id;
  double sal;
  private static int n=101;
  
  {
	  id=n;
	  n++;
  }
  emp(String n,double s)
  {
	  name=n;
	  sal=s;
  }
  public String toString()
  {
	  return "emp[name="+name+"; "+sal+"]";
  }
  public int compareTo(Object arg)
  {
	emp e=(emp)arg;
	if(sal>e.sal) return 1;
	if(sal<e.sal) return -1;
	return 0;
	
  }
  
}

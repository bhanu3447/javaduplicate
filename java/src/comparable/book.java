package comparable;

public class book implements Comparable
{
  String title;
  double price;
  book(String t,double p)
  {
	  title=t;
	  price=p;
  }
  public int compareTo(Object arg) 
  {
	  book b=(book)arg;
	return title.compareTo(b.title);
  }
  public String toString()
  {
	  return"Book[title="+title+"; price="+price+"]";
  }
}

package hashingobject;


public class demostudent 
{
  public static void main(String[] args) 
  {
	student s1=new student("raja",68);
	student s2=new student("raja",68);
	
	System.out.println("hashcode of s1"+s1.hashCode());
	System.out.println("hashcode of s2"+s2.hashCode());
	
    set s=new set();
    System.out.println(s.add(s1));
    System.out.println(s.add(s2));
    System.out.println("size="+s.size());
    s.display();
	
  }
}

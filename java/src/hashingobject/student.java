package hashingobject;

public class student 
{
  String name;
  int marks;
  
  public student(String n,int m)
  {
	  name=n;
	  marks=m;
  }
  @Override
  public String toString()
  {
	  return "student[name="+name+", marks="+marks+"]";
  }
  @Override
  public int hashCode()
  {
	  return marks;
  }
  @Override
  public boolean equals(Object o)
  {
	  if(!(o instanceof student)) return false;
	  student s=(student)o;
	  return name.equals(s.name)&& marks == s.marks;
  }
}

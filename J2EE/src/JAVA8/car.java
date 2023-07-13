package JAVA8;

public class car 
{
  int id;
  String name;
  String brand;
  
  public car(int id, String name, String brand) 
  {
	super();
	this.id = id;
	this.name = name;
	this.brand = brand;
  }

@Override
public String toString() 
{
	return "car [id=" + id + ", name=" + name + ", brand=" + brand + "]";
}
  
}

class Student 
{
	String name;
	static int count;

	Student(String name)
	{
		this.name=name;
		count++;
	}
}
class Test4
{
	public static void main(String[] args) 
	{
		Student s1=new Student("ajay");
		Student s2=new Student("lokesh");
		//Student s3=new Student("Bhanu");

		System.out.println("count="+Student.count);
	}
}

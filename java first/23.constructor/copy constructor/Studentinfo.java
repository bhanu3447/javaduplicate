class Student{
	int sid;
	String sname;
	int age;
	public Student(int sid,String sname,int age){
		this.sid=sid;
		this.sname=sname;
		this.age=age;
	}
	public Student(int sid,String sname,Student s1){
		this.sid=sid;
		this.sname=sname;
		this.age=s1.age;
	}
	public Student(int sid,Student s1,int age)
	{
		this.sid=sid;
		this.sname=s1.sname;
		this.age=age;
	}
	public Student(int sid,Student s2,Student s3)
	{
		this.sid=sid;
		this.sname=s2.sname;
		this.age=s3.age;
	}
    public void displaystudents()
	{
	  System.out.println("Student ID: "+sid);
	  System.out.println("Student name: "+sname);
	  System.out.println("Student age: "+age);
      System.out.println("****************************");
	}
}
class Studentinfo
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1,"ram",23);
		s1.displaystudents();
		Student s2=new Student(2,"pushpa",s1);
		s2.displaystudents();
		Student s3=new Student(3,s1,25);
		s3.displaystudents();
		Student s4=new Student(4,s2,s3);
		s4.displaystudents();

	}
}




























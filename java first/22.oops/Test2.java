class D
{
   int i;
   static int j;
   void increment()
   {
     i++;
     j++;
   }
   void display()
   {
     System.out.println(i+" "+j);
   }
}
class Test2
{
   public static void main(String[] args) 
    {
     D d1=new D();
	 D d2=new D();
	 D d3=new D();
	 d1.increment();
	 d2.increment();
	 d3.increment();
	 d1.display();
	 d2.display();
	 d3.display();
	}
}
class E
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
class Test3
{
   public static void main(String[] args) 
    {
     E e1=new E();
	 E e2=new E();
	 E e3=new E();
	 e1.increment();
	 e1.increment();
	 e1.increment();
	 e1.display();
	 e2.display();
	 e3.display();
	}
}
class A
{
  public static void main(String[] args) 
  {
    System.out.println("main starts");
    A.m1();
    System.out.println("main ends");
  }
  public static void m1()
  {
    System.out.println("m1 starts");
    return;
    System.out.println("m1 ends");
  }
}
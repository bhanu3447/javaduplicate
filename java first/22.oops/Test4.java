class Ac
{
   int Temp;

   void setTemp(int t)
   {
     Temp=t;
	 System.out.println("temp set");
   }
   void displayTemp()
   {
     System.out.println(Temp);
   }
}
class Test4
{
   public static void main(String[] args) 
    {
     Ac ac1=new Ac();
	 Ac ac2=new Ac();
	 ac1.setTemp(21);
	 ac1.displayTemp();
	 ac2.setTemp(19);
	 ac2.displayTemp();
	}
}
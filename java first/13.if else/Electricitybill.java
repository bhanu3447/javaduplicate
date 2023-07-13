import java.util.Scanner;
class ElectricityBill
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter units consumed");
		int u=scn.nextInt();
        System.out.println("enter due amount");
		double d=scn.nextDouble();

		double amt=0.0;
		if (u<=50){
			System.out.println(u+"x 0rs = 0rs");
		}else if (u<=100){
			amt=(u-50)*3;
			System.out.println(u+"x 0rs = 0rs");
			System.out.println((u-50)+"x 3rs ="+amt+"rs");
        }else if (u<=150){
			amt=(50*0)+(50*3)+((u-100)*5);
			System.out.println("50 x 0rs = 0rs"); 
			System.out.println("50 x 3rs = 150rs");
			System.out.println((u-100)+"x 5rs = "+((u-100)*5)+"rs");
		}else if (u<=200){
			amt=(50*0)+(50*3)+(50*5)+((u-150)*8);
			System.out.println("50 x 0rs = 0rs"); 
			System.out.println("50 x 3rs = 150rs");
			System.out.println("50 x 5rs = 250rs");
			System.out.println((u-150)+"x 8rs = "+((u-150)*8)+"rs");
		}else if (u<=250){
			amt=(50*0)+(50*3)+(50*5)+(50*8)+((u-200)*11);
			System.out.println("50 x 0rs = 0rs"); 
			System.out.println("50 x 3rs = 150rs");
			System.out.println("50 x 5rs = 250rs");
			System.out.println("50 x 8rs = 400rs");
			System.out.println((u-200)+"x 11 rs ="+(u-200)*11+"rs");
		}else{
			amt=(50*0)+(50*3)+(50*5)+(50*8)+(50*11)+((u-250)*20);
		    System.out.println("50 x 0rs = 0rs"); 
			System.out.println("50 x 3rs = 150rs");
			System.out.println("50 x 5rs = 250rs");
			System.out.println("50 x 8rs = 400rs");
			System.out.println("50 x 11rs = 550rs");
		    System.out.println((u-250)+"x 20 rs ="+((u-200)*20+"rs"));

		}
		System.out.println("amount="+amt+"rs");
		if (d==0)
		{
			double discount=amt*5/100;
			System.out.println("discount="+discount+"rs");
			amt-=discount;
		}else {
			double interest=d*10/100;
			System.out.println("fine for dues="+interest+"rs");
			amt=amt+d+interest;
		}
		System.out.println("net amount="+amt+"rs");
	}
}

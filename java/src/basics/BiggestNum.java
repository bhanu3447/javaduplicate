package basics;
import java.util.Scanner;


public class BiggestNum {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number: ");
		int number1=scn.nextInt();
		int number2=scn.nextInt();
		int number3=scn.nextInt();
		if (number1>number2&&number1>number3)
			System.out.println(number1+"is the biggest");
		else if(number2>number3&&number2>number1)
			System.out.println(number2+"is the biggest");
		else if(number3>number1&&number3>number2)
			System.out.println(number3+"is the biggest");
		else
			System.out.println("all are same");
	}

}

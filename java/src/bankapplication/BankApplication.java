package bankapplication;

import java.util.Scanner;

class Bank
{
	public double rateofinterestforhomeloans()
	{
		return 0.0;
	}
}
class HDFC extends Bank
{
	@Override
	public double rateofinterestforhomeloans()
	{
		return 0.15;
	}
}
class ICICI extends Bank
{
	@Override
	public double rateofinterestforhomeloans()
	{
		return 0.12;
	}
}
class SBI extends Bank
{
	@Override
	public double rateofinterestforhomeloans()
	{
		return 0.09;
	}
}
class Salesman
{
	public void salesOfLoans(Bank bank,double Amount)
	{ 
		System.out.println(bank);
		double rateOfInterest=bank.rateofinterestforhomeloans();
		int roiOfLoans=(int) (rateOfInterest*100);
		System.out.println(roiOfLoans+"% of interest will be charged");
		double totalInterest=Amount*rateOfInterest;
		System.out.println(totalInterest+"is the interest charged...!");
		double grandTotal=Amount+totalInterest;
		System.out.println(grandTotal+"is the amount to be paid for the loan amount"+Amount);
		
	}
}
public class BankApplication
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount=scn.nextDouble();
		
		Salesman s = new Salesman();
		s.salesOfLoans(new HDFC(),amount);
		System.out.println("*****************");
		s.salesOfLoans(new ICICI(),amount);
		System.out.println("*****************");
		s.salesOfLoans(new SBI(),amount);
	}

}

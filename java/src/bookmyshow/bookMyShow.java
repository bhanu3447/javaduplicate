package bookmyshow;

import java.util.Scanner;

class Theatre
{
	int seats=50;
	private static Theatre t=null;   //every class is a non primitive data typef
	private Theatre() {} 
	public static Theatre getInstance()
	{
		if(t==null) t=new Theatre();
		return t;
	}
	public void reserveseats(int numseats)
	{
		if(numseats>seats)
			{
			    System.out.println(numseats+"are not available");
			    System.out.println(seats+"are available");
			    return;
			}
		seats=seats-numseats;
        System.out.println(numseats+"are reserved");
        System.out.println(seats+"are available");
	}
	
}
class bookingApp
{
	public void Booktickets()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("tickets: ");
		int tickets=scn.nextInt();
		Theatre theatre=Theatre.getInstance();
		theatre.reserveseats(tickets);
	}
	
}
public class bookMyShow
{
	public static void main(String[] args) 
	
	{
		bookingApp costumer1 = new bookingApp();
		costumer1.Booktickets();
		
		bookingApp costumer2 = new bookingApp();
		costumer1.Booktickets();
		
		bookingApp costumer3 = new bookingApp();
		costumer1.Booktickets();
	}
}
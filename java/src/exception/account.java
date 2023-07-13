package exception;

public class account
{
 private int bal;
 public account(int b)
 {
	 bal=b;
 }
 public int getbal()
 {
	 return bal;
 }
 public void withdraw(int amount) throws insufficientbalexception
 {
	 if(amount>bal)
	 {
		 throw new insufficientbalexception();
	 }
	 bal=bal-amount;
 }
}

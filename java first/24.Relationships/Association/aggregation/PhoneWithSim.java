class SimOperator
{
	String simname;
	public SimOperator(String simname)
	{
		this.simname=simname;
	}
	public void CallImplementation()
	{
		System.out.println(simname+" is used for calling");
	}
}
class Phone
{
	String Phonename;
    public Phone(String Phonename)
	{
		this.Phonename=Phonename;
	}
	public void call(SimOperator s)
	{
		s.CallImplementation();
	}
}
class PhoneWithSim
{
	public static void main(String[] args) 
	{
	//	Phone p=new Phone("Nokia");
	//	p.call(new SimOperator("idea"));
		SimOperator sim=new SimOperator("Airtel");
		Phone p=new Phone("Nokia");
		p.call(sim);
	}
}

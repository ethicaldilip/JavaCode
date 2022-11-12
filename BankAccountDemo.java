class Bank
{
	private int p;
	private double r;
	private double t;
	Bank(int p,double r,double t)
	{
		this.p=p;
		this.r=r;
		this.t=t;
	}
	void printInterst()
	{
		CalcInterest c=new CalcInterest();
		double res=c.calinterset();
		System.out.println("Interst is: "+res);
	}
	class CalcInterest
	{
		double calinterset()
		{
			double si;
			si=(p*r*t)/100;
			return si;
		}
	}
}
class BankAccountDemo
{
	public static void main(String []a)
	{
		Bank b=new Bank(500,8.3,2);
		b.printInterst();
	}
}
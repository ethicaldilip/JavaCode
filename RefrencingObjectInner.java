class Batsman
{
	private int runs;
	private int matches;
	Batsman(){}
	Batsman(int runs, int matches)
	{
		this.runs=runs;
		this.matches=matches;
	}	
	class AvgCal
	{	
		Batsman b1;
		double avg;
		double calAverage()
		{
			avg=runs/matches;
			return avg;
		}
	}
}
class RefrencingObjectInner
{
	public static void main(String []Args)
	{
		b1=new Batsman(1000,23);
		Batsman.AvgCal avgcal=b1.new AvgCal();
		double res=avgcal.calAverage();
		System.out.println("Batsman Average is "+res);
	}
}
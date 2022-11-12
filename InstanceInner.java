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
		double avg;
		double calAverage()
		{
			avg=runs/matches;
			return avg;
		}
	}
}
class InstanceInner
{
	public static void main(String []Args)
	{
		Batsman b=new Batsman(1000,23);
		Batsman.AvgCal avgcal=b.new AvgCal();
		double res=avgcal.calAverage();
		System.out.println("Batsman Average is "+res);
	}
}
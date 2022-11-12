interface Shape
{
	//double area;
	void calArea();
	void printArea();
}
class circle implements Shape
{
	double area;
	double r;
	circle(double r)
	{
		this.r=r;
	}
	public void calArea()
	{
		area=3.14*r*r;
	}
	public void printArea()
	{
		System.out.println("Area is: "+area);
	}
}
class Rectangle implements Shape
{
	double area;
	double l,b;
	Rectangle(double l, double b)
	{
		this.l=l;
		this.b=b;
	}
	public void calArea()
	{
		area=l*l;
	}
	public void printArea()
	{
		System.out.println("Area is: "+area);
	}
}
public class InterfaceDemo
{
	public static void main(String []Args)
	{
		circle c=new circle(2.5);
		c.calArea();
		c.printArea();
	}
}
	
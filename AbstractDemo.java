import java.util.*;
abstract class shape
{
	double area;
	abstract void calArea();
	void printArea()
	{
		System.out.println("Area is :"+area);
	}
}
	class Circle extends shape
	{
		double radius;
		Circle(double radius)
		{
			this.radius=radius;
		}
		void calArea()
		{
			area=3.14*radius*radius;
		}
	}
	class Rectangle extends shape
	{
		double len,br;
		Rectangle(){}
		Rectangle(double len,double br)
		{
			this.len=len;
			this.br=br;
		}
		void calArea()
		{
			area=len*br;
		}
	}
	class Square extends shape
	{
		double s;
		Square(double s)
		{
			this.s=s;
		}
		void calArea()
		{
			area=s*s;
		}
	}
class AbstractDemo
{
	public static void main(String []Args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("To calculate area press 1 for Circle press 2 for Rectangle press 3 for square");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.println("Enter the value of radiuse");
				double i=sc.nextDouble();
				Circle c=new Circle(i);
				c.calArea();
				c.printArea();
				break;
			}
			case 2:
			{
				System.out.println("Enter the values of sides");
				double i=sc.nextDouble();
				double j=sc.nextDouble();
				Rectangle rect=new Rectangle(i,j);
				rect.calArea();
				rect.printArea();
				break;
			}
			case 3:
			{
				System.out.println("Enter the valuse of side");
				double i=sc.nextDouble();
				Square s=new Square(i);
				s.calArea();
				s.printArea();
				break;
			}
			default:
			System.out.println("You entered wrong values");
		}
	}
}

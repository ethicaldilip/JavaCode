class Outer
{
    int x = 10;
    static int y = 20;
    static class Inner 
    {
        void show()
        {
            System.out.println(y);
        }
    }
}
public class StaticInnerDemo
{
    public static  void main(String []args)
    {	
		System.out.println("Inner class method accessed by Inner class object ");
        Outer.Inner i = new Outer.Inner();
        i.show();
		//System.out.println(x);
    }
}

class area
{
	area(int a)
	{
		System.out.println("Area of square= "+a*a);
	}

	area(int a,int b)
	{
		System.out.println("Area of rectangle= "+a*b);
	}

	area(double a,double b,double c)
	{
		double s=(a+b+c)/3;
		double p=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle= "+ p);
	}

	public static void main(String args[])
	{
		area obj1=new area(10);
		area obj2=new area(6,5);
		area obj3=new area(4,1,3);
	}
}
import java.util.Scanner;

class method
{
	int val;

	void calc_area()
	{
		System.out.println("Area = "+val*val);
	}

	void calc_per()
	{
		System.out.println("Perimeter = "+val*4);
	}

	method(int x)
	{
		val=x;
		calc_area();
		calc_per();
	}

	public static void main(String args[])
	{
		method obj=new method(5);
	}
}
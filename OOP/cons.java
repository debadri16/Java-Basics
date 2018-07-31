import java.util.Scanner;

class cons
{
	
	cons()
	{
		System.out.println("Default constructor");
	}

	cons(String x)
	{
		System.out.println("Parameterized constructor___"+x);
	}

	public static void main(String args[])
	{
		cons obj=new cons();
		cons obj2=new cons("LOL");
	}
}
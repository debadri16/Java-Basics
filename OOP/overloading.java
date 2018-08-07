
class overloading
{
	int a;

	overloading()
	{
		a=3;
	}

	overloading(int m)
	{
		a=m;
	}

	void display()
	{
		System.out.println(a);
	}

	void display(String s)
	{
		System.out.println(s);
	}

	public static void main(String args[])
	{
		overloading x=new overloading();
		x.display();
		overloading y=new overloading(160);
		y.display();
		x.display("Overloaded");
	}
}

class stat
{
	int a;

	static
	{
		System.out.println("Static block");		
	}

	static void display()
	{
		System.out.println("Static method");
	}

	public static void main(String args[])
	{
		System.out.println("Main");
		display();
	}
}
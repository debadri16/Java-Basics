
class car
{
	int capa,seats,airbags,speed;
	String stearing;

	car(int c,int s,int a,String st,int sp)
	{
		capa=c;
		seats=s;
		airbags=a;
		stearing=st;
		speed=sp;
	}

	void display()
	{
		System.out.println("Capa= "+capa);
		System.out.println("Seats= "+seats);
		System.out.println("Airbags= "+airbags);
		System.out.println("Stearing= "+stearing);
		System.out.println("Speed= "+speed);
	}

	public static void main(String args[])
	{
		car x=new car(160,4,2,"Power",180);
		car y=new car(180,6,4,"Normal",320);
		car z=new car(280,8,4,"Power",260);

		y.display();
	}
}
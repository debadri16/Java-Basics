import java.util.Scanner;

class employee
{
	int eid;
	String ename;
	int salary;

	employee()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id");
		eid=s.nextInt();
		s.nextLine();
		System.out.println("Enter name");
		ename=s.nextLine();
		System.out.println("Enter salary\n");
		salary=s.nextInt();
	}

	public static void main(String args[])
	{
		employee obj[]=new employee[5];
		for(int i=0;i<5;i++)
		{
			obj[i]=new employee();
			//System.out.println("Name: "+obj[i].ename);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Name: "+obj[i].ename+" Id: "+obj[i].eid+" Salary: "+obj[i].salary);
		}
	}
}
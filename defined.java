import java.util.Scanner;
import java.net.InetAddress;

class student
{
	int id;
	String name;
	String dept;

	public void det()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter student id name & dept\n");
		id = s.nextInt();
		s.nextLine();
		name=s.nextLine();
		dept = s.nextLine();
		System.out.print("\nName :"+name+"\nDept :"+dept+"\nId :"+id+"\n");
	}
}

class defined
{
	void carea()
	{
		System.out.print("Enter radius of circle ");
		Scanner s=new Scanner(System.in);
		float rad=s.nextFloat();
		System.out.print("Area = "+3.14*rad*rad+"\n");
	}

	void rarea()
	{
		System.out.print("Enter length and breadth of rectangle\n");
		Scanner s=new Scanner(System.in);
		float l=s.nextFloat();
		float b=s.nextFloat();
		System.out.print("Area = "+l*b+"\n");
	}

	void sarea()
	{
		System.out.print("Enter edge of square ");
		Scanner s=new Scanner(System.in);
		float e=s.nextFloat();
		System.out.print("Area = "+e*e+"\n");
	}

	void largest()
	{
		System.out.print("Enter three numbers\n");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=s.nextFloat();

		float res=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.print("Ans"+res+"\n");
	}

	void reverse()
	{
		System.out.print("Enter a number ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int r,sum=0;
		while(a!=0)
		{
			r=a%10;
			sum=r+(10*sum);
			a=a/10;
		}
		System.out.print(sum+"\n");
	}

	void printn()
	{
		System.out.print("Enter limit ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int temp=0;
		System.out.print("Enter the array\n");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			if(temp<a[i])
			{
				temp=a[i];
			}
		}
		
		System.out.print("The array is\n");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nLargest value is "+temp+"\n");
		
	}

	public static void main(String args[]) throws Exception
	{
		System.out.print("\nHello World\n\n");
		other obj=new other();
		defined obj1=new defined();
		student obj2=new student();
		Scanner s=new Scanner(System.in);
		int i=1;
		while(i>0)
		{
			System.out.print("\nChoose one option :\n1. Area of circle\n2. Area of rectangle\n3. Area of square\n4. Find largest of 3 numbers\n5. Reverse a number\n6. Print n numbers\n7. Show my ip\n8. Student details\n");	
			i=s.nextInt();
			switch(i)
			{
				case 1:obj1.carea();break;
				case 2:obj1.rarea();break;
				case 3:obj1.sarea();break;
				case 4:obj1.largest();break;
				case 5:obj1.reverse();break;
				case 6:obj1.printn();break;
				case 7:System.out.print(InetAddress.getLocalHost()+"\n");break;
				case 8:obj2.det();break;
				case 0:System.out.print("\nBye");
				default:System.out.print("\nPress 0 to exit\n");
			}
		}
	}
}
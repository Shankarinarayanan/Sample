import java.util.Scanner;
/*
class whil
{
	public static void main (String[] args)
	{
		whil m = new whil();
		m.emp();
		Scanner scan = new Scanner(System.in);
		boolean stop = false;
		
		while(!stop)
		{	
			
			System.out.print("Do You want one more record - ");
			String sc = scan.nextLine();
			
			if(sc.equals("yes"))
			{
				m.emp();
				stop = false;
			}
			
			else
			{
				System.out.println("Thank you & you are welcome");
				break;
			}	
		}	
		
	}
	void emp()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Your ID No. - ");
		int empid = s.nextInt();
		System.out.print("Enter Your Name - ");
		String empname = s.next();
		System.out.print("Enter Your Salary - ");
		float empsalary = s.nextFloat();			
		System.out.println("Your ID : "+empid);
		System.out.println("Your Name : "+empname);
		System.out.println("Your Salary : "+empsalary);
		System.out.println("Thank you");
	}
}


class dowhil
{
	
	String exe;
	public static void main (String[] args)
	{
		dowhil dw = new dowhil();
		do
		{
			dw.dwhil();
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Do You want one more record - ");
			dw.exe = scan.nextLine();
		}while(dw.exe.equals("yes"));
		
	}
	
	void dwhil()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Your ID No. - ");
		int empid = s.nextInt();
		System.out.print("Enter Your Name - ");
		String empname = s.next();
		System.out.print("Enter Your Salary - ");
		float empsalary = s.nextFloat();			
		System.out.println("Your ID : "+empid);
		System.out.println("Your Name : "+empname);
		System.out.println("Your Salary : "+empsalary);
		System.out.println("Thank you");
	}
}


class test
{
	int a1 = 20 ; //instance variable
	int a2 = 30 ; //instance variable

	void add()     //instance method
	{
		System.out.println("The sum of addition of two numbers are "+(a1+a2));
	}
	
	void multi()     //instance method
	{
		System.out.println("The sum of multiplication of two numbers are "+(a1*a2));
	}
	
	public static void main(String[] args)
	{
		test t = new test(); //object creation to call instance method
		t.add();
		t.multi();
	}
}

class demo
{
	int in_1 = 50; //instance variable
	int in_2 = 50; //instance variable
}

class testDemo
{
	demo Do = new demo();  //calling class demo
	void add_D()     //instance method
	{	
		System.out.println("The sum of addition of two numbers are "+(Do.in_1+Do.in_2));
	}
	
	void multi_D()     //instance method
	{
		System.out.println("The sum of multiplication of two numbers are "+(Do.in_1*Do.in_2));
	}
	
	public static void main(String[] args)
	{
		testDemo td = new testDemo();
		td.add_D();
		td.multi_D();
	}
}


class test
{
	static int var1 = 10;
	static int var2 = 20;
	
	static void add()
	{
		System.out.println("The sum of addition of two numbers are "+(test.var1+test.var2));
	}
	
	static void multi()
	{
		System.out.println("The sum of multiplication of two numbers are "+(test.var1*test.var2));
	}
	
	public static void main (String [] args)
	{
		test t = new test();
		//calling using class name
		test.add();    //working
		test.multi();  //working
		//calling using object
		t.multi();       //working
		t.add();         //working
		//caling directly
		add();           //working
		multi();         //working
	}
}


class test
{
	int ab = 20;
	int cd = 20;
	
	static void state()
	{
		test te = new test ();
		System.out.println("The sum of addition of two numbers are "+(te.ab+te.cd));
	}
	
	static void sta()
	{
		test te = new test ();
		System.out.println("The sum of multiplication of two numbers are "+(te.ab*te.cd));
	}
	
	public static void main(String[] args)
	{
		state();
		sta();
	}
}


class services
{
	String name ;
	long mobile_no;
	int age ;
	int sscroll_no ;
	String location ;
	float bankbalance ;
	void voteRegister(String name,long mobile_no,int age,int sscroll_no,String location)
	{
		if (age>18 & location.equals("hyderabad"))
		{
			System.out.println("Your voter id number - "+(mobile_no+age+sscroll_no));
		}
		else
		{
			System.out.println("Your not eligible try after sometime.");
		}
	}
	
	static void marry(String name,int age,int bankbalance)
	{
		if(age<18)
		{
			System.out.println("you are not eligible try after sometime");
		}
		else if(age>35)
		{
			System.out.println("Sorry you are too late");
		}
		else
		{
			System.out.println("you are eligible!!!");
		}
	}
}


class test
{
	public static void main(String[] args)
	{
		services serve = new services();
		serve.voteRegister("shankari",876543210,21,180230310,"hyderabad");
		
		services.marry("pavan",39,50000);
	}
}

class eve
{
	public static void main(String[] args)
	{
		int num = 20;
		for(int i = 1, j = 1; i<=num; i++)
		{
			if(i %2 == 0)
			{
				System.out.println(i+" - " +j) ;
				j++;
			}
		}
	}
}


class sum
{
	public static void main(String[] args)
	{
		sum su = new sum();
		su.one_ten();
	}
	
	void one_ten()
	{
		int i, num = 10, s = 0;  
		for(i = 1; i <= num; ++i)  
		{
			//adding the value of i into sum variable  
			s = s + i;  
		}  
		
		System.out.println("1+2+3+4+5+6+7+8+9+10 = " + s); 
		
	}
	
}

*/
class negati
{
	public static void main(String[] args)
	{
		negati neg = new negati();
		neg.tv();
	}
	
	void tv()
	{
		int a_pin = 1234;
		int iter = 4;
		
		for(int i = 1 ; i<=iter ; i++ )
		{
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Your Pin Number - ");
			int u_pin = s.nextInt();
			if(a_pin==u_pin)
			{
				System.out.println("Congratulations your pin is valid");
				break;
			}
			else if (a_pin!=u_pin)
			{
				System.out.println("Sorry Your pin is invalid try again");
				
			}
			
			
		}
	}
}



























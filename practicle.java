import java.util.Scanner;
class operator
{
	public static void main(String[] args)
	{
		System.out.println("Arithmetic operator");
		double a = 10 , b = 22;
		double c = a/b; 
		double d = a%b; 
		System.out.println(a+b); //32.0
		System.out.println(a-b); //-12.0
		System.out.println(a*b); //220.0
		System.out.println(c); //0.45454545454545453
		System.out.println(d); //10.0
		System.out.println("**********************");
		System.out.println("Relational operator");
		System.out.println(a>b); //false
		System.out.println(a<b); //true
		System.out.println(a>=b); //false
		System.out.println(a<=b); //true
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		System.out.println("**********************");
		System.out.println("Bitwise operator");
		System.out.println(10&7);//2
		System.out.println(4&6);//4
		System.out.println(2&4);//0
		System.out.println(10|7); // 15               
		System.out.println(4|6);//6
		System.out.println(2|4);//6
		System.out.println("**********************");
		System.out.println("bitwise calculations"); 
		System.out.println(10&6);//2
		System.out.println(12|11);//15
		System.out.println("logical calculations"); 
		System.out.println(10>20 & 30<40);//false	
		System.out.println(10<20 | 30<40);//true
		System.out.println("**********************");
		System.out.println("Logical operator");
		//It will check the both conditions then only it will give result.
		if(10<20 & 10>5)//both cond should be true.
		{	System.out.println("Good morning");//good night
		}
		else
		{	System.out.println("Good Night");	
		}
		
		operator o = new operator();
		o.m1();
		o.m2();
	}
	
	void m1()
	{
		//if the first condition is true then only second condition exec.
		if((10>20) && (10<5))
		{	System.out.println("Good morning");//good night
		}
		else
		{	System.out.println("Good Night");	
		} 
		//
		if(10<20 | 10<5)//any one cond should be true then only true.
		{	System.out.println("Good morning");//Good morning
		}  
		else
		{	System.out.println("Good Night");		
		}    
		//
		if(10<20 || 10<5)
		{	System.out.println("Good morning");//Good morning
		}
		else
		{	System.out.println("Good Night");				
		}  
		int ad = 10;
		System.out.println(--ad - ad--);
		
	} 
	
	void m2()
	{
		int sc = 10000;
		
		switch (sc)
		{
			case 1000 : System.out.println("Its 1000 not 10");
			break;
			case 100 : System.out.println("Its 100 not 10");
			break;
			case 10 : System.out.println("Its 10!!!");
			break;
			default : System.out.println("Its not 1000, 100, 10");
			break;
		}
		
		System.out.println("**********************");
		//conditional operator.
		String cond = 10>5? "ten":"five";
		System.out.println(cond);
		int i = 0;
		int j = 0;
		while (i<10)
		{
			j++;
			System.out.println("its while loop - "+j);
			i++;
		}
		
		System.out.println("**********************");
		/*
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
		
		System.out.println("Do You want one more record");
		String yn = s.next();
		*/
		//String yes = true;
		//String No = false;
		
		if (yn == yes)
		{
			String yes = true;
			String No = false;
			while(true)
			{
				Scanner s = new Scanner(System.in);
				System.out.println("Enter Your ID No. - ");
				int empid = s.nextInt();
				System.out.println("Enter Your Name - ");
				String empname = s.next();
				System.out.println("Enter Your Salary - ");
				float empsalary = s.nextFloat();
				
				System.out.println("Your ID : "+empid);
				System.out.println("Your Name : "+empname);
				System.out.println("Your Salary : "+empsalary);
				
				System.out.println("Do You want one more record");
				String yn = s.next();
				
				String yes = true;
				String No = false;
			}
		}
		else
		{
			System.out.println("Thank you");
		}
	}
}














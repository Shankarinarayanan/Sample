import java.util.Scanner;
class TwoNum
{
	static int num;
	void numbers()
	{
		TwoNum Two = new TwoNum();
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a two digits value --> ");
		Two.num	= s.nextInt();
		
		
	}
}

class Swap extends TwoNum
{
	public static void main(String args[])
	{
		int reverse,balance;
		Swap um1 = new Swap();
		um1.numbers();
		reverse = num-(num/10)*10;
		balance = (num/10);
		System.out.println(reverse+""+balance);
	}
}

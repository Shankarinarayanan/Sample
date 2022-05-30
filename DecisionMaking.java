package Java_Basics;


import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        /*
        WhetherPosNeg PN = new WhetherPosNeg();
        PN.numType();

        LadderWhetherPosNeg Lpn = new LadderWhetherPosNeg();
        Lpn.LadderNumType();

        Quadratic q = new Quadratic();
        q.Equation();
         */

    }
}

class WhetherPosNeg {
    void numType()
    {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter a number ==> ");
        int num = Scan.nextInt();
        if (num>0)
        {
            System.out.println("The entered number "+num+ " is Positive");
        }
        else {
            System.out.println("The entered number "+num+ " is negative");
        }
    }
}

class LadderWhetherPosNeg
{
    void LadderNumType()
    {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter a number ==> ");
        int num = Scan.nextInt();
        if (num > 0)
        {
            System.out.println("The entered number "+num+ " is Positive");
        }
        else if (num < 0)
        {
            System.out.println("The entered number "+num+ " is negative");
        }
        else {
            System.out.println("The entered number "+num+ " is Zero");
        }
    }
}

class Quadratic
{
    void Equation()
    {
        double a,b,c,d,r1,r2;
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter a value-A --> ");
        a = Scan.nextDouble();
        System.out.print("Enter a value-B --> ");
        b = Scan.nextDouble();
        System.out.print("Enter a value-C --> ");
        c = Scan.nextDouble();

        d = (Math.pow(b,2))-4*a*c;
        //d = b*b-4*a*c;

        if (d > 0)
        {
            double r3 = (-b+Math.pow(d,0.5))/2*a;
            double r4 = (-b-Math.pow(d,0.5))/2*a;
            r1 = -b+Math.sqrt(d)/2*a;
            r2 = -b-Math.sqrt(d)/2*a;
            //youtube
            System.out.println("The Roots are real and Distinct.\nThe value of Root-1 is "+r1+"\nThe value of Root-2 is "+r2);
            //Google
            System.out.println("The Roots are real and Distinct.\nThe value of Root-3 is "+r3+"\nThe value of Root-4 is "+r4);
        }
        else if (d == 0) {
            r1 = -b/2*a;
            r2 = -b/2*a;
            System.out.println("The Roots are Equal.The value of Root is "+r1);
            //System.out.println("The Roots are Equal.The value of Root is "+r1+" "+r2);
        }
        else
        {
            System.out.println("The Roots are Imaginary.");
        }
    }
}



















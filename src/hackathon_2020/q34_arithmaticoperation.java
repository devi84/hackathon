package hackathon_2020;

import java.util.Scanner;

public class q34_arithmaticoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		add(x1,y1);

	}
public static void add(double x, double y)
{double result=x+y;
System.out.println("add:"+result);
}
public static void sub(double x, double y)
{double result=x-y;
System.out.println("sub:"+result);
}
public static void mul(double x, double y)
{double result=x*y;
System.out.println("mul:"+result);
}
public static void div(double x, double y)
{double result=x/y;
System.out.println("div:"+result);
}
}

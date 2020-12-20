package hackathon_2020;

import java.util.Scanner;

public class q02_factorial_nonrecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int fact=1;
		for(int i=x;i>1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of given:"+fact);

	}

}

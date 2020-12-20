package hackathon_2020;

import java.util.Scanner;

public class q28_factorial_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int i=sc.nextInt();
		System.out.println("Factorial of given: " + factorial(i));

	}
	public static int factorial(int i)
	{
		int fact=1;
		if(i>0)
			{
			fact=i * factorial(i-1);
			
			}
		return fact;
		//System.out.println("Factorial of given number :" +i*factorial(i-1));
		
	}

}

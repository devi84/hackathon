package hackathon_2020;

import java.util.Scanner;

public class q01_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean a=sc.nextBoolean();
		boolean b=sc.nextBoolean();
		boolean c=sc.nextBoolean();
		if((a&&b)||(b&&c) ||(a&&c))
		{System.out.println("two values are true");
		}
		else
			System.out.println("two values are not true");
			
				
			
		

	}

}

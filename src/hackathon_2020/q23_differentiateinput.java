package hackathon_2020;

import java.util.Scanner;

public class q23_differentiateinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int ch1;
		Scanner one = new Scanner(System.in);
		System.out.println("enter your input");
		input = one.nextLine();
		try {
		ch1 = Integer.parseInt(input);
		System.out.println("integer");
		return;
		}
		catch (NumberFormatException e) {
		}
		try {
		if(input.equalsIgnoreCase("true")||input.equalsIgnoreCase("false")){
		System.out.println("boolean");
		return;
		}
		else{
		System.out.println("String");
		return;
		}
		} catch (NumberFormatException e) {
		}


	}

}

package hackathon_2020;

import java.util.Scanner;

public class q12_palindrome_string_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		System.out.println("Enter the integer: ");
		int num=sc.nextInt();
		palindrome_String(str);				
		palindrome_integer(num);

	}
	public static void palindrome_String(String str)
	{
		String str_reverse="";
		for(int i=str.length()-1;i>=0;i--)
	{
		str_reverse+=str.charAt(i);
	}
	System.out.println(str_reverse);
	if(str.equals(str_reverse))
	{
		System.out.println("Given string is palindrome");
	}
	else
		{System.out.println("Given string is not palindrome");
		
		}
		
	}
	public static void palindrome_integer(int num)
	{
		int x=0;
		int x1=num;
		while(num>0)
	{
		
		x=x*10;
		x=x+num%10;
		num=num/10;
		
	}
	System.out.println(x);
	if(x1==x)
	{System.out.println("Given number is  palindrome");
	
	}
	else
	{
		System.out.println("Given number is not palindrome");
	}
		
	}

}

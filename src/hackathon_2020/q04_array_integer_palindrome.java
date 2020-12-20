package hackathon_2020;

import java.util.Scanner;

public class q04_array_integer_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int array_size=sc.nextInt();
		int a[]=new int[array_size];
		int flag=0;
		for(int i=0;i<array_size;i++)
		{
			int x=sc.nextInt();
			a[i]=x;
		}
		for(int i=0;i<=(array_size/2);i++)
		{
			if(a[i]!=a[array_size-i-1])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{System.out.println("Array is not palindrome");
		}
		else if(flag==0)
		{System.out.println("array is palindrome");
		}
		
		

	}

}

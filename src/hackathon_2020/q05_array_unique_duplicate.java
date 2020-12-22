package hackathon_2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class q05_array_unique_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int array_size=sc.nextInt();
		int a[]=new int[array_size];
		System.out.println("array values are:");
		for(int i=0;i<array_size;i++)
		{
			int x=sc.nextInt();
			a[i]=x;
			//System.out.println(a[i]);
			
		}
		HashSet<Integer> s=new HashSet<>();
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<array_size;i++)
		{
			if(!s.contains(a[i]))
			{s.add(a[i]);
			
			}
			else
				
			{al.add(a[i]);
			s.remove(a[i]);
			
		
		}
		}
		System.out.println(" Given Array :");
		for(int value:a)
			{System.out.print(value +" ");}
		System.out.println("\n unique integer:");
		System.out.println(s);
		System.out.println("duplicate integer:");
		System.out.println(al);
		

	}

}

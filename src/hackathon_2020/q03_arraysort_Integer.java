package hackathon_2020;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class q03_arraysort_Integer {

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
		
		Arrays.sort(a);
		for(int i:a)
		{System.out.println(i);
		}
		
	}

}

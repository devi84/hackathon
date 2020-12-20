package hackathon_2020;

import java.util.Scanner;

public class q06_selection_sort {

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
			
		}
		System.out.println("Before sorting:");
		for(int i:a)
		{System.out.print(i +" ");
		}		
		selectionsort(a);
		System.out.println("\n After sorting:");
		for(int i:a)
		{System.out.print(i +" ");
		}	
		

	}
	public static void selectionsort(int[] a)
	{
		System.out.println("\n method before sorting:");
		for(int i:a)
		{System.out.print(i +" ");
		}	
		int min=a[0];
		int x;
		for(int i=0;i<a.length-1;i++)
			
		{
			int minindex=i;
			for(int j=i+1; j<a.length;j++)
				{if(a[j]<a[minindex])
					minindex=j;
				
			x=a[minindex]; 
			a[minindex]=a[i];
			a[i]=x;}
		}
		System.out.println("\n method After sorting:");
		for(int i:a)
		{System.out.print(i +" ");
		}	
		
	}

}

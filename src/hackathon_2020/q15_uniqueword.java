package hackathon_2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class q15_uniqueword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		reverse_word(str);
	}
		public static void reverse_word(String str)
		{
			HashSet<String> str_unique=new HashSet<>();
			String str_array[]=str.split(" ");
			for(int j=str_array.length-1;j>=0;j--)
			{
				if(!str_unique.contains(str_array[j]))
						str_unique.add(str_array[j]);
				else
					str_unique.remove(str_array[j]);
					
			}
		System.out.println(str_unique);
		
		
			
		}

}

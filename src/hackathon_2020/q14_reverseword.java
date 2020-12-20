package hackathon_2020;

import java.util.ArrayList;
import java.util.Scanner;

public class q14_reverseword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		reverse_word(str);
	}
		public static void reverse_word(String str)
		{
			ArrayList<String> str_reverse=new ArrayList<>();
			String str_reverse1="";
			String str_array[]=str.split(" ");
			for(int j=str_array.length-1;j>=0;j--)
			{
				str_reverse.add(str_array[j]);
				str_reverse1+=str_array[j];
				str_reverse1+=" ";
			}
		System.out.println(str_reverse);
		System.out.println(str_reverse1);
		
			
		}

	;
}

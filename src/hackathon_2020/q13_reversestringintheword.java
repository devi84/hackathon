package hackathon_2020;

import java.util.Scanner;

public class q13_reversestringintheword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		//String str=sc.nextLine();
		/*reverse_word(str);
	}
		public static void reverse_word(String str)
		{
			String str_reverse="";
			String str_array[]=str.split(" ");
			for(int j=str_array.length-1;j>=0;j--)
			{
				for(int i=str_array[j].length()-1;i>=0;i--)
				{
					str_reverse+=str.charAt(i);
					//System.out.println(str_reverse);
				}
				str_reverse+=" ";
			}
		System.out.println(str_reverse);
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("enter input string");
		String str=scan.nextLine();
		for(int i=str.length()-1;i>=0;i--){
		System.out.print(str.charAt(i));
			
		}

	}

}

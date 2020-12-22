package hackathon_2020;

import java.util.Scanner;

public class q30_longest_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		
		String palindrome_string[]=new String[5];
		String reverse_str=" ";
	    int k=0;
		//str=welcome madam hi malayalam
		for(int i=0;i<str1.length;i++)
		{ if(str1[i]!=" ")
		{ for(int j=str1[i].length()-1;j>=0;j--)
		{   
			reverse_str+=str1[i].charAt(j);
			
				
		}
		
		if((reverse_str.trim()).equals(str1[i]))
		{
			palindrome_string[k]=reverse_str.trim();
			//System.out.println("palindrome:  "+ palindrome_string[k]);
			k++;
		}
		reverse_str=" ";
		//System.out.println("palindrome:  "+ palindrome_string[k]);
			
		}
		/*for(int a=0; a<palindrome_string.length;a++)
		{  if(palindrome_string[a]!=null)
		{
			System.out.println(palindrome_string[a]);
		}
		}*/
			
		}
		//System.out.println("length of palindrome_string: "+palindrome_string.length);
		String palindrome_long= palindrome_string[0];
		
		for(int z=0;z<palindrome_string.length-1;z++)
		{   if(palindrome_string[z]!=null)
		{
			if(palindrome_long.length() < palindrome_string[z].length())
			{
				palindrome_long=palindrome_string[z];
			}
		}
		}
		
		System.out.println("Longest palindrome of Given word is:  " + palindrome_long );
	}

}

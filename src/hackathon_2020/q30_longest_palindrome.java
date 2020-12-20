package hackathon_2020;

import java.util.Scanner;

public class q30_longest_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		int long_str_length=str1[0].length();
		String long_str=str1[0];
		
		for(int i=0;i<str1.length;i++)
		{
			for(int j=i+1;j<str1.length-1;j++)
		      { if(str1[i].length()>str1[j].length())
				{ long_str=str1[i];
				if(i!=str1.length)
				{System.out.println("i:"+i+"\tStr1[i]:"+str1[i]+"long:"+long_str);
				//continue;
				}
				
			}
		else 
		{long_str=long_str;
			//continue;
		}
		  
		      }
			
		}
		System.out.println(long_str);

	}

}

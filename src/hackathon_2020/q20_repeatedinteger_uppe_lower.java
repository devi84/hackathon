package hackathon_2020;

import java.util.ArrayList;
import java.util.Scanner;

public class q20_repeatedinteger_uppe_lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string which consists of integer,uppercase and lowercase string: ");
		String str1=sc.next();
		ArrayList<Character> rep_Int=new ArrayList<>();
		ArrayList<Character> rep_ch_Upper=new ArrayList<>();
		ArrayList<Character> rep_ch_Lower=new ArrayList<>();
		
		
		int count_integer=0;
		int count_upper=0;
		int count_lower=0;
		for(int i=0;i<str1.length();i++)
		{
			
		if(str1.charAt(i)>='0' && str1.charAt(i)<='9')
		{   if(!rep_Int.contains(str1.charAt(i)))
			   rep_Int.add(str1.charAt(i));
		    else
			   count_integer+=1;
		}
			
		else if(str1.charAt(i)>='A' && str1.charAt(i)<='Z')
		{ if(!rep_ch_Upper.contains(str1.charAt(i)))
			rep_ch_Upper.add(str1.charAt(i));
	      else
			count_upper+=1;
		}
		else if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
		{ if(!rep_ch_Lower.contains(str1.charAt(i)))
			rep_ch_Lower.add(str1.charAt(i));
	       else
			count_lower+=1;
		}
		else 
			continue;
		}
		System.out.println("Repeated_count_integer: "+count_integer + "\tRepeated_count_upper: "+ count_upper +"\tRepeated_count_lower: "+count_lower);
		System.out.println("Repeated_count_integer: "+rep_Int + "\trep_ch_Upper: "+ rep_ch_Upper +"\trep_ch_Lower: "+rep_ch_Lower);


	}

}

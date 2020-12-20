package hackathon_2020;

import java.util.ArrayList;

public class q18_duplicatecharinthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Welcomeone";
		ArrayList<Character> al=new ArrayList<>();
		ArrayList<Character> al1=new ArrayList<>();
		//int a[]=new int[]{};
		for(int i=0;i<str1.length();i++)
		{
			//if(str1.charAt(i).contains)
			if(!al.contains(str1.charAt(i)))
			{al.add(str1.charAt(i));
			
			}
			else
				if(!al1.contains(str1.charAt(i)))
				{
					al1.add(str1.charAt(i));
						}
		}
		System.out.println(al1);
	}

}

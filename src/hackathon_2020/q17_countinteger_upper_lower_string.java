package hackathon_2020;

public class q17_countinteger_upper_lower_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="123WelcomeH";
		int count_integer=0;
		int count_upper=0;
		int count_lower=0;
		for(int i=0;i<str1.length();i++)
		{
			
		if(str1.charAt(i)>='0' && str1.charAt(i)<='9')
		{
			count_integer+=1;
		}
			
		else if(str1.charAt(i)>='A' && str1.charAt(i)<='Z')
		{
			count_upper+=1;
		}
		else if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
		{
			count_lower+=1;
		}
		else 
			continue;
		}
		System.out.println("count_integer: "+count_integer + "\tcount_upper: "+ count_upper +"\tcount_lower: "+count_lower);

	}

}

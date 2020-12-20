package hackathon_2020;

public class q19_occurrenceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome".toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			occurrence(str.charAt(i),count);
			
		}

	}
	public static void occurrence(char ch,int count)
	{
		count+=1;
		System.out.println(ch +": " +count);
	}

}

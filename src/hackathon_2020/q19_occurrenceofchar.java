package hackathon_2020;

import java.util.HashMap;
import java.util.Map;

public class q19_occurrenceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome";
		String inputString="happy";
		
			occurrence_usingHashmap(str);
			occurence(str);
			occurence_tekarch(str);
			System.out.println("TEkarch method");
			int[] occured=new int[128];
			for(int i=0;i<inputString.length();i++){
			if(inputString.charAt(i)!=' ')
			occured[inputString.charAt(i)]++;
			}
			for(int j=0;j<occured.length;j++){
			if(occured[j]!=0){
			System.out.println((char)(j) + " occured "+occured[j]+ " times" );
			}
			}
			occurence_tekarch(str);

			
		}

	
	public static void occurrence_usingHashmap(String str)
	{
		HashMap<Character,Integer> charcountMap=new HashMap<Character,Integer>();
		char ch[]=str.toCharArray();
		for(char c: ch)
		{if(charcountMap.containsKey(c))
		{
			charcountMap.put(c,charcountMap.get(c)+1);
			
		}
		else
		{
			charcountMap.put(c, 1);
		}
		}
		for(Map.Entry entry: charcountMap.entrySet())
		{
		System.out.println(entry.getKey()+" ocuurence: "+ entry.getValue());
		}
		
	}
	public static void occurence(String str)
	{
		int counter[] = new int[256]; 

		
		int len = str.length(); 

		
		for (int i = 0; i < len; i++) 
			counter[str.charAt(i)]++; 
		for(int i:counter)
		{
			System.out.println(i);
		}
		// We are creating another array with the size of String
		char array[] = new char[str.length()]; 
	        for (int i = 0; i < len; i++) { 
		   array[i] = str.charAt(i); 
		   int flag = 0; 
		   for (int j = 0; j <= i; j++) { 

			/* If a char is found in String then set the flag 
			 * so that we can print the occurrence
			 */
			if (str.charAt(i) == array[j])  
				flag++;                 
		   } 

		   if (flag == 1)  
		      System.out.println("Occurrence of char " + str.charAt(i)
			 + " in the String is:" + counter[str.charAt(i)]);             
		} 
	}
	public static void occurence_tekarch(String str)
	{
		int[] ch=new int[128];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
			ch[str.charAt(i)]++;
			}
		}
		for(int j=0;j<ch.length;j++)
		{
			if(ch[j]!=0)
			{
				System.out.println((char)(j) + " occured: " + ch[j]);
			}
		}
	}
	
	
}

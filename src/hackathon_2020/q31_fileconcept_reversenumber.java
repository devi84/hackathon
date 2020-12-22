package hackathon_2020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class q31_fileconcept_reversenumber {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str;
		String str_read[]=new String[10];
		FileReader fr=new FileReader("C:\\Users\\devibala7\\Desktop\\tekarch-notes2020\\fileread_q31.txt");
		BufferedReader br=new BufferedReader(fr);
		System.out.println("Read the line from file");
		int i=0;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
			str_read[i]=str;
			i++;
		}
		for(String s:str_read)
		{   if(s!=null)
		{
			System.out.print(s + " , ");	
		}
			
		}
		br.close();
		System.out.println("\nwrite the line to reverse file");
		FileWriter fr1=new FileWriter("C:\\Users\\devibala7\\Desktop\\tekarch-notes2020\\filewrite_q31.txt");
		BufferedWriter bw=new BufferedWriter(fr1);
		for(int j=str_read.length-1;j>=0;j--)
		{System.out.println(str_read[j]);
		bw.write(str_read[j]);
		bw.newLine();
		System.out.println("written"+j);
		}
		bw.close();
		
		
		

	}

}

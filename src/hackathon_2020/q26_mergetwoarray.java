package hackathon_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class q26_mergetwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array1[10] = 1,2,4,6,9,10 array2[4] = 3, 5,7,8 After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10
	
		ArrayList<Integer> array1=new ArrayList<Integer>(Arrays.asList(1,2,4,6,9,10));
		ArrayList<Integer> array2=new ArrayList<Integer>(Arrays.asList(3,5,7,8));
		int size=array1.size()+array2.size();
		System.out.println(array1.get(0));
		for(int i=0;i<array1.size();i++)
		{ 
			for(int j=0;j<array2.size();j++)
			{
				if(array1.get(i)>array2.get(j))
				{
					//System.out.println(array1.get(i)+ " " +i + " "+j+" "+array2.get(j));
					array1.add(i, array2.get(j));
					array2.remove(j);
				}
		 }}
		System.out.println(array1);
		/*for(int k=0;k<size;k++)
		{
			System.out.print(array1.get(k));
		}*/
	}
			
		
		

	}



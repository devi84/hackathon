package hackathon_2020;

public class q25_binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x={10,15,20,25,30};
		int i=20;
		int first=0;
		int last=x.length-1;
		int middle=(first+last)/2;
		while(first<=last)
		{if(x[middle]> i)
			first=middle+1;
		else if (x[middle]==i)
		{System.out.println(i + " found at location " + (middle + 1) + ".");
		break;
		}
		else
			last=middle-1;
		middle=(first+last)/2;
		}
				
		if ( first > last )
		System.out.println(i + " is not present in the list.\n");
		}


}

package hackathon_2020;

public class q24_naturalno_consecutivecomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		int sum=0,c=0,j=0;
		/*for(int j=1;j<(n/2)+1;j++)
		{   int i=j;
		    int k=j;
		    //for(int x=1;x<)
		    int x=i+(i+1)+(i+2);
		    //System.out.println("x:"+ x);
		    int y=k+(k+1);
		    //System.out.println("y:"+ y);
			if(x==n)
			{
				System.out.println("consectutive number:"+i +","+ (i+1) +","+ (i+2));
			}
			else if(y == n)
			{
				System.out.println("consectutive number:"+k+","+ (k+1));
				
			}
				
		}*/
		for(int i=1;i<n;i++)
		{
		sum=i;
		j=i+1;
		while(sum<n)
		{
		sum=sum+j;
		j++;
		}
		if(sum==n)
		{
		for(int k=i;k<j;k++)
		{
		if(k==i)
		System.out.print(k);
		else
		System.out.print(" + "+k);
		}
		System.out.println();
		}
		}

		

	}

}

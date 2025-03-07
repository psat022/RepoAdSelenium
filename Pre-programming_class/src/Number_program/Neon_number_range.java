package Number_program;

public class Neon_number_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	for(int n=1;n<100;n++)
	{
		int sq=n*n;
		int sum=0;
		
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		
		if(sum==n)
		{
			System.out.println(n);
		}
		
	}

	}

}

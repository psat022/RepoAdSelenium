package Number_program;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=2976;
	
	while(n>0)
	{
		int rem=n%10;
		//check 'rem' is prime or not
		int c=0;
		for(int i=1;i<rem;i++)
		{
			if(rem%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println(rem);
		}
		n=n/10;
	}
	}

}

package Number_program;

public class PrintEvenDigitingivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=36528;
	
	while(n>0)
	{
		int rem=n%10;
		//check rem is even
		if(rem %2==0)
		{
			System.out.println(rem);
			
		}
		n=n/10;
	}
	}

}

package Number_program;

public class Neon_number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=9;
	int square=n*n;
	int sum=0;
	
	while(square>0)
	{
		int rem=square%10;
		sum=sum+rem;
		square=square/10;
	}
	
	if(sum==n)
	{
		System.out.println("Neon number is present");
	}
	else
	{
		System.out.println("Neon number is not present");
	}
	}

}

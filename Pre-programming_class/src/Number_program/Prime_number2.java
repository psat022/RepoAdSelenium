package Number_program;

public class Prime_number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
			
		}
		if(c==2)
		{
			System.out.println("Primenumber");
		}
		else
		{
			System.out.println("Not a Primenumber");
		}
	}

}

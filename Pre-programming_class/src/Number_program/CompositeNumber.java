package Number_program;

public class CompositeNumber {

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
		if(c>2)
		{
			System.out.println("Composite Number");
		}
		else
		{
			System.out.println("Not a Composite Number");
		}
		}
	}
	

package Number_program;

public class Perfect_Number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=6;
	int sum=0;
	
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
		
	}
	System.out.println(n+" ->"+sum);
	if(sum==n)
	
		System.out.println("Perfect number");
	else
		System.out.println("Not a perfect Number");
	}
	
}



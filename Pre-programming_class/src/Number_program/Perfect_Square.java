package Number_program;

public class Perfect_Square {
	

	
public static void main(String[] args)
{
	int n=36;
	boolean flag=false;
	
	for(int i=1;i<n;i++)
	{
		if(i*i==n)
		{
			System.out.println(n+"->"+i);
			flag=true;
			break;
		}
	}
	if(flag)
	{
		System.out.println("Perfect sq.");
	}
}

}

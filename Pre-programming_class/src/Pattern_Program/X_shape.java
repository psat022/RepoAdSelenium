package Pattern_Program;

public class X_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=7;
	System.out.println("------------X-shape_pattern------------");
	
	for(int i=1;i<=n;i++)
	{
	for(int j=1;j<=n;j++)
	{
	if(i==j||i+j==n+1)
	{
		System.out.print("* ");
		
	}
	else
	{
		System.out.print("  ");
	}
	}
		System.out.println();
	}
	}

}

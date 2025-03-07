package Pattern_Program;

public class LShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=6;
	System.out.println("--------Lshape------------");
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=n;j++)
	{
	if(i==n||j==1)
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

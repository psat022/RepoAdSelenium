package Pattern_Program;

public class N_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=7;
	System.out.println("-------N_shape------------");
	
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=n;j++) {
	if(j==1||j==n||i==j) {
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

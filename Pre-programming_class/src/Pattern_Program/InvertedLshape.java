package Pattern_Program;

public class InvertedLshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("-------Inverted-Opp-L-shape--------");
	int n=6;
	
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=n;j++) {
	if(i==1||j==n) {
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

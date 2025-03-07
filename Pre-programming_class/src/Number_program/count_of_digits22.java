package Number_program;

public class count_of_digits22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=12345,c=0;
	
	while(n>0)
	{
		n=n/10;
		c++;
	}
	System.out.println("No.of.digits"+c);
	}

}

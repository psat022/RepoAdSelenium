package Number_program;

public class ExtractAllDigits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=786549;
	
	for(int n; n>0 ; n=n/10)
	{
		rem=n%10;
		System.out.println(rem);
	}
	}

}

package Number_program;

public class Perfect_Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int c=0;
	for(int n1=1;n1<=100;n1++)
	{
		int n=n1;sum=0;pro=1;
		
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
		}
	}
	}

}

package Number_program;

public class PrimeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int n=1;n<=10;n++)
	{
	 int c=0;
	 for(int i=1;i<=n;i++)
	 {
		 if(n%i==0)
		 {
			 c++;
		 }
	 }
	 if(c==2)
	 {
		 System.out.println(n);
	 }
	}
	}

}

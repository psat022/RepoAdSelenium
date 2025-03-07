package Number_program;

public class Sumofeachndproductofeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=1234;
	int sum=0,pro=1;
	
	while(n>0)
	{
		int rem=n%10;
		sum=sum+rem;
		pro=pro+rem;
		n=n/10;
	}
	if(sum==pro)
	{
		System.out.println("Number is Spy");
	}
	else
	{
		System.out.println("Number is not a spy");
	}
	}

}

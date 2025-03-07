package Number_program;

public class Sunny_number {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	int n=8,n1=n+1;
	
	boolean flag=false;
	
	for(int i=1;i<=n1;i++)
	{
		flag=true;
		break;
	}
	
	if(flag)
	{
		System.out.println(n+" is sunny number");
	}
		
	else
	{
		System.out.println(n+" is Not a sunny number");
	}
	}

}

package Number_program;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n1=8,n2=12;
	int hcf=0;
	for(int i=1;i<=n1&&i<=n2;i++)
	{
		if(n1%i==0&n2%i==0)
		{
			hcf=i;
		}
		
	}
		System.out.println(hcf);
	}

}

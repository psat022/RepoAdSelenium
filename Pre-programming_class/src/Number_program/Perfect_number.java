package Number_program;

public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int n=1;n<100;n++)
	{
		boolean flag=false;
		
	
	for(int i=1;i<=n;i++)
	{
		if(i*i==n)
		{
			flag=true;
			break;
		}
	}
	
	if(flag)
	{
		System.out.println(n+" Perfect square");
	}
	}
}
}

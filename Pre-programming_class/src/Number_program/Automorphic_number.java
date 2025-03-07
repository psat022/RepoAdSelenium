package Number_program;

public class Automorphic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int n=25,sq=n*n;
	System.out.println(n+"->"+sq);
	while(n>0)
	{
		int r1=n%10;
		int r2=sq%10;
	
	
	if(r1==r2)
	{
		System.out.println(r1+"=="+r2);
		n=n/10;
		sq=sq/10;
	}
	else
	{
		System.out.println(r1+"=="+r2);
		break;
	}
	
	if(n==0)
	System.out.println("Automorphic");
	
	else
	System.out.println("Not a Automorphic");	
		
	}

}
}

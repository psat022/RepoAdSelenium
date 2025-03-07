package Number_program;

public class Sunny_Number_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  for(int n=0 ; n<=100; n++)
	  {
	  int	n1=n+1;
	  }
	
  boolean flag=false;
  for(int i=1;i<=n1;i++)
  {
	  if(i*i==n1)
	  {
		  flag=true;
		  break;
	  }
  }
 if(flag)
 {
	 System.out.println(n+" is a Sunny number");
 }
}
	
}		

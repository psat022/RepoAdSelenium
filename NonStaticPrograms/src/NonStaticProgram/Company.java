package NonStaticProgram;

public class Company {
	
	static String address = "bangalore";
	
	String company_name;
	int no_of_emp;
	
	public void companydetails()
	{
		System.out.println("COMPANY DETAILS");
		System.out.println("COMPANY NAME :"+company_name);
		System.out.println("NO OF EMP :"+no_of_emp);
		System.out.println("ADDRESS :"+address);
	}

}

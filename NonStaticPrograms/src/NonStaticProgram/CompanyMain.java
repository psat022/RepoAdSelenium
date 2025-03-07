package NonStaticProgram;

public class CompanyMain {

	public static void main(String[] args)
	{
		Company c1 = new Company();
		c1.company_name = "TCS";
		c1.no_of_emp = 450;
		c1.companydetails();
		
		System.out.println("-------------------------");
		
		Company c2 = new Company();
		c2.company_name = "HCL";
		c2.no_of_emp = 5000;
		c2.companydetails();
		
	}
}

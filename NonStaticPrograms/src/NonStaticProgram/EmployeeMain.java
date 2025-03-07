package NonStaticProgram;

public class EmployeeMain {
	
	public static void main(String[] args)
	
	{
		
	Employee e1 = new Employee();
	e1.name="AMAN";
	e1.salary=85000;
	e1.designation="manager";
	System.out.println("employee 1 details");
	e1.empdetails();
	
	Employee e2 = new Employee();
	e2.name = "Manish";
	e2.salary=14500;
	e2.designation="HR";
	System.out.println("employee 2 details");
	e2.empdetails();
	}

}

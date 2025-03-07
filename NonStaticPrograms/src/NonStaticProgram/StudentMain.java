package NonStaticProgram;

public class StudentMain {

	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.name="aanand";
		s1.age=14;
		s1.marks=35;
		
		Student s2 = new Student();
		s2.name="Rajesh";
		s2.age=18;
		s2.marks=55;
		
		Student s3 = new Student();
		s3.name="Amitabh";
		s3.age=21;
		s3.marks=87;
		
		System.out.println("Student 1 details");
		System.out.println("NAME :"+s1.name);
		System.out.println("AGE :"+s1.age);
		System.out.println("MARKS :"+s1.marks);
		
		System.out.println("Student 2 details");
		System.out.println("NAME : "+s2.name);
		System.out.println("AGE :"+s2.age);
		System.out.println("MARKS :"+s3.marks);
	}
}

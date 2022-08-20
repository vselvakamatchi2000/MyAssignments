package orgCollege;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Selva Kamatchi");
	}
	public void studentDept()
	{
		System.out.println("Comuter Science");
	}
	public void studentId()
	{
		System.out.println("1852490");
	}
	public static void main(String[] args) {
		Student S=new Student();
		S.collegeName();
		S.collegeCode();
		S.collegeRank();
		S.deptName();
		S.studentName();
		S.studentDept();
		S.studentId();	
		
	}

}

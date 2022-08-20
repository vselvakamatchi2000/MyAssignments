package Assignment3;

public class Department extends Students{
	public void  getStudentInfo(int Id,String Name)
	{
		super.getStudentInfo(Id, Name);
		System.out.println("Student ID: "+ Id + "\n" + "Student Name: "+Name);
	}
	

}

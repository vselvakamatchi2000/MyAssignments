package Annotations;

import org.testng.annotations.Test;

public class LearnAttributes3 {
 
	@Test(priority=2)
	public void StudentName()
	{
		System.out.println("Selva");
	}
	@Test(priority=1)
	public void StudentID()
	{
		System.out.println("12345");
	}
	@Test(priority=0)
	public void Class()
	{
		System.out.println("B");
	}
	@Test(enabled=false)
	public void Age()
	{
		System.out.println("22");
	}
	@Test(invocationCount=5,threadPoolSize=3)
	public void department()
	{
		System.out.println("Chemistry");
	}
	@Test(invocationCount=3,invocationTimeOut=1000)
	public void location()
	{
		System.out.println("Dindigul");
	}
}

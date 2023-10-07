package annotation;

import org.testng.annotations.Test;

public class LearnAttributes1 {

	@Test(invocationCount=5)
	public void ClassA()
	{
		System.out.println("Class A ");
	}
	@Test(invocationCount=5,threadPoolSize=3)
	public void ClassJ()
	{
		System.out.println("Class J ");
	}
	@Test(invocationCount=5,invocationTimeOut=200)
	public void ClassL() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Class B");
	}
	@Test(invocationCount=5,invocationTimeOut=200,alwaysRun=true)
	public void ClassC() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Class C ");
	}
	@Test
	public void ClassH()
	{
		System.out.println("Class H ");
	}
}

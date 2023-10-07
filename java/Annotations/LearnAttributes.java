package Annotations;

import org.testng.annotations.Test;
//
public class LearnAttributes {
	@Test(priority=2)
	public void classA() {
		System.out.println("Class name A");
	}
	@Test(priority=1)
	public void classN() {
		System.out.println("Class name N");
	}
	@Test(priority=3)
	public void classC() {
		System.out.println("Class name C");
	}
	@Test(priority=-1)
	public void classK() {
		System.out.println("Class name K");
	}
	@Test(enabled=false)
	//Enabled -to ignore the testcase. default value -True
	public void classE() {
		System.out.println("Class name E");
	}
//Priority-prioritize the testcases.default value=0
//invocation count-to execute the testcase multiple testcases


}

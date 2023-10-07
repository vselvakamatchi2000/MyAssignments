package Annotations;

import org.testng.annotations.Test;


public class LearnAttributes2 {
   // @Test(invocationCount=5,threadPoolSize=3)
	@Test(invocationCount=3,invocationTimeOut=1000)
	public void createLead() 
    {
		//Thread.sleep(6000);
    	System.out.println(Thread.currentThread().getId());
    	System.out.println("Created the lead");
    }
    @Test
    public void deleteLead() 
    {
    	System.out.println("Deleted the lead");
    }
    @Test
    public void editLead() 
    {
    	System.out.println("updated the lead");
    }
    @Test
    public void mergeLead() 
    {
    	System.out.println("Leads are merged");
    }
    @Test
    public void login() 
    {
      System.out.println("logged successfully");
    }

//invocationCount - to execute testcases multiple times
    //default value =1.
    //ThreadPoolSize - comes along wth invocationCount ,Default value =0;
}


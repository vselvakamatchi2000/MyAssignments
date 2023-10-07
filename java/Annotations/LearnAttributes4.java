package Annotations;

import org.testng.annotations.Test;

public class LearnAttributes4 {

	
	@Test(dependsOnMethods= "Annotations.LearnAttributes2.login",alwaysRun=true)
		public void createLead()
	    {
		    
	    	System.out.println("Created the lead");
	    }
	    @Test(dependsOnMethods= {"login", "createLead"})
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
	    @Test(timeOut=700)
	    public void login() throws Exception 
	    {
	      System.out.println("logged successfully");
	      throw new Exception();
	    }
}

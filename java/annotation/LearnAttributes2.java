package annotation;

import org.testng.annotations.Test;

public class LearnAttributes2 {

	
	@Test(dependsOnMethods="login",alwaysRun=true)
		public void createLead()
	    {
	    	System.out.println("Created the lead");
	    }
	    @Test(dependsOnMethods= {"login","createLead"})
	    public void deleteLead() 
	    {
	    	System.out.println("Deleted the lead");
	    }
	    @Test(dependsOnMethods="mergeLead")
	    public void editLead() 
	    {
	    	System.out.println("updated the lead");
	    }
	    @Test(dependsOnMethods="annotation.LearnAttributes1.ClassH")
	    public void mergeLead() 
	    {
	    	System.out.println("Leads are merged");
	    }
	    @Test
	    public void login() throws Exception 
	    {
	      System.out.println("logged in successfully");
	      throw new Exception();
	      
	    }
	    
	    
	    
}

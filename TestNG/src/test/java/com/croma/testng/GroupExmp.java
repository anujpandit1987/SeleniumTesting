package com.croma.testng;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class GroupExmp {
	 WebDriver driver;
	    // Saving the expected title of the Webpage
	  String title = "ToolsQA - Demo Website For Automation";
	    
	   
	    @Test
	    public void starting_point(){
	    System.out.println("Group not defined");
	    }
	    
	    
	    @Test(groups= {"demo"})
	    public void checkTitle() { 
	    	System.out.println("Group Check Title ");
	    } 
	    
	    @Test(groups= {"demo"})
	    public void click_element() { 
	    	System.out.println("Group click element ");
	    }
	   
	    @Test(groups= {"demo1","regression"})
	    public void TwoGroups() { 
	    	System.out.println("Two groups ");
	    }
	   
	    @Test(groups= {"sanity"})
	    public void Exclude() { 
	    	System.out.println("Two groups Exclude");
	    }
	
}

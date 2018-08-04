package com.gmail.app.testsuite;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gmail.gmailapp.main.support.SeleniumFunctions;
import com.gmail.gmailapp.test.support.LaunchBrowserCall;
import com.gmail.gmailogin.main.classes.GmailLogin;

public class GmailLoginTest  {
	WebDriver uidriver=null;
    LaunchBrowserCall obj=null;
    SeleniumFunctions close=null;
    //GeneralAdministration test=null;
    String methodName=null;
    Logger logger =Logger.getLogger("GmailLoginTest"); 
    
   @Test(priority=1)
   public void loginUser() throws Exception {
	/*00_001 Login User*/
	new GmailLogin();
	logger.info("----------------------Starting Test1----------------------");
	//test.checkLogin("mgAdministratorUser");
	logger.info("----------------------Finished Test1---------------------");
   }
    
  @BeforeTest
  public void beforeTest() throws Exception {
   obj=new LaunchBrowserCall();
   uidriver=obj.launchBrowserAndUrl();
  }

  @AfterTest
  public void afterTest() throws Exception {
   close=new SeleniumFunctions();
   close.browserClose();
  }
  
  @AfterMethod
  public void takeScreenShotOnFailure(ITestResult testResult) throws Exception{
   try{
	   close=new SeleniumFunctions();
	   methodName=testResult.getName();
	   
	   if (testResult.getStatus() == ITestResult.FAILURE){
		   close.takeAScreenshot(methodName);
	  }
	  else if(testResult.getStatus() == ITestResult.SUCCESS){
		  logger.info(methodName+" test has passed");
	  }
	 }
   catch(Exception e){
	   System.out.println("Exception "+e);
	 }
  }
}
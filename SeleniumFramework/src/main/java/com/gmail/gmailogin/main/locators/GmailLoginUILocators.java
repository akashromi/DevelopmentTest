package com.gmail.gmailogin.main.locators;

import com.gmail.gmailapp.main.support.FileRead;
import com.gmail.gmailapp.main.support.SeleniumFunctions;

public class GmailLoginUILocators extends SeleniumFunctions{
	public GmailLoginUILocators() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	/*Declaring the UI locators*/
	FileRead read=null;
	public String userIDFieldLocator="gmail.login.username.field";
	public String passwordFieldLocator="gmail.login.password.field";
		
public void GeneralAdminUILocatorsandSelFunctions() throws Exception{
	/*Reading the UI locators value*/
	read=new FileRead();
	userIDFieldLocator=read.getUIElement(userIDFieldLocator);
	passwordFieldLocator=read.getUIElement(passwordFieldLocator);
	}
}

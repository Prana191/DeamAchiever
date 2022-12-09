package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class LoginPom {

	
		
		@FindBy(how=How.XPATH,using="//input[@id='email']")
		private WebElement txt_email;
	
		@FindBy(how=How.XPATH,using="//input[@id='pass']")
		private WebElement txt_pass;
		
		@FindBy(how=How.XPATH,using="//button[@id='loginbutton']")
		private WebElement login_btn;

		public WebElement getTxt_email() {
			return txt_email;
		}

		public WebElement getTxt_pass() {
			return txt_pass;
		}

		public WebElement getLogin_btn() {
			return login_btn;
		}

}

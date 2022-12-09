package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;

public class Test_1 extends BaseClass {

	@Test
	public void loginpage() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("123@gmail.com");
		login.getTxt_pass().sendKeys("2njhgwh7");
		login.getLogin_btn().click();
	}
}

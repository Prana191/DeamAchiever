package com.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Library {

	public static void custom_sendkeys(WebElement element, String value) {
		try {
		element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void custom_click(WebElement element) {
		try {
		element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void FullScreenshot(WebDriver driver) throws Exception {
      String RM=RandomString.make();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dstn=new File("C:\\Users\\Shree\\eclipse-workspace\\Automation_Framework\\ScreenShot"+RM+".png");
		FileUtils.copyFile(src, dstn);
	}
	
	public static void Element_Screenshot(WebElement element) throws Exception {
		String RM=RandomString.make();
		File srcc=element.getScreenshotAs(OutputType.FILE);
		File dstnn=new File("C:\\Users\\Shree\\eclipse-workspace\\Automation_Framework\\ScreenShot"+RM+".png");
		FileUtils.copyFile(srcc, dstnn);	
	}
	
	public static void  Scroll_Element(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("argument[0].ScrollIntoView()", element);
	}
	
	public static void Handle_DrpDown(WebElement element, String value) {
		Select drp=new Select(element);
		drp.selectByValue(value);
	}
	
	public static void Mouse_over(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element);
	}
	
	public static void Alert_Handle(WebDriver driver) {

		Alert alt=driver.switchTo().alert();
	}	
	
	
}





























package com.maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlinePro {

	
	@FindBy(xpath="//input[@id='email']")
	public static WebElement username;
	
	@FindBy(xpath="//input[@id='passwd']")
	public static WebElement password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	public static WebElement submit;
	
	
	
	
	
	
	
//	
//	public static WebElement username(WebDriver driver) {
//		
//		return driver.findElement(By.xpath("//input[@id='email']"));
//		
//	}
//	
//	public static WebElement password(WebDriver driver) {
//		
//		return driver.findElement(By.xpath("//input[@id='passwd']"));
//		
//		
//	}
//	
//	public static WebElement submit(WebDriver driver) {
//		
//		return driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
//	}
//	
//
	
	
}

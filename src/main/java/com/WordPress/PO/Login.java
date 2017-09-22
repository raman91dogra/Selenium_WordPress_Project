package com.WordPress.PO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

WebDriver driver;
	
By username = By.id("user_login");
By password = By.id("user_pass");
By Login = By.id("wp-submit");


	public Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void typeUsername()
	{
		driver.findElement(username).sendKeys("admin");
	}
	
	public void password()
	{
		driver.findElement(password).sendKeys("demo123");
	}
	
	public void ClickonLoginButton()
	{
		driver.findElement(Login).click();
	}
}

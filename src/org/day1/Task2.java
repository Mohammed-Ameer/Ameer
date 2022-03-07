package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	//PWebElement txtusername = driver.findElement(By.class("form-control"));
	//txtusername.sendKeys("ameer");
	
	
	
}
  
	 
	 
	 
	 
	 
 }
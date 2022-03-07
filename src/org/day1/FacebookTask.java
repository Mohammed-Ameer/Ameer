package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtusername = driver.findElement(By.xpath("//input[@id='email']"));
		txtusername.sendKeys("8754876817");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='pass']"));
		txtpassword.sendKeys("123456zdff");
		driver.close();
	}

}

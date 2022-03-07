package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Mohammed ameer");
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("1234567890");
//		driver.close();
		
	}
}
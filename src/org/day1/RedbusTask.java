package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement txtfrom = driver.findElement(By.id("src"));
		txtfrom.sendKeys("Chennai");
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("Tirunelveli");
		Thread.sleep(3000);
		driver.close();
	}

}

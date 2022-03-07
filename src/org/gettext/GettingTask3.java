package org.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTask3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement overview = driver.findElement(By.id("overview-tab"));
		overview.click();
		Thread.sleep(3000);
		WebElement txtovervw = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies Selenium train')]"));
		String text = txtovervw.getText();
		System.out.println(text);
		driver.close();
	}
}

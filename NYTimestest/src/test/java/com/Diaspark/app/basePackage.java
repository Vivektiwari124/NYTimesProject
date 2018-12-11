package com.Diaspark.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class basePackage {

	public static WebDriver driver;

	@BeforeSuite
	public void browserInvoke() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vivek.tiwari\\git\\TestGitFramwork\\Sept15\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.nytimes.com/");
			//Thread.sleep(5000);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@AfterTest
	public void QuitBroswer() {
		driver.quit();
	}

}

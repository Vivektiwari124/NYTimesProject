package com.App.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	/*
	 * @FindBy(xpath="//button[@class='css-1bnxwmn e1uwo0ec0']") WebElement
	 * Subscribebtn;
	 * 
	 * @FindBy(xpath="//button[@class='css-1fhe54b e1uwo0ec0']") WebElement
	 * Loginbtn;
	 */

	public void toVerifyHeaderContent(WebDriver driver) {

		String arr[] = { "HOME", "ABOUT US", "COURSES", "CORPORATE TRAINING", "CONTACT US" };

		int size = driver.findElements(By.xpath("//nav/ul/li/a/strong")).size();
		System.out.println(size);

		for (int i = 1; i <= size; i++) {
			String text = driver.findElement(By.xpath("(//nav/ul/li/a/strong)[" + i + "]")).getText();
			System.out.println(text);
			System.out.println(arr[i - 1]);
			System.out.println("dsdsds");

			int var = arr[i - 1].compareTo(text);
			if (var == 0) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
				System.out.println("vivek");
			}
		}

	}

	public void toVerifyLogin(WebDriver driver) {

		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/header/section[1]/div[4]/a[2]"));
		if (loginbtn.isDisplayed()) {
			loginbtn.click();
			System.out.println("Login button clicked successfully");
		} else {
			System.out.println("Login button is not available");
		}

	}

}

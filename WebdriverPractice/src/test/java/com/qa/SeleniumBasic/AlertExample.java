package com.qa.SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumPractice\\WebdriverPractice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Working with Alerts
		driver.get("http://www.leafground.com/pages/Alert.html");

		// Alert Box Display
		WebElement alertBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alertBox.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Confirm Box Display
		WebElement confirmButton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		confirmButton.click();

		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		// Prompt Box Display
		WebElement promptBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
		promptBox.click();

		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("ABC");
		promptAlert.accept();

		driver.close();
	}

}

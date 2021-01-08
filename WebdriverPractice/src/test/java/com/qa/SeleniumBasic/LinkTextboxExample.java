package com.qa.SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumPractice\\WebdriverPractice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Working with Link and Textboxes
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("abc@gmail.com");
		
		WebElement appendBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		appendBox.sendKeys("Text");
		
		WebElement getTextBox = driver.findElement(By.name("username")); 
		String defaulttext = getTextBox.getAttribute("value");
		System.out.println(defaulttext);
		
		WebElement clearBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
		
		driver.quit();
	}

}

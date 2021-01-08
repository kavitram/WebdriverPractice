package com.qa.SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumPractice\\WebdriverPractice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Working with Button Elements
		driver.get("http://www.leafground.com/pages/Button.html");
		
		// Get the Position of button
		WebElement getPositionButton = driver.findElement(By.id("position"));
		Point XYPoint = getPositionButton.getLocation();
		int xValue = XYPoint.getX();
		int yValue = XYPoint.getY();
		System.out.println("X Value is: " + xValue + "Y Value is: " +yValue);
		
		// Get the color of button
		WebElement colorButton=driver.findElement(By.id("color"));
		String color = colorButton.getCssValue("background-color");
		System.out.println("Background color of button is : " +color);
		
		// Find the size of button
		WebElement sizeButton = driver.findElement(By.id("size"));
		int height = sizeButton.getSize().getHeight();
		int weight = sizeButton.getSize().getWidth();
		System.out.println("Height of button is " + height + "Weight of button is " +weight);
		
		// Go to Home
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
				
		//driver.quit();
	}

}

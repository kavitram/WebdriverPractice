package com.qa.SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumPractice\\WebdriverPractice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Working with Dropdown boxes
		driver.get("http://www.leafground.com/pages/Dropdown.html");	
		
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropDown1);
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByVisibleText("Selenium");
		Thread.sleep(3000);
		select.selectByValue("2");
		
		List<WebElement> listofoptions = select.getOptions();
		int size = listofoptions.size();
		System.out.println("Number of elements : " +size);
		
		dropDown1.sendKeys("Loadrunner");
		
		WebElement multiselect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select/option[1]"));
		Select multiselectbox = new Select(multiselect);
		multiselectbox.selectByIndex(0);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		
		driver.quit();		
		
	}

}

package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Form {

	@Test
	public void testLogin() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		driver.findElement(By.id("firstName")).sendKeys("Rahul");
		driver.findElement(By.id("lastName")).sendKeys("Shindhe");
		driver.findElement(By.id("userEmail")).sendKeys("rahul@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9876543210");
		/*WebElement dobInput = driver.findElement(By.id("dateOfBirthInput"));
		dobInput.sendKeys(Keys.CONTROL + "a");
		dobInput.sendKeys(Keys.DELETE);
		dobInput.sendKeys("10 May 1998");
		dobInput.sendKeys(Keys.ENTER);
		WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
		subjectsInput.sendKeys("Maths");
		subjectsInput.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("Karad Satara");
		// WebElement element
		// driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"));
		// Select select = new Select(element);
		// select.selectByIndex(2);
		WebElement stateInput = driver.findElement(By.id("react-select-3-input"));
		stateInput.sendKeys("NCR");
		stateInput.sendKeys(Keys.ENTER);
		driver.findElement(By.id("submit")).click();*/

		

	}
}
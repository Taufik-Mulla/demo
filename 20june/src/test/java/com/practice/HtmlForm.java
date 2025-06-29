package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HtmlForm {

	@Test
	public void Lohintest1() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Afreen/Documents/az.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("fullname")).sendKeys("Taufik Mulla");
		driver.findElement(By.name("genderMale")).click();
		driver.findElement(By.xpath("/html/body/form/div[2]/label[2]")).sendKeys("Java");
		WebElement dropdown = driver.findElement(By.id("country"));
		dropdown.sendKeys("India");

//		driver.findElement(By.id("country")).sendKeys("India");
		//driver.findElement(By.xpath("/html/body/form/button")).click();

		driver.switchTo().alert().accept();

		driver.quit();

	}

}

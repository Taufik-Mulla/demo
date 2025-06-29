package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class W3school {

	@Test
	public void Logintest() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_js_form_steps.asp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"regForm\"]/div[1]/p[1]/input")).sendKeys("Taufik");
		driver.findElement(By.xpath("//*[@id=\"regForm\"]/div[1]/p[2]/input")).sendKeys("Mulla");
		driver.findElement(By.id("nextBtn")).click();
		driver.findElement(By.xpath("//*[@id=\"regForm\"]/div[2]/p[1]/input")).sendKeys("taufik@hmail.com");
		driver.findElement(By.xpath("//*[@id=\"regForm\"]/div[2]/p[2]/input")).sendKeys("9876543210");
		driver.findElement(By.id("nextBtn")).click();

	}
}
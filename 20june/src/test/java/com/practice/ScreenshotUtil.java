package com.practice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

	public static void takeScreenshot(WebDriver driver, String screenshotName) {
		// Take screenshot and store it as a file
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Create unique filename with date-time
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String filename = screenshotName + "_" + timestamp + ".png";

		// Define destination path
		File destFile = new File("./screenshots/" + filename);

		// Create folder if not exists and copy file
		try {
			Files.createDirectories(destFile.getParentFile().toPath());
			Files.copy(srcFile.toPath(), destFile.toPath());
			System.out.println("Screenshot saved: " + destFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("Failed to save screenshot: " + e.getMessage());
		}
	}
}

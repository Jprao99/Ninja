package com.ninja.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;

	public static void initialize() {
		driver = new ChromeDriver();
	}
	
	public static void tearDown() {
		driver.quit();
	}

}

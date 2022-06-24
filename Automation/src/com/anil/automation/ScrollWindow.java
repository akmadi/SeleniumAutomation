package com.anil.automation;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWindow {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\JavaProject\\Automation\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
			ele.sendKeys("Test");
			File scrShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File("");
			FileUtils.copyFile(scrShot, destFile);
			ele.sendKeys(Keys.ENTER);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			jse.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(2000);
			driver.close();
			
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

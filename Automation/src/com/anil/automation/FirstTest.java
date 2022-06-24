package com.anil.automation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

	static WebDriver driver;

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\JavaProject\\Automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "C:\\JavaProject\\Automation\\drivers\\IEDriverServer_Win32_4.0.0.zip");
		 * driver = new InternetExplorerDriver();
		 */
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	/*
	 * @Test public void logInTest() { setup(); test1(); test2(); test3();
	 * teardown();
	 * 
	 * }
	 */
	
	
	
	@Test
	public void titleMethod() {
		String title = driver.getTitle();
		String expectedTitle = "Gmail";
		assertEquals(title, expectedTitle);
	}

	@Test
	public void test1() {
		WebElement email = driver.findElement(By.name("identifier"));
		email.sendKeys("anilkumar230");
		WebElement nextKey = driver.findElement(By.id("identifierNext"));
		nextKey.click();
		String actualStr="Test";
		String expectedStr="Test";
		assertEquals(actualStr, expectedStr);
	}
	@Test
	public void test2() {
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Legoog@1021");
		WebElement passwordNext = driver.findElement(By.id("passwordNext"));
		passwordNext.click();
		assertTrue(true);
	}
	
	@Test
	public void test3() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Compose')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
		assertTrue(true);
	}
	
@AfterClass
	public void teardown() {
		driver.quit();
	}

}

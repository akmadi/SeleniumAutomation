package cucumbertest;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.fetch.model.AuthChallengeResponse.Response;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.cobertura.javancss.ccl.FileUtil;

public class SearchSeleniumTest {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\JavaProject\\\\Automation\\\\drivers\\\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q"));
		
		driver.findElement(By.name("q")).sendKeys("Test");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement element = driver.findElement(By.xpath("//a[@href=\"https://fast.com/\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,200)");
		
		if (element.isDisplayed()) {
			System.out.println("The Fast.com web page is listed in suggestions");
		} else
			System.out.println("Fast.com is not present in the suggested search results");

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\JavaProject\\Automation\\page1.png");
		
		FileUtils.copyFile(screenshot, dest);
		
		element.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
		
		WebElement logo = driver.findElement(By.xpath("//div[@aria-label =\"FAST.com logo\"]"));
		
		wait.until(ExpectedConditions.visibilityOf(logo));
		
		File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C:\\\\JavaProject\\\\Automation\\\\page2.png");
		FileUtils.copyFile(screenshot2, dest2);
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		
		File screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest3 = new File("C:\\\\JavaProject\\\\Automation\\\\page3.png");
		FileUtils.copyFile(screenshot3, dest3);
		
		Dimension size = driver.manage().window().getSize();
		
		System.out.println("Window Height is" +size.getHeight() + "Window width is " + size.getWidth());

		
		
		driver.close();
		
		
	}

}

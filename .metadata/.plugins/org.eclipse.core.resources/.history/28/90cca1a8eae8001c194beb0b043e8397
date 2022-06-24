package cucumbertest.stepDefinition;

import java.io.File;
import java.io.IOException;
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

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepsClass {
	
	WebDriver driver;

	@Given("Open Google search home page")
	public void open_google_search_home_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\JavaProject\\\\Automation\\\\drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
//	    throw new io.cucumber.java.PendingException();
	}
	
	@When("I search for a keyword on the search")
	public void i_search_for_a_test_on_the_search() {
		driver.findElement(By.name("q"));
		
		driver.findElement(By.name("q")).sendKeys("Test");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("I verify the results to list speed test related pages")
	public void i_verify_the_results_to_list_speed_test_related_pages() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement element = driver.findElement(By.xpath("//h3[contains(text(),\"Fast.com\")]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		if (element.isDisplayed()) {
			System.out.println("The Fast.com web page is listed in suggestions");
		} else
			System.out.println("Fast.com is not present in the suggested search results");

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\JavaProject\\Automation\\sampletest.png");
		
		FileUtils.copyFile(screenshot, dest);
		
		driver.close();
		
//	    throw new io.cucumber.java.PendingException();
	}

	
}

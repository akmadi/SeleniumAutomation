package liveauto;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestColorsClass {

	static WebDriver driver;
	
	/* This method is to launch web portal using the URL passed as an argument
	 * 
	 */

	public static void launchPortal(String url) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\JavaProject\\\\\\\\Automation\\\\\\\\drivers\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		new WebDriverWait(driver, Duration.ofMillis(10)).until(ExpectedConditions
				.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@id,'sp_message')]")));
		new WebDriverWait(driver, Duration.ofMillis(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title=\"Yes, I Accept\"]"))).click();
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

	}

	/*
	 * This method is to verify bloomberg page and get all the Web Elements 
	 * present on it and retrieve data for the two columns Change and NetChange
	 * 
	 */
	public static void validateBloombergPage() {
		int changeIndex = 0;
		int netChangeIndex = 0;
		List<WebElement> columns = driver.findElements(By.xpath("//table/thead/tr/th"));
		for (int i = 0; i < columns.size(); i++) {
			if (columns.get(i).getText().equalsIgnoreCase("Change")) {
				changeIndex = i;
			} else if (columns.get(i).getText().equalsIgnoreCase("Net Change")) {
				netChangeIndex = i;
			}
		}

		List<WebElement> changeList = driver.findElements(By.xpath("//table/tbody/tr/td[" + changeIndex + "]/span"));
		List<WebElement> netChangeList = driver
				.findElements(By.xpath("//table/tbody/tr/td[" + netChangeIndex + "]/span"));

		validatePageData(changeList, netChangeList);

		driver.close();  // Exists browser after the test
	}

	/*
	 * This Method is to loop through all the rows available on the webpage
	 */
	
	public static void validatePageData(List<WebElement> changeList, List<WebElement> netChangeList) {
		String changeValue = null;
		String changeColor = null;
		String netChangeValue = null;
		String netChangeColor = null;
		for (int i = 0; i < changeList.size(); i++) {
			// Extracting color for Change column
			changeValue = changeList.get(i).getText();
			changeColor = changeList.get(i).getCssValue("Background");
			String changeHexColor = rgbToHex(changeColor);
			// Extracting color for NetChange column
			netChangeValue = netChangeList.get(i).getText();
			netChangeColor = netChangeList.get(i).getCssValue("Background");
			String netChangeHexColor = rgbToHex(netChangeColor);

			verifyValueandColor(changeValue, changeHexColor);
			verifyValueandColor(netChangeValue, netChangeHexColor);

		}
	}
	/*
	 * This method is to validate Value and the Color from Change and 
	 * NetChange columns. We can use Assert Class to mark Pass/Fail in 
	 * test reports. 
	 */

	public static void verifyValueandColor(String changeValue, String changeHexColor) {
		if (changeValue.contains("+")) {
			if (changeHexColor.equalsIgnoreCase("#9cf4dc")) {
				//Success/Pass Scenario
				System.out.println("Value displayed is " + changeValue + " and the color is Green");
			} else {
				//Failure/Fail Scenario
				System.out.println("Value displayed is " + changeValue + " and the color is not Green");
			}
		} else if (changeValue.contains("-")) {
			if (changeHexColor.equalsIgnoreCase("#ffe1e1")) {
				//Success/Pass Scenario
				System.out.println("Value displayed is " + changeValue + " and the color is Red");
			} else {
				//Failure/Fail Scenario
				System.out.println("Value displayed is " + changeValue + " and the color is not Red");
			}
		} else {
			if (changeHexColor.equalsIgnoreCase("#9cf4dc")) {
				//Success/Pass Scenario
				System.out.println("Value displayed is " + changeValue + " and the color is Green");
			} else {
				//Failure/Fail Scenario
				System.out.println("Value displayed is " + changeValue + " and the color is not Green");
			}
		}
	}

	/*
	 * This method is a helper method that expects CSS color value in 
	 * RGB format as an argument, parse each color into an integer value 
	 * and create a hexadecimal value for the color and returns the same.
	 */
	public static String rgbToHex(String colorOnValue) {
		String[] rgb2 = colorOnValue.replace("rgb(", "").replace(")", "").split(",");
		int r2 = Integer.parseInt(rgb2[0].trim());
		int g2 = Integer.parseInt(rgb2[1].trim());
		int b2 = Integer.parseInt(rgb2[2].split(" ")[1].trim());
		String hexColor = "#" + Integer.toHexString(r2) + Integer.toHexString(g2) + Integer.toHexString(b2);
		return hexColor;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Website URL"); 
		String url = sc.next(); // Enter url as https://www.bloomberg.com/markets/currencies

		launchPortal(url);
		validateBloombergPage();
		sc.close();  // Closes scanner

	}

}

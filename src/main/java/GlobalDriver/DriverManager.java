package GlobalDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

	private static WebDriver driver;

	// Private constructor to prevent instantiation
	private DriverManager() {}

	// Public static method to get the driver instance
	public static WebDriver getDriver() {
		if (driver == null) {
			// Set ChromeDriver options
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");

			// Initialize driver
			driver = new ChromeDriver(options);
		}
		return driver;
	}

	// Method to quit the driver
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null; // Reset for future runs
		}
	}
}


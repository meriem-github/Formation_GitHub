package pack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public static WebDriver driver;

	@BeforeMethod
	public void BeforetTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ACER\\Desktop\\formation_selenium\\pilote\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void AfterTest() {
		driver.close();

	}

	public void getscreen() throws IOException {
		long a = System.currentTimeMillis();
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File("C:\\Users\\ACER\\Desktop\\formation_selenium\\"+a+"screenshot.png");//pr affciher le time sur le screenshot
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

}

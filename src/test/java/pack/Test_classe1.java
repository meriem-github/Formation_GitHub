package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_classe1 extends Base {

	@Test(dataProvider = "getdata")
	public void zTest1(String username , String password) {
		// TODO Auto-generated method stub

		WebElement element_input = driver.findElement(By.xpath("//input[@id='email']"));
		element_input.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);

	}

//	// @Test(dependsOnMethods = { "zTest1" })
//	@Test(timeOut = 10000)
//	public void Test2() {
//		// TODO Auto-generated method stub
//
//		WebElement element_input = driver.findElement(By.xpath("//input[@id='email']"));
//		element_input.sendKeys("log2");
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys("pass2");
//	}
//
//	@Test
//	public void Test3() {
//		// TODO Auto-generated method stub
//
//		WebElement element_input = driver.findElement(By.xpath("//input[@id='email']"));
//		element_input.sendKeys("log3");
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys("pass3");
//	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		// combinaison1
		data[0][0] = "log1";
		data[0][1] = "pass1";
		// combinaison2
		data[1][0] = "log2";
		data[1][1] = "pass2";
		// combinaison3
		data[2][0] = "log3";
		data[2][1] = "pass3";
		return data;
	}

}
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import obj.StoreAccount;
import obj.StoreIndex;
import obj.StoreSignIn;
import utility.ExcelOutputFile;
import utility.UserInfo;

public class ProbaTest {
	public static WebDriver driver;
	public static Actions actions;
	public static SoftAssert sa;

	@BeforeClass
	public void start() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		sa = new SoftAssert();
	}
	
  @Test
  public void f() {
	 /* 
	  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	  StoreSignIn.registrationSingle(driver);
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

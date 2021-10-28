package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import obj.Resursi;
import obj.StoreAccount;
import obj.StoreCart;
import obj.StoreDress;
import obj.StoreIndex;
import obj.StoreSignIn;
import obj.StoreSummerDresses;
import utility.ExcelOutputFile;

public class StoreTest {

	public static WebDriver driver;
	public static Actions actions;
	public static SoftAssert sa;

	@BeforeClass
	public void start() { // Setup before tests
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		sa = new SoftAssert();
	}

	@Test(priority = 1)
	public void summerDressTest() { // Test two ways to go on Summer Dresses page and compare them
		StoreIndex.openIndex(driver);
		StoreIndex.womenSummerDresses(driver, actions);
		String url1 = driver.getCurrentUrl();
		driver.navigate().back();
		StoreIndex.dressesSummerDresses(driver, actions);
		String url2 = driver.getCurrentUrl();

		Assert.assertEquals(url1, url2);
	}

	@Test(priority = 2)
	public void blueDressTest() { // Test to select dress and add requested dress to cart
		StoreSummerDresses.selectDress(driver);
		StoreDress.selectBlueDress(driver);
		StoreCart.toCheckout(driver);
		Assert.assertTrue(StoreCart.cartDressCheck(driver));

	}

	@Test(priority = 3)
	public static void registrationTestSingle() { // Test to sign in of one user
		StoreCart.cartProceedToCheckooutClick(driver);
		StoreSignIn.registrationSingle(driver);

		StoreAccount.clickAccount(driver);
		StoreAccount.clickMyAdress(driver);

		sa.assertEquals(StoreAccount.getAlias(driver), StoreSignIn.getAlias().toUpperCase());
		sa.assertEquals(StoreAccount.getFname(driver), StoreSignIn.getFname());
		sa.assertEquals(StoreAccount.getLname(driver), StoreSignIn.getLname());
		sa.assertEquals(StoreAccount.getAdress(driver), StoreSignIn.getAdress());
		sa.assertEquals(StoreAccount.getCity(driver), StoreSignIn.getCity() + ",");
		sa.assertEquals(StoreAccount.getState(driver), StoreAccount.getStateUser());
		sa.assertEquals(StoreAccount.getZip(driver), StoreSignIn.getZipcode());
		sa.assertEquals(StoreAccount.getPhone(driver), StoreSignIn.getPhone());

		StoreAccount.clickSignOut(driver);

		sa.assertAll();

	}

	@Test(priority = 4)
	public static void registrationTestGroup30() { // Test to sign in of multiple users
		int userNum = 5;

		driver.navigate().to(Resursi.getSignInUrl());

		for (int i = 1; i < userNum + 1; i++) {
			StoreSignIn.registrationGroup(driver, i);

			StoreAccount.clickAccount(driver);
			StoreAccount.clickMyAdress(driver);

			sa.assertEquals(StoreAccount.getAlias(driver), ExcelOutputFile.getAlias(i));
			sa.assertEquals(StoreAccount.getFname(driver), ExcelOutputFile.getFname(i));
			sa.assertEquals(StoreAccount.getLname(driver), ExcelOutputFile.getLname(i));
			sa.assertEquals(StoreAccount.getAdress(driver), ExcelOutputFile.getAddress(i));
			sa.assertEquals(StoreAccount.getCity(driver), ExcelOutputFile.getCity(i) + ",");
			sa.assertEquals(StoreAccount.getState(driver), StoreAccount.getStateExcel(i));
			sa.assertEquals(StoreAccount.getZip(driver), ExcelOutputFile.getZipCode(i));
			sa.assertEquals(StoreAccount.getPhone(driver), ExcelOutputFile.getPhone(i));

			// hold();

			StoreAccount.clickSignOut(driver);

		}

	}

	@Test(priority = 5)
	public static void logInTestSingle() { // Test to log in of one user
		StoreSignIn.logInSingleUser(driver);

		sa.assertEquals(StoreAccount.getAccountText(driver), StoreSignIn.FLname());
		sa.assertAll();
	}

	@AfterClass
	public static void end() { // Close
		hold();
		driver.close();
	}

	public static void hold() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}

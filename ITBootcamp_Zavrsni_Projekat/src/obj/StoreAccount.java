package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.ExcelOutputFile;

public class StoreAccount {

	private static final StringBuilder sb = new StringBuilder();

	// Getters for account page fields
	public static String getAlias(WebDriver driver) {
		return driver.findElement(By.xpath(Resursi.getAccountAliasXpath())).getText();
	}

	public static String getFname(WebDriver driver) {
		return driver.findElement(By.xpath(Resursi.getAccountFnameXpath())).getText();
	}

	public static String getLname(WebDriver driver) {
		return driver.findElement(By.xpath(Resursi.getAccountLnameXpath())).getText();
	}

	public static String getAdress(WebDriver driver) {
		return driver.findElement(By.xpath(Resursi.getAccountAdressXpath())).getText();
	}

	public static String getCity(WebDriver driver) {
		return driver.findElement(By.xpath(Resursi.getAccountCityXpath())).getText();
	}

	public static String getState(WebDriver driver) {
		return driver.findElement(By.xpath(Resursi.getAccountStateXpath())).getText();
	}

	public static String getZip(WebDriver driver) {
		return driver.findElement(By.xpath(Resursi.getAccountZipXpath())).getText();
	}

	public static String getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(Resursi.getAccountPhoneXpath())).getText();
	}

	public static String getStateExcel(int i) { // Extract state name from state xpath
		sb.append(ExcelOutputFile.getStateXpath(i)).delete(0, 26);
		sb.reverse().delete(0, 3).reverse();

		return sb.toString();
	}

	public static String getStateUser() { // Extract state name from state xpath
		sb.append(StoreSignIn.getState()).delete(0, 26);
		sb.reverse().delete(0, 3).reverse();

		return sb.toString();
	}

	public static void clickMyAdress(WebDriver driver) {
		driver.findElement(By.xpath(Resursi.getAccountMyAddressXpath())).click();
	}

	public static void clickAccount(WebDriver driver) {
		driver.findElement(By.xpath(Resursi.getAccountAccountXpath())).click();
	}

	public static void clickSignOut(WebDriver driver) {
		driver.findElement(By.xpath(Resursi.getAccountSignOutXpath())).click();
	}
	
	public static String getAccountText(WebDriver driver) {
		return driver.findElement(By.xpath(Resursi.getAccountAccountXpath())).getText();
	}

}

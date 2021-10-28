package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ExcelOutputFile;

public class StoreSignIn {
	// Single user account info
	private static final String fName = "Lisabeth";
	private static final String LName = "Cogley";
	private static final String pass = "L56203";
	private static final String adress = "ifiadffbaj 23";
	private static final String city = "Rochester";
	private static final String state = "//option[contains(text(),'Nebraska')]";
	private static final String zipCode = "00754";
	private static final String phone = "542540839";
	private static final String email = "lisabeth.cogley@test3.fs";
	private static final String alias = "Home";

	public static String getState() {
		return state;
	}

	public static String getFname() {
		return fName;
	}

	public static String getLname() {
		return LName;
	}

	public static String getPass() {
		return pass;
	}

	public static String getAdress() {
		return adress;
	}

	public static String getCity() {
		return city;
	}

	public static String getZipcode() {
		return zipCode;
	}

	public static String getPhone() {
		return phone;
	}

	public static String getEmail() {
		return email;
	}

	public static String getAlias() {
		return alias;
	}

	public static void fillEmail(WebDriver driver, String text) {
		driver.findElement(By.id(Resursi.getSignInEmailId())).sendKeys(text);
	}

	public static void clickSubmit(WebDriver driver) {
		driver.findElement(By.id(Resursi.getSignInCreateBtnId())).click();
	}

	public static void fillFname(WebDriver driver, String text) {
		driver.findElement(By.xpath(Resursi.getSignInFnameXpath())).sendKeys(text);
	}

	public static void fillLname(WebDriver driver, String text) {
		driver.findElement(By.xpath(Resursi.getSignInLnameXpath())).sendKeys(text);
	}

	public static void fillPass(WebDriver driver, String text) {
		driver.findElement(By.xpath(Resursi.getSignInPassXpath())).sendKeys(text);
	}

	public static void fillAdress(WebDriver driver, String text) {
		driver.findElement(By.xpath(Resursi.getSignInAdressXpath())).sendKeys(text);
	}

	public static void fillCity(WebDriver driver, String text) {
		driver.findElement(By.xpath(Resursi.getSignInCityXpath())).sendKeys(text);
	}

	public static void fillState(WebDriver driver, String text) {
		driver.findElement(By.xpath(text)).click();
	}

	public static void fillZip(WebDriver driver, String text) {
		driver.findElement(By.xpath(Resursi.getSignInZipXpath())).sendKeys(text);
	}

	public static void fillPhone(WebDriver driver, String text) {
		driver.findElement(By.xpath(Resursi.getSignInPhoneXpath())).sendKeys(text);
	}

	public static void fillAlias(WebDriver driver, String text) {
		WebElement elem = driver.findElement(By.xpath(Resursi.getSignInAliasXpath()));
		elem.clear();
		elem.sendKeys(text);
	}

	public static void clickRegister(WebDriver driver) {
		driver.findElement(By.xpath(Resursi.getSignInRegisterXpath())).click();
	}

	public static void registrationSingle(WebDriver driver) { // Single user registration

		fillEmail(driver, email);
		clickSubmit(driver);
		fillFname(driver, fName);
		fillLname(driver, LName);
		fillPass(driver, pass);
		fillAdress(driver, adress);
		fillCity(driver, city);
		fillState(driver, state);
		fillZip(driver, zipCode);
		fillPhone(driver, phone);
		fillAlias(driver, alias);
		clickRegister(driver);

	}

	public static void registrationGroup(WebDriver driver, int i) { // Multiple users registration from excel table

		fillEmail(driver, ExcelOutputFile.getEmail(i));
		clickSubmit(driver);
		fillFname(driver, ExcelOutputFile.getFname(i));
		fillLname(driver, ExcelOutputFile.getLname(i));
		fillPass(driver, ExcelOutputFile.getPassword(i));
		fillAdress(driver, ExcelOutputFile.getAddress(i));
		fillCity(driver, ExcelOutputFile.getCity(i));
		fillState(driver, ExcelOutputFile.getStateXpath(i));
		fillZip(driver, ExcelOutputFile.getZipCode(i));
		fillPhone(driver, ExcelOutputFile.getPhone(i));
		fillAlias(driver, ExcelOutputFile.getAlias(i));
		clickRegister(driver);

	}

	public static void fillLogInEmail(WebDriver driver, String text) {
		driver.findElement(By.id(Resursi.getLogInEmailId())).sendKeys(text);
	}

	public static void fillLogInPass(WebDriver driver, String text) {
		driver.findElement(By.xpath(Resursi.getLogInPassXpath())).sendKeys(text);
	}

	public static void clickLogIn(WebDriver driver) {
		driver.findElement(By.xpath(Resursi.getLogInBtnXpath())).click();
	}

	public static void logInSingleUser(WebDriver driver) { // Log in single user
		fillLogInEmail(driver, email);
		fillLogInPass(driver, pass);
		clickLogIn(driver);
	}
	
	public static String FLname () {
		return fName +" " + LName;
	}

}

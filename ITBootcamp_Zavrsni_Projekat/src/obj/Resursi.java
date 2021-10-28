package obj;

public class Resursi {
	// Index page links and path to the elements
	private static final String INDEX_URL = "http://automationpractice.com/index.php";
	private static final String SUM_DRESSES_URL = "http://automationpractice.com/index.php?id_category=11&controller=category";
	private static final String CART_URL = "http://automationpractice.com/index.php?controller=order";
	private static final String SIGN_IN_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	private static final String ACCOUNT_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
	private static final String WOMEN_BTN_XPATH = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
	private static final String DRESSES_BTN_XPATH = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]";
	private static final String WOMEN_SUMMER_DRESSES_XPATH = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
	private static final String DRESSES_SUMMER_DRESSES_XPATH = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
	// Summer Dresses and first dres page path to the elements
	private static final String FIRST_DRESS_XPATH = "//div[@id='center_column']/ul/li[1]/div[1]";
	private static final String BLUE_DRESS_CSS_NAME = "icon-plus";
	private static final String BLUE_DRESS_SIZE_XPATH = "//option[contains(text(),'M')]";
	private static final String BLUE_DRESS_COLOR_ID = "color_14";
	private static final String BLUE_DRESS_SUBMIT_NAME = "Submit";
	// Cart page path to the elements
	private static final String CHECKOUT_XPATH = "//span[contains(text(),'Proceed to checkout')]";
	private static final String CART_QTY_XPATH = "//input[@name='quantity_5_24_0_0']";
	private static final String CART_VERS_LINK_TEKST = "Color : Blue, Size : M";
	private static final String CART_DRESS_NAME_XPATH = "//td[@class='cart_description']//a[contains(text(),'Printed Summer Dress')]";
	private static final String CART_PROCEED_CHECKOUT_XPATH = "//a[@class='button btn btn-default standard-checkout button-medium']";
	// Sign in page path to the elements
	private static final String SIGN_IN_EMAIL_ID = "email_create";
	private static final String SIGN_IN_CREATE_BTN_ID = "SubmitCreate";
	private static final String SIGN_IN_FNAME_XPATH = "//input[@id='customer_firstname']";
	private static final String SIGN_IN_LNAME_XPATH = "//input[@id='customer_lastname']";
	private static final String SIGN_IN_PASS_XPATH = "//input[@id='passwd']";
	private static final String SIGN_IN_ADRESS_XPATH = "//input[@id='address1']";
	private static final String SIGN_IN_CITY_XPATH = "//input[@id='city']";
	private static final String SIGN_IN_ZIP_XPATH = "//input[@id='postcode']";
	private static final String SIGN_IN_PHONE_XPATH = "//input[@id='phone_mobile']";
	private static final String SIGN_IN_ALIAS_XPATH = "//input[@id='alias']";
	private static final String SIGN_IN_REGISTER_XPATH = "//button[@id='submitAccount']";
	private static final String LOG_IN_EMAIL_ID = "email";
	private static final String LOG_IN_PASS_XPATH = "//input[@id='passwd']";
	private static final String LOG_IN_BTN_XPATH = "//button[@id='SubmitLogin']";
	// Account page path to the elements
	private static final String ACCOUNT_MY_ADDRESS_XPATH = "//i[@class='icon-building']";
	private static final String ACCOUNT_ALIAS_XPATH = "//h3[@class='page-subheading']";
	private static final String ACCOUNT_FNAME_XPATH = "//span[@class='address_name'][1]";
	private static final String ACCOUNT_LNAME_XPATH = "//span[@class='address_name'][2]";
	private static final String ACCOUNT_ADRESS_XPATH = "//span[@class='address_address1']";
	private static final String ACCOUNT_CITY_XPATH = "//div[@class='columns-container']//li[5]//span[1]";
	private static final String ACCOUNT_STATE_XPATH = "//div[@class='columns-container']//li[5]//span[2]";
	private static final String ACCOUNT_ZIP_XPATH = "//div[@class='columns-container']//li[5]//span[3]";
	private static final String ACCOUNT_PHONE_XPATH = "//span[@class='address_phone_mobile']";
	private static final String ACCOUNT_ACCOUNT_XPATH = "//a[@class='account']";
	private static final String ACCOUNT_SIGN_OUT_XPATH = "//a[@class='logout']";

	public static String getIndexUrl() {
		return INDEX_URL;
	}

	public static String getSumDressesUrl() {
		return SUM_DRESSES_URL;
	}

	public static String getCartUrl() {
		return CART_URL;
	}

	public static String getSignInUrl() {
		return SIGN_IN_URL;
	}

	public static String getAccountUrl() {
		return ACCOUNT_URL;
	}

	public static String getWomenBtnXpath() {
		return WOMEN_BTN_XPATH;
	}

	public static String getDressesBtnXpath() {
		return DRESSES_BTN_XPATH;
	}

	public static String getWomenSummerDressesXpath() {
		return WOMEN_SUMMER_DRESSES_XPATH;
	}

	public static String getDressesSummerDressesXpath() {
		return DRESSES_SUMMER_DRESSES_XPATH;
	}
	///////////////////////////////////////////////////////

	public static String getFirstDressXpath() {
		return FIRST_DRESS_XPATH;
	}

	public static String getBlueDressCssName() {
		return BLUE_DRESS_CSS_NAME;
	}

	public static String getBlueDressSizeXpath() {
		return BLUE_DRESS_SIZE_XPATH;
	}

	public static String getBlueDressColorId() {
		return BLUE_DRESS_COLOR_ID;
	}

	public static String getBlueDressSubmitName() {
		return BLUE_DRESS_SUBMIT_NAME;
	}
	///////////////////////////////////////////////////////

	public static String getCheckoutXpath() {
		return CHECKOUT_XPATH;
	}

	public static String getCartQtyXpath() {
		return CART_QTY_XPATH;
	}

	public static String getCartVersLinkTekst() {
		return CART_VERS_LINK_TEKST;
	}

	public static String getCartDressNameXpath() {
		return CART_DRESS_NAME_XPATH;
	}

	public static String getCartProceedCheckoutXpath() {
		return CART_PROCEED_CHECKOUT_XPATH;
	}
	///////////////////////////////////////////////////////

	public static String getSignInEmailId() {
		return SIGN_IN_EMAIL_ID;
	}

	public static String getSignInCreateBtnId() {
		return SIGN_IN_CREATE_BTN_ID;
	}

	public static String getSignInFnameXpath() {
		return SIGN_IN_FNAME_XPATH;
	}

	public static String getSignInLnameXpath() {
		return SIGN_IN_LNAME_XPATH;
	}

	public static String getSignInPassXpath() {
		return SIGN_IN_PASS_XPATH;
	}

	public static String getSignInAdressXpath() {
		return SIGN_IN_ADRESS_XPATH;
	}

	public static String getSignInCityXpath() {
		return SIGN_IN_CITY_XPATH;
	}

	public static String getSignInZipXpath() {
		return SIGN_IN_ZIP_XPATH;
	}

	public static String getSignInPhoneXpath() {
		return SIGN_IN_PHONE_XPATH;
	}

	public static String getSignInAliasXpath() {
		return SIGN_IN_ALIAS_XPATH;
	}

	public static String getSignInRegisterXpath() {
		return SIGN_IN_REGISTER_XPATH;
	}

	public static String getLogInEmailId() {
		return LOG_IN_EMAIL_ID;
	}

	public static String getLogInPassXpath() {
		return LOG_IN_PASS_XPATH;
	}
	
	public static String getLogInBtnXpath() {
		return LOG_IN_BTN_XPATH;
	}
	///////////////////////////////////////////////////////

	public static String getAccountMyAddressXpath() {
		return ACCOUNT_MY_ADDRESS_XPATH;
	}

	public static String getAccountAliasXpath() {
		return ACCOUNT_ALIAS_XPATH;
	}

	public static String getAccountFnameXpath() {
		return ACCOUNT_FNAME_XPATH;
	}

	public static String getAccountLnameXpath() {
		return ACCOUNT_LNAME_XPATH;
	}

	public static String getAccountAdressXpath() {
		return ACCOUNT_ADRESS_XPATH;
	}

	public static String getAccountCityXpath() {
		return ACCOUNT_CITY_XPATH;
	}

	public static String getAccountStateXpath() {
		return ACCOUNT_STATE_XPATH;
	}

	public static String getAccountZipXpath() {
		return ACCOUNT_ZIP_XPATH;
	}

	public static String getAccountPhoneXpath() {
		return ACCOUNT_PHONE_XPATH;
	}

	public static String getAccountAccountXpath() {
		return ACCOUNT_ACCOUNT_XPATH;
	}

	public static String getAccountSignOutXpath() {
		return ACCOUNT_SIGN_OUT_XPATH;
	}

}

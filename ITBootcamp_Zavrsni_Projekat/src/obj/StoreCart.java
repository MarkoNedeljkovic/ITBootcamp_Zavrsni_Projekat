package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoreCart {

	public static void toCheckout(WebDriver driver) {
		driver.findElement(By.xpath(Resursi.getCheckoutXpath())).click();
	}

	public static boolean cartDressCheck(WebDriver driver) { // Compare value from cart
		boolean check = false;

		String qty = driver.findElement(By.xpath(Resursi.getCartQtyXpath())).getAttribute("value");
		String ver = driver.findElement(By.linkText(Resursi.getCartVersLinkTekst())).getAttribute("text");
		String dressName = driver.findElement(By.xpath(Resursi.getCartDressNameXpath())).getAttribute("text");

		if (qty.equals("2") && ver.equals("Color : Blue, Size : M") && dressName.equals("Printed Summer Dress")) {
			check = true;
		}

		return check;

	}
	
	public static void cartProceedToCheckooutClick(WebDriver driver) { // 
		driver.findElement(By.xpath(Resursi.getCartProceedCheckoutXpath())).click();
	}

}

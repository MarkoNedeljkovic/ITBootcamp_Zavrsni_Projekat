package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StoreIndex {
	
	public static void openIndex (WebDriver driver) { //Open page
		driver.get(Resursi.getIndexUrl());
		driver.manage().window().maximize();
	}
	
	public static void womenSummerDresses(WebDriver driver, Actions actions) { 
		WebElement elem1 = driver.findElement(By.xpath(Resursi.getWomenBtnXpath()));
		actions.moveToElement(elem1).perform();
		driver.findElement(By.xpath(Resursi.getWomenSummerDressesXpath())).click();
	}
	
	public static void dressesSummerDresses(WebDriver driver, Actions actions) {
		WebElement elem1 = driver.findElement(By.xpath(Resursi.getDressesBtnXpath()));
		actions.moveToElement(elem1).perform();
		driver.findElement(By.xpath(Resursi.getDressesSummerDressesXpath())).click();;
	}
				
	
}

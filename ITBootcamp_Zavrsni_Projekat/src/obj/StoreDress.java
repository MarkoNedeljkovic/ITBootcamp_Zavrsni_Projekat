package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoreDress {
	
	public static void selectBlueDress (WebDriver driver) { // Choose requested dress
		driver.findElement(By.className(Resursi.getBlueDressCssName())).click();
		driver.findElement(By.xpath(Resursi.getBlueDressSizeXpath())).click();
		driver.findElement(By.id(Resursi.getBlueDressColorId())).click();
		driver.findElement(By.name(Resursi.getBlueDressSubmitName())).click();
	}

}

package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoreSummerDresses {
	
	public static void selectDress(WebDriver driver) {
		driver.findElement(By.xpath(Resursi.getFirstDressXpath())).click();
		
	}

}

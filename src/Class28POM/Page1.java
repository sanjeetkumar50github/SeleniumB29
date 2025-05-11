package Class28POM;

/* POM- Page Object Model
 * 1. declaration --- @FindBy
 * 2.Syntax
 * 		@FindBy(locator="value")
 *       AS WebElement elementName;
 *       
 * Ex:
 * 	@FindBy(id="username")		  
	private WebElement unTB;
 * 
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page1 {

	//declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	//utilization
	public void setUserName() {
		unTB.sendKeys("bhanu");
	}
}

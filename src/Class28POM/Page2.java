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
 * 
 * 
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {

	//declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	//initialization
	public Page2(WebDriver driver) {
		PageFactory.initElements(driver,this);//address of browser & addr of POM class object
	}
	
	//utilization
	public void setUserName() {
		unTB.sendKeys("bhanu");
	}
}

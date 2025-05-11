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
 * IMP: in place of value we cant use variable but we can use constant
 * 
 *
 */

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 {

	final String xp="//a";
	
	//declaration
	@FindBy(xpath=xp)
	private List<WebElement> allLinks;
	
	//initialization
	public Page3(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void printLinkCount() {
		int count=allLinks.size();
		System.out.println(count);
	}
	
	public void printAllLinks() {
		for(WebElement link:allLinks) {
			System.out.println(link.getText());
		}
	}
	
	
	
}

package Class29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {

	@FindBy(css ="#A1")
	private WebElement submitBTN;
	
	private WebDriver driver;
	
	public Page1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickSubmit() {
		submitBTN.click();
	}
	
	public void closeAlert() {
		driver.switchTo().alert().accept();
	}

}

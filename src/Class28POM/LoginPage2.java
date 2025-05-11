package Class28POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Page Object Model
public class LoginPage2
{
	//declaration
	@FindBy(id="username")//FindBy Annotation   
	private WebElement unTB;
	
	@FindBy(name="pwd") 
	private WebElement pwTB;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginBTN;
	
	//initialization
	public LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void setUserName(String un) {
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}
	
	public void clickLoginButton() {
		loginBTN.click();
	}
}

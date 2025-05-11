package Class27Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A 
{
	//declaration
	private WebElement unTB;
	
	//initialization
	public A(WebDriver driver)
	{
		unTB=driver.findElement(By.id("username"));
	}
	
	//utilization
	public void setUserName(String un) {
		unTB.sendKeys(un);
	}
}

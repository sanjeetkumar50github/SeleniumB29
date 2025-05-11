package Class23PopUp;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUplaodFromProject4 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/Selenium%20Class%20Doc/Class23/Class23PopUpDemo.html");
			Thread.sleep(1000);

        String rpath="./mydoc/book1.xlsx";
        File f=new File(rpath);
        String apath=f.getAbsolutePath();
        driver.findElement(By.id("A2")).sendKeys(apath);
			
				
				

		}
}
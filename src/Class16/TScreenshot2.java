package Class16;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;

/*
 * png-prtable network graphics
 * it will be in temp folder 
 * 
 * 
 */


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TScreenshot2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		
		
		Date d=new Date();
		System.out.println(d);
		String time_Stamp = d.toString().replaceAll(":","-");
		System.out.println(time_Stamp);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		// find the element
		TakesScreenshot t= (TakesScreenshot) driver;
		File Srcimg = t.getScreenshotAs(OutputType.FILE);
		//String page_title = driver.getTitle();
		
		File Destimg = new File("./Screenshot/" + time_Stamp +".png");
		
		FileUtils.copyFile(Srcimg, Destimg);

		driver.close();

	}
}

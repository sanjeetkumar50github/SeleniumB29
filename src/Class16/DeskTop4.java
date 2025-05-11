package Class16;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
/*
 * png-prtable network graphics
 * it will be in temp folder 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeskTop4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		Date d = new Date();
		System.out.println(d);
		String time_Stamp = d.toString().replaceAll(":", "-");
		System.out.println(time_Stamp);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://akshratraining.com");
		
		Thread.sleep(3000);
		// find the element
		
		Robot r = new Robot();
		Dimension desktop_size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rct=new Rectangle(desktop_size);
		
		BufferedImage img = r.createScreenCapture(rct);
		ImageIO.write(img, "Screenshot" ,new File("./Screenshot/" + time_Stamp + ".png"));

		File Destimg = new File("./Screenshot/" + time_Stamp + ".png");
         System.out.println(Destimg );
		driver.close();

	}
}
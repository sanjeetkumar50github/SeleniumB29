package Class24PopUp;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//HTML popup -Hidden Division popup
//solution -- findElement
public class MakeMytrip {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {	
			System.out.println("Date?");
			java.util.Scanner sc=new java.util.Scanner(System.in);
			String d=sc.nextLine();
			System.out.println("Thanks");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.makemytrip.com/");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".langCardClose")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[@data-cy='account']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[text()='March 2022']/../..//p[.='"+d+"']")).click();
			Thread.sleep(1000);
			String selected=driver.findElement(By.xpath("//p[@data-cy='departureDate']")).getText();
			System.out.println(selected);
			driver.close();
		}
}

package Demo1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.google.com");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int TotalLinks = alllinks.size();
		System.out.println(TotalLinks);

		for (int i = 0; i < TotalLinks; i++) {

			String url = alllinks.get(i).getAttribute("href");
			System.out.println(i + " " + url);

			URL link = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) link.openConnection();
			conn.connect();
			int rescode = conn.getResponseCode();
			if (rescode >= 400) {

				System.out.println(url + " --" + "broken link");

			} else {

				System.out.println(url + " --" + "not broken link");
			}
		}
		driver.close();

	}

}

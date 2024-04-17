import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplebrowsers {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		String tab= Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Register")).sendKeys(tab);*/
		
		
		//open two url in two tabs
		
		/*driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");*/
		
		//open url's in new windows
		
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		
		
	}

}

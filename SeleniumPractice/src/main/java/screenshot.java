import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//full page screenshot
		/*TakesScreenshot ts =  (TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumPractice\\Screenshot");
		FileUtils.copyDirectory(src, trg);*/
		
		//Screenshot of section or portion
		/*WebElement section= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
		File src= section.getScreenshotAs(OutputType.FILE);
		File trg= new File("SeleniumPractice/target/featured.png");
		FileUtils.copyDirectory(src, trg);*/
		
		
		//screenshot of web element
		WebElement ele= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		File src= ele.getScreenshotAs(OutputType.FILE);
		File trg= new File("SeleniumPractice/target/logo.png");
		FileUtils.copyDirectory(src, trg);
		driver.close();
		}

}

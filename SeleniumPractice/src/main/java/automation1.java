

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automation1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.pixelmindit.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("member1@spat.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/form/div/div[7]/button")).click();
		WebElement ele= driver.findElement(By.className("active"));
		WebElement ale= driver.findElement(By.linkText("Package List"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).click().moveToElement(ale).click().perform();
		
		driver.close();
	}

}
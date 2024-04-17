import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseoperations {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement button= driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions act= new Actions(driver);
		act.contextClick(button).perform(); // right click action*/
		
		/*driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement field= driver.findElement(By.xpath("//*[@id=\"field1\"]"));
		field.clear();
		field.sendKeys("welcome");
		WebElement button= driver.findElement(By.xpath("/html/body/button"));
		Actions act= new Actions(driver);
		act.doubleClick(button).perform();*/
		
		
		/* //how to drag and drop
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement rome= driver.findElement(By.id("box6"));
		WebElement italy= driver.findElement(By.id("box106"));
		Actions act= new Actions(driver);
		act.dragAndDrop(rome, italy).perform();*/
			
		//drag and drop images
		/*driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));	
		WebElement item1= driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]/img"));
		WebElement trash= driver.findElement(By.id("trash"));
		Actions act= new Actions(driver);
		act.dragAndDrop(item1, trash).perform();*/
		
		//mouse over operation
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktopmenu=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
		WebElement macmenu = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
		Actions act= new Actions(driver);
		act.moveToElement(desktopmenu).moveToElement(macmenu).click().perform();
	}
}

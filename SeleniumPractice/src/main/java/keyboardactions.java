import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardactions {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		//to press enter,backspace......
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();*/
		 
		//to press double keys ctrl+v, ctrl+c, ctrl a
		
		driver.get("http://text-compare.com/");
		driver.manage().window().maximize();
		WebElement input1 = driver.findElement(By.id("inputText1"));
		WebElement input2= driver.findElement(By.id("inputText2"));
		input1.sendKeys("welcome");
		Actions act= new Actions(driver);
		
		//ctrl+a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//ctrl+c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//pressing tab 
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//ctrl+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();	
	
		//compare text
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
		System.out.println("text copied");
		else
			System.out.println("text not copied");
	}
}

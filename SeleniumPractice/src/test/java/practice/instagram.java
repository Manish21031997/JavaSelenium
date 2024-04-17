package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class instagram {
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	     driver.get("https://www.instagram.com");
	     driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("manishgowda068@gmail.com");
	     driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("manish@006400");
	     driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"mount_0_0_ig\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[5]/div/div/div/span/div/a/div/div[1]/div/div/svg")).click();
	     driver.findElement(By.xpath("//*[@id=\"mount_0_0_ig\"]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/div/div/div/div[1]/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div/div[1]/div/div/span/img")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"mount_0_0_ig\"]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[1]/p")).sendKeys("Good Morning");
	    driver.findElement(By.xpath("//*[@id=\"mount_0_0_ig\"]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div[3]")).click();
	    driver.close();
}
}
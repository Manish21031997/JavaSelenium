package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//public class selenium21 {
//	public static void main(String[] args) throws InterruptedException {
//		//is enabled is displayed
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com");
//		Thread.sleep(2000);
//		WebElement search=driver.findElement(By.xpath("//*[@id=\"email\"]"));
//		System.out.println(search.isDisplayed());
//		System.out.println(search.isEnabled());
//		driver.close();
//	}
//	
//
//}

public class selenium21 {
    
    public static void main(String[] args) {
        // Create a Scanner to read input
        int[] n= {1,2,3,4,5};

        // Create lists to store even and odd numbers
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        
        // Separate the numbers into even and odd
        for (int i = 1; i <= n.length; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }
        
        // Print the even numbers
        System.out.println("Even numbers:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();  // Newline for better formatting
        
        // Print the odd numbers
        System.out.println("Odd numbers:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
    }
}

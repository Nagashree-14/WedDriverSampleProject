package GoogleTestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		System.out.println("Title...." +driver.getTitle());
		System.out.println("URL...." +driver.getCurrentUrl());
		driver.navigate().back();
	}
		
	}

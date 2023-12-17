package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("alert1")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.quit();
	}

}

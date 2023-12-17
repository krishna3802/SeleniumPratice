package Alerts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmmationAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement w = driver.findElement(By.id("confirmButton"));
		j.executeScript("arguments[0].scrollIntoView(true)", w);
		driver.findElement(By.id("confirmButton")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		System.out.println("script Executed");
		driver.quit();

	}

}
								
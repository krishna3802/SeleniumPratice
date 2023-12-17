package Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.id("promtButton"));
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		ele.click();
		Alert a =driver.switchTo().alert();
		a.sendKeys("krishnakumar");
		a.accept();
		

	}

}

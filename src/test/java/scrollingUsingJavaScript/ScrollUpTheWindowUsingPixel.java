package scrollingUsingJavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpTheWindowUsingPixel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Code to scroll down
		js.executeScript("window.scrollBy(0,200)");
		// code to scroll up
		js.executeScript("window.scrollBy(0,-500)");
	}

}

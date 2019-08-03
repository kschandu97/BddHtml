package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new FirefoxDriver();
			driver.get("file:///D:\\Lesson5-HTMLPages\\hello.html");
			
			Thread.sleep(10000);
			driver.quit();
		
	}
}

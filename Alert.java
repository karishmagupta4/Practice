
package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_221\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("gvhgsuy");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().sendKeys("53r63");
	}
}

package selenium;
import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_221\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php"); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Karishma");
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Gupta");
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("635267836752");
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("karishma@gdhgh");
		/*
		 * List<WebElement> elements = driver.findElements(By.name("country"));
		 * System.out.println("Number of Elements:" +elements.size());
		 * for (int i =0; i<elements.size(); i++) {
		 * System.out.println("Entries in country List:"
		 * +elements.get(i).getAttribute("value")); }
		 */
		
		 /* Select drpCountry = new Select(driver.findElement(By.name("country")));
		 * drpCountry.selectByVisibleText("ANTARCTICA");
		 */
		Select drp = new Select(driver.findElement(By.name("country")));
		//drp.selectByVisibleText("ANGOLA");
		drp.selectByIndex(4);
		System.out.println("done");
		//driver.findElement(By.xpath("//input[@name=\"submit\"]")).click(); 
		
		
 }
}

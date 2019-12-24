package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_221\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php"); 	
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getText());
		//System.out.println(driver.getPageSource());
		//driver.navigate().to("https://facebook.com");
		//driver.navigate().forward();
		//driver.navigate().back();
		//driver.navigate().refresh();
		driver.close();  
	}
}

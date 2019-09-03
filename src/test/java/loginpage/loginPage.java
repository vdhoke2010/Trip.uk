package loginpage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage{
	

	public void login() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Java_my\\AutomationPractice\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		//WebElement element;
		
		WebElement element = driver.findElement(By.xpath(".//a[@title ='Log in to your customer account']"));
		element.click();
		
		//element.findElement(By.xpath(".//a[@title ='Log in to your customer account']"));
		//element.click();
				
		
		//driver.close();
	//	driver.quit();
		
	}
	

}

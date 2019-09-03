package loginpage;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class createAccount {

	@Test
	public void accountCreation() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_my\\AutomationPractice\\src\\test\\resources\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();//Launches your chrome browser
		
		//browser.findElement(By.id("x")).findElement(By.className("z")).findElement(By.xpath("xpath"));
		
		
//		List<WebElement> textboxes = browser.findElements(By.id("x"));
//		for(WebElement textbox : textboxes) {
//			textbox.sendKeys("");
//		}
		
		browser.findElement(By.id("s")).getText();
		
		browser.findElement(By.id("s")).getAttribute("text");
		
		
//		driver.navigate().to("http://automationpractice.com/index.php");
//		driver.manage().window().maximise();
//		WebElement element = driver.findElement(By.xpath(".//a[@title ='Log in to your customer account']"));
//		element.click();
//
//		WebElement element1 = driver.findElement(By.id("create_account_error"));
//		element1.sendKeys("test@gmail.com");
//
//		element1 = driver.findElement(By.xpath(".//button[@name='SubmitCreate']"));
//		element1.click();
		
	}
}

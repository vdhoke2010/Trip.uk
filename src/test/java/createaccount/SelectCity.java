package createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectCity {

	public static void Deprtcity(WebDriver driver, String depCity, String label) throws InterruptedException {

		Actions action = new Actions(driver);
		WebElement departCityCode = driver.findElement(
				By.xpath(".//label[@for='DepartureCity']//following-sibling::input[@name='DepartureCity']"));
		departCityCode.sendKeys(depCity);
		Thread.sleep(2000);

		WebElement departCity = driver
				.findElement(By.xpath(".//div[@class='filter-container']//a/span[text()='" + label + "']"));
		action.click(departCity).perform();
		Thread.sleep(5000);
	

	}

	public static void ArrivalCity(String arrCity, WebDriver driver, String acityLabel) throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement arriveCityCode = driver
				.findElement(By.xpath(".//label[@for='ArrivalCity']//following-sibling::input[@name='DepartureCity']"));
		arriveCityCode.sendKeys(arrCity);
		//action.click(arriveCityCode).perform();
		Thread.sleep(2000);

		WebElement arriveCity = driver.findElement(By.xpath(".//div[@class='filter-container']//a/span[text()='" + acityLabel + "']"));
		action.click(arriveCity).perform();
		
		
	}
}

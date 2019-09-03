package createaccount;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import DateControls.DateControl;
import PassengerSelection.PassengerSelection;

public class bookFlightGobibo {
	WebDriver driver;

	@Test
	public void verifySearchDateDispalyedSuccessfully() throws InterruptedException {
 String expectedDepartDate = "2019-11-21";
 
 
		Actions action = new Actions(driver);

		SelectCity.Deprtcity(driver, "PNQ", "Pune International Airport");
		
		SelectCity.ArrivalCity("BLR", driver, "Kempegowda International Airport");

		DateControl.departDateSelection("Nov 2019", expectedDepartDate, "21", driver);
		DateControl.departDateSelection("Mar 2020", "2020-03-25", "25", driver);
		PassengerSelection.SelectPassegerTravelling("Adult", "2", driver);
		PassengerSelection.SelectPassegerTravelling("Children", "1", driver);
		PassengerSelection.SelectPassegerTravelling("Infant", "1", driver);

		WebElement searchButton = driver.findElement(By.id("SearchSubmit"));
		action.click(searchButton).perform();
		Thread.sleep(5000);
		
		WebElement actualtDateElement = driver.findElement((By.xpath(".//span[@class='j_listABTit']//following-sibling::span[1]")));
		
		String actualtDate = actualtDateElement.getText();
		
		Assert.assertEquals("21 november 2019", actualtDate);
		
	}
	
	@Before
	public  void  setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_my\\cucumber-java-vibhay\\java-selenium-command\\java-selenium-components\\src\\test\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to("https://uk.trip.com/flights/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
	
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	
	@Test
	public void verifyDepartureCityDispalyedSuccessfully() throws InterruptedException {

		
		
		Actions action = new Actions(driver);

		SelectCity.Deprtcity(driver, "PNQ", "Pune International Airport");
		
		SelectCity.ArrivalCity("BLR", driver, "Kempegowda International Airport");

		DateControl.departDateSelection("Nov 2019", "2019-11-21", "21", driver);
		DateControl.departDateSelection("Mar 2020", "2020-03-25", "25", driver);
		PassengerSelection.SelectPassegerTravelling("Adult", "2", driver);
		PassengerSelection.SelectPassegerTravelling("Children", "1", driver);
		PassengerSelection.SelectPassegerTravelling("Infant", "1", driver);

		WebElement searchButton = driver.findElement(By.id("SearchSubmit"));
		action.click(searchButton).perform();
		Thread.sleep(5000);
		
		WebElement actualtDepartureCityElement = driver.findElement((By.xpath(".//span[@class='j_listABTit']")));
		
		String actualtDepartureCity = actualtDepartureCityElement.getText();
		
		Assert.assertEquals("Select departure flight to Bangalore", actualtDepartureCity);
		
	}

}

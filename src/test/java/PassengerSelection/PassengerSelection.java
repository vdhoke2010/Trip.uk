package PassengerSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PassengerSelection {

	public static void SelectPassegerTravelling(String typeOfPassenger, String numberOfPassenger, WebDriver driver) {

		// typeOfPassenger are Adults , Children , Infants.
		Actions action = new Actions(driver);

		String xpathForMinus = ".//label[starts-with(text(),'" + typeOfPassenger+ "')]//following-sibling::div[@class='number-counter']/span[@class='button-minus']/span[@class='minus']";
		String xpathForyPlus = ".//label[starts-with(text(),'" + typeOfPassenger
				+ "')]//following-sibling::div[@class='number-counter']/span[@class='button-plus']/span[@class='plus-h']";
		String xpathForCounter = ".//label[starts-with(text(),'" + typeOfPassenger
				+ "')]//following-sibling::div[@class='number-counter']/span[@class='counter']";

		// Resets the counter to zero
		while (!(driver.findElement(By.xpath(xpathForCounter)).getText().equals("0"))) {

			WebElement forMinus = driver.findElement(By.xpath(xpathForMinus));
			action.click(forMinus).perform(); // value set to zero

		}
		// Increments the counter to the - number of passengers
		while (!driver.findElement(By.xpath(xpathForCounter)).getText().equals(numberOfPassenger)) {
			WebElement forPlus = driver.findElement(By.xpath(xpathForyPlus));
			action.click(forPlus).perform();
		}
		
	}

	
	
}

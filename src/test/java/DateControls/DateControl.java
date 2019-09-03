package DateControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DateControl {
	

	public static void departDateSelection(String expectedDepartMonth,String date,String day,  WebDriver driver) throws InterruptedException {

	
		Actions action = new Actions(driver);
		WebElement departDate = driver.findElement(By.xpath(".//div[@class='month-label month-label-1st']"));
						String departMonthValue = departDate.getText();
		//System.out.println(departMonthValue);

		// String expectedDepartMonth1 = null;

		while (!(driver.findElement(By.xpath(".//div[@class='month-label month-label-1st']")).getText())
				.equals(expectedDepartMonth)) {

			//System.out.println((driver.findElement(By.xpath(".//div[@class='month-label month-label-1st']")).getText()));
			WebElement nextButton = driver.findElement(By.xpath(".//i[@class='next-btn']"));
			action.click(nextButton).perform();
		}
		Thread.sleep(3000);
		WebElement departDateSelect = driver.findElement(By.xpath(".//div[@class='month-con  month-1st']//tbody/tr[4]/td[@data-id='"+date+"']/div[text()='"+day+"']"));
			action.click(departDateSelect).perform();
		//	System.out.println(departDateSelect);
		

	}
	

}






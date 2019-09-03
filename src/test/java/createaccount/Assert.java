package createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DateControls.DateControl;

public class Assert {
	
	public static String departDate(WebDriver driver) {

		
	WebElement departDate= driver.findElement(By.xpath(".//span[@class='j_listABTit']//following-sibling::span[1]"));
	String compareDate=departDate.getText();
	System.out.println(compareDate);
	return compareDate;
	
	
	}		
	}

	


	



	
	
	


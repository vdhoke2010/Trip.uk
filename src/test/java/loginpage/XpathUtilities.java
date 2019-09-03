package loginpage;

public class XpathUtilities {

	public static String xpath(String label) {
		String xpath = ".//label[starts-with(text(),'" + label
					+ "')]//following-sibling::div[@class='number-counter']/span[@class='counter']";
			return xpath;

	}

}

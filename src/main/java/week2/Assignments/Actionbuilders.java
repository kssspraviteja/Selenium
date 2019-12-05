package week2.Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionbuilders {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver browser= new ChromeDriver();
		browser.get("http://www.leafground.com/pages/drop.html");
		Actions builder = new Actions(browser);
		WebElement draggable = browser.findElementById("draggable");
		WebElement droppable = browser.findElementById("droppable");
		builder.dragAndDropBy(draggable, 150, 25).perform();
		System.out.println(draggable.getCssValue("background"));
		
			}


}

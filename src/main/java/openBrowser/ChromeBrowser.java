package openBrowser;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		
		ChromeDriver browser = new ChromeDriver();
		
		browser.get("http://leaftaps.com/opentaps/control/main");
		
		browser.get("http://leaftaps.com/opentaps/control/main");
		browser.findElementById("username").sendKeys("DemoSalesManager");
		browser.findElementById("password").sendKeys("crmsfa");
		browser.findElementByClassName("decorativeSubmit").click();
		browser.findElementByLinkText("CRM/SFA").click();
		browser.findElementByLinkText("Leads").click();
		browser.findElementByPartialLinkText("Create").click();
		
		browser.manage().window().maximize();
		
		WebElement Source = browser.findElementByName("dataSourceId");
		
		Select sourcevalue = new Select(Source);
		sourcevalue.selectByValue("LEAD_CONFERENCE");
		List<WebElement> options = sourcevalue.getOptions();
		
		
		
		
		
		

		
		
	}
	
}

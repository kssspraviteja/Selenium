package week2.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {


	public static void main(String[] args) throws InterruptedException {

		String TrainName = "PUNJAB MAIL";
		int j = 0;


		//		System.getProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");

		ChromeDriver browser = new ChromeDriver();

		browser.get("http://erail.in");
		browser.manage().window().maximize();

		browser.findElementById("buttonFromTo").click();
		browser.findElementById("chkSelectDateOnly").click();
		//		WebElement webtable = browser.findElementByXPath("//table[@class = 'DataTable TrainList TrainListHeader']");
		//		WebElement webtable = browser.findElementByClassName("DataTable TrainList TrainListHeader");

		Thread.sleep(3000);

		//		WebElement webtable = browser.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		WebElement webtable = browser.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");

		List<WebElement> rowelements = webtable.findElements(By.tagName("tr"));

		//		rowelements.size();
		//		System.out.println(rowelements.size());

		//		List<WebElement> colelements = rowelements.get(1).findElements(By.tagName("td"));

		//		colelements.size();

		//		System.out.println(colelements.get(0).getText());

		//		List<WebElement> colelements = rowelements.get(1).findElements(By.tagName("td"));
		//		for (int i = 0; i < colelements.size()-1; i++) {
		//
		//
		//			System.out.println(colelements.get(i).getText());
		//================================================
		for (int i = 0; i < rowelements.size(); i++) {

			String matchname = "";
			List<WebElement> colelements = rowelements.get(i).findElements(By.tagName("td"));

			//			System.out.println(colelements.get(1).getText());

			matchname = colelements.get(1).getText();
			//			System.out.println(matchname);
			//			System.out.println(TrainName);
			if (matchname.equalsIgnoreCase(TrainName)) {

				System.out.println("You are looking for " + matchname );

				j = i;
			}


			//			else {
			//				System.out.println("Train match not found");
			//			}





		}

		System.out.println(j);
		
		List<WebElement> traindetails = rowelements.get(j).findElements(By.tagName("td"));
		traindetails.size();
		for (int i = 0; i < traindetails.size()-1; i++) {
			System.out.print(traindetails.get(i).getText()+ " ");
			
		}
		
	}		


	


}


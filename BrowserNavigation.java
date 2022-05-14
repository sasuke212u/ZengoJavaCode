package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserNavigation {
	
	public void launchBrowser(WebDriver driver){
		
		String ZengoUrl = "https://zengo.com/";
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//open zengo website
		driver.get(ZengoUrl);
	}
	
	public void buyFeature(WebDriver driver) throws InterruptedException {
		
		String featuresPath = "//a[normalize-space()='Features']";
		String buyBtnPath = "//a[normalize-space()='Buy']";
		
		//finding the feature element and toggling it
		driver.findElement(By.xpath(featuresPath)).click();
		
		//wait for the drop menu
		Thread.sleep(500);
		
		//heading to the buy feature page
		
		driver.findElement(By.xpath(buyBtnPath)).click();
	}
	
	public void backToHomePage(WebDriver driver) throws InterruptedException {
		
		String ZengoUrl = "https://zengo.com/";

		//navigate back to the home page
		driver.navigate().to(ZengoUrl);
		
		Thread.sleep(3000);
		
		//close the browser
		driver.close();
	}
}

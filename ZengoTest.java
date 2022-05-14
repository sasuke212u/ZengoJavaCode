package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZengoTest {
	
	
	public static void main(String[] args) throws Exception {
		
			//initalizing chrome path & launching it 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\OzShalem\\Documents\\selenium\\chromedriver.exe");
			WebDriver zengoSite = new ChromeDriver();
			
			BrowserTests zengoTest = new BrowserTests();
			BrowserNavigation zengoNav = new BrowserNavigation();
			
			zengoNav.launchBrowser(zengoSite);
			
			Thread.sleep(2000);
			
			if(zengoTest.checkIfDisplayed(zengoSite)) {
				System.out.println("site is successfully displayed!");
			} else {
				throw new Exception("site is not displayed properly!");
			}
			
			//navigate to buy page
			zengoNav.buyFeature(zengoSite);
			Thread.sleep(2000);
			
			if(zengoTest.assertURL(zengoSite)) {
				System.out.println("URL is correct!");
			} else {
				throw new Exception("URL is incorrect!");
			}
			
			//waiting for buy feature page to load
			Thread.sleep(2000);
			
			if(zengoTest.checkLogo(zengoSite)) {
				System.out.println("logo is displayed properly!");
			} else {
				throw new Exception("Logo is not displayed properly!");
			}
			
			zengoNav.backToHomePage(zengoSite);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

		
}


package FirstTest;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserTests {
	
	public boolean checkIfDisplayed(WebDriver driver) {
		
		//creating an instance of javascript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//checking if the page has loaded successfully
		boolean status = js.executeScript("return document.readyState").toString().equals("complete");
		
		return status;
	}
	
	public boolean assertURL(WebDriver driver){
			
			String requiredURL = "https://zengowallet.banxa.com/";
			
			//getting the website url
			String url = driver.getCurrentUrl();
			
			//checks if the current page url is the correct one
			if(url.startsWith(requiredURL)) {
				return true;
			}
			return false;
	}

	public boolean checkLogo(WebDriver driver){
		
		String zengoLogoPath = "/html/body/div[1]/div/div/div/div/img[2]";
		
		//checking if the logo is displayed correctly
		WebElement zengoLogo = driver.findElement(By.xpath(zengoLogoPath));
		if(zengoLogo.isDisplayed()) {
			return true;
		}
		return false;
	}
	
}

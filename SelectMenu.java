package Team6;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SelectMenu {

	public static void main(String[] args) {
		
		String baseURL= "http://demo.guru99.com/test/guru99home";
		int waitTime= 50;
		
		//trigger browser
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		
		//utilize the defined method
		selectMenuItem("Bank Project", driver);
	}
	
	//define method
	public static void selectMenuItem(String str, WebDriver dr) {
		WebElement listElement = dr.findElement(By.xpath("//ul[@class= 'nav navbar-nav' ]"));
        List<WebElement> childElements= listElement.findElements(By.xpath("//li[@class='dropdown']/child::a"));
		for (int i=0; i< childElements.size(); i++) {
			if (childElements.get(i).getText().equals(str)) {
				childElements.get(i).click();
				System.out.print("Pass");
				break;
			}
		}	
		dr.close();
}
}

  


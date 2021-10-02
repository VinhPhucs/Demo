package Team6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementWithXpath {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","E:\\HOCTAP\\KIỂM THỰ TỰ �?ỘNG\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/guru99home/";
        
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //Parent(driver);
        //AncestorFollowing(driver);
        Preceding(driver);
        //Following(driver);
     
        
        
        

    }
    
    public static void Parent(WebDriver driver) {
        //Parent
        List <WebElement> data = driver.findElements(By.xpath("//h2[contains(text(),'Check out our newest courses')]/parent::div"));
        for (WebElement webElement : data) {
            System.out.println(webElement.getText());
        }     

        driver.close();
    }
    
    public static void AncestorFollowing(WebDriver driver) {
        //Ancestor & Following-sibling
        List <WebElement> data1 = driver.findElements(By.xpath("//div[.//a[text()='SELENIUM']]/ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));
        for (WebElement webElement : data1) {
            System.out.println(webElement.getText());
        }     

        driver.close();
    }
    
    public static void Following(WebDriver driver) {
        //Following
        WebElement w =driver.findElement(By.xpath("//*[contains(text(),'Check out our newest courses')]//following::div[1]"));
        System.out.println(w.getText());
      
        driver.close();
    }
    
    public static void Preceding(WebDriver driver) {
          //preceding    
          WebElement w1 =driver.findElement(By.xpath("//*[contains(text(),'VBScript')]//preceding::div[1]"));
          System.out.println(w1.getText());
          
          driver.close();
    }
    
    
    
}
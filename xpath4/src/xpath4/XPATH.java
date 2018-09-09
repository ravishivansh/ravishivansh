package xpath4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPATH {
	 public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
	    	
	       // String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String baseUrl1 ="https://www.guru99.com/";
 // launch Fire fox and direct it to the Base URL
     driver.get(baseUrl1);
    // WebElement we=driver.findElement(By.xpath("//*[@type='text']//following::input[1]"));
    // we.sendKeys("123456");
    // WebElement we=driver.findElement(By.xpath("//*[text()='Enterprise Testing']//ancestor::div[1]"));
    // WebElement we=driver.findElement(By.xpath("//*[@id='java_technologies']/child::li[2]"));
     WebElement we=driver.findElement(By.xpath("//*[@id='java_technologies']"));
     String str=we.getText();
     System.out.println(str);
     
	 }
}

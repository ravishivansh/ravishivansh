package MAVENGIT.MAVENGITTEST1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apptest {
	
	protected WebDriver driver;
	@Test
	public void gur99tutorials() throws InterruptedException
	{
		
		System.setProperty("webdriver,chrome.exe","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("test git maven integration");
		driver.close();
		
	}
	

}

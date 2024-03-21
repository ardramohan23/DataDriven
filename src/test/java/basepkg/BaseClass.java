package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	String url="https://www.facebook.com";
	
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	

}

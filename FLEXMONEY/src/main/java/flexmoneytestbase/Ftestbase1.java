package flexmoneytestbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Ftestbase1 {
	public static WebDriver d;
	@BeforeMethod
	public void openurl() {
		System.setProperty("webdriver.chrome.driver","D:\\VelocityTraning\\Setups\\Newchrome\\chromedriver_win32 (2)\\chromedriver.exe");
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://staging.instacred.me/simulation/tpsl/e2e-transaction.jsp");
		//
	}
	
		@AfterMethod
		public void close() {
			d.quit();
			
		}
	}



package abbbbbb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class ABBB {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\VelocityTraning\\Setups\\Newchrome\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.flipkart.com");
		//d.findElement(By.xpath(""));
	}

}

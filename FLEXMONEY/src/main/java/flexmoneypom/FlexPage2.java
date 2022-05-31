package flexmoneypom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FlexPage2 {
	WebDriver d;
	public FlexPage2() {
		PageFactory.initElements( d,this);
	}
	@FindBy(xpath="//input[@id='1000001']")
	private WebElement emi;
	
	@FindBy(xpath="//div[@class='genericButtonContainer']")
	private WebElement confirm;
	
	public void radiobutton() {
		emi.click();
	}
	public void confirmbutton() {
		confirm.click();
	}
	
}

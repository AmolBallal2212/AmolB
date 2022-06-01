package flexmoneypom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FPage4 {
	WebDriver d;
	public FPage4() {
		PageFactory.initElements( d,this);
	}
	@FindBy(xpath="//input[@type='tel']")
	private WebElement otp;
	//
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement agree;
	
	@FindBy(xpath="//div[@class='genericButtonContainer']")
	private WebElement verify;
	public void otpp() {
		otp.sendKeys("777777");
	}
	public void agree() {
		agree.click();
		
	}
	public void verify() {
		verify.click();
	}
	

}

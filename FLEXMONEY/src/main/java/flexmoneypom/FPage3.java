package flexmoneypom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FPage3 {
	WebDriver d;
	//
	public FPage3() {
		PageFactory.initElements(d,this);
		
	}
	@FindBy(xpath="//div[@class='inputContainerArea__35whK']")
	private WebElement debit;
	
	@FindBy(xpath="div[@class='genericButtonContainer']")
	private WebElement button;
	
	public void debitcard() {
		debit.sendKeys("1234");
	}
	public void buttonclick() {
		button.click();
	}

}

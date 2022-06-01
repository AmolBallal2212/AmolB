package flexmoneypom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import flexmoneytestbase.Ftestbase1;

public class FPage1 extends  Ftestbase1  {
	public  FPage1() {
		PageFactory.initElements(d, this);
	}
	//
	
	@FindBy(xpath="//select[@id='GID']")
	private WebElement click;
	
	@FindBy(xpath="//select[@id='GID']")
	private WebElement gateway;
	
	@FindBy(xpath="//input[@id='AMT']")
	 private WebElement amount;

	@FindBy(xpath="//input[@id='CI']")
	private WebElement mobile;
	
	@FindBy(xpath="//select[@id='bank_code_fm']")
	private WebElement lender;
	@FindBy(xpath="//button[@onclick='proceedWithInstaEmi()']")
	private WebElement button;
	 
	 

		
	
		
	public void fieldname1() {
		Select s= new Select(gateway);//dropdown
		s.selectByValue("6");
		
	}
		public void fieldname2() {
			amount.clear();
			amount.sendKeys("10000");
			
		}
		public void fieldname3() {
			mobile.sendKeys("9988998899");
		}
		public void filedname4() {
			
			Select s= new Select (lender);
			s.selectByVisibleText("IDFC");
		}
		public void fieldname5() {
			button.click();
		
	
	}
}




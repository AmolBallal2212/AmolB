package flexmoneyTest;

import org.testng.annotations.Test;

import flexmoneypom.FPage1;
import flexmoneypom.FPage3;
import flexmoneypom.FPage4;
import flexmoneypom.FlexPage2;

public class FlexExecution {
	 public static FPage1 j;
	@Test
	public void firstpage() {
		 j= new FPage1();
		j.openurl();
		j.fieldname1();
		j.fieldname2();
		j.fieldname3();
		j.filedname4();
		j.fieldname5();
		//
	}
@Test
public void second() {
	 FlexPage2 m=new  FlexPage2();
	 
	 m.radiobutton();
	 m.confirmbutton();
}
@Test
public void third() {
	FPage3 k= new FPage3();

	k.debitcard();
	k.buttonclick();
}
@Test
public void four() {
	 FPage4 l= new  FPage4();
	 
	 l.otpp();
	 l.agree();
	 l.verify();
}
@Test
public void end() {
	j.close();
}
}

package com.test.channelplay.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.channelplay.utils.DriverBase;

public class CRMAutomationDemoObject extends DriverBase{
	
	//Testing GIT hub.
	@FindBy(xpath="//input[@formcontrolname=\"email\"]")
	private WebElement email;
	
	@FindBy(xpath="//input[@formcontrolname=\"password\"]")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@id=\"kt_login_signin_submit\"]")
	private WebElement loginButton;
	
	@FindBy(xpath="//ul[@class=\"menu-nav\"]//span[text()=\" CRM \"]")
	private WebElement crm_nav;
	
	@FindBy(xpath="//ul[@class=\"menu-nav\"]//span[text()=\" Customers \"]")
	private WebElement customers_option;
	
	@FindBy(xpath="//button/span[text()=\"Add\"]")
	private WebElement addButton;
	
	@FindBy(xpath="//label[text()=\"Customer Name\"]//parent::div//following-sibling::div//input")
	private WebElement CRM_Taufik_customerName_field;
	
	public CRMAutomationDemoObject() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void User_enter_email() {
		email.sendKeys("taufik@1channel.ai");
		sleep(2000);
	}
	
	public void User_enter_password() {
		passWord.sendKeys("test1234");
		sleep(2000);
	}
	
	public void Select_signin_button() {
		loginButton.click();
		sleep(4000);
	}
	
	public void User_select_crm() {
		sleep(4000);
		crm_nav.click();
		sleep(2000);
	}
	
	public void User_select_customer() {
		customers_option.click();
		sleep(5000);
	}
	
	public void User_selects_add_button() {
		addButton.click();
		sleep(2000);
	}
	
	public void User_enter_customer_name() {
		CRM_Taufik_customerName_field.sendKeys("Henry Ritch");
		sleep(4000);
	}
	
	public void sleep(long s) {
		try {
			Thread.sleep(s);
		} catch(InterruptedException c) {
			c.printStackTrace();
		}
	}


}

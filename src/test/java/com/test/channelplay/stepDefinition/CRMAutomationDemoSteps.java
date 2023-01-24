package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.CRMAutomationDemoObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMAutomationDemoSteps extends DriverBase{
	
	CommonUtils commonUtils = new CommonUtils();
	CRMAutomationDemoObject cRMAutomationDemoObject = new CRMAutomationDemoObject();
	
		@Given("user open CRM project")
		public void user_open_crm_project() {
			getDriver().get(GetProperty.value("appUrl"));
			commonUtils.validatePage("Assistive");
		}

		@When("user enter email")
		public void user_enter_email() {
			cRMAutomationDemoObject.User_enter_email();
		}
		
		@And("user enter password")
		public void user_enter_password() {
			cRMAutomationDemoObject.User_enter_password();
		}

		
		@And("select signin button")
		public void select_signin_button() {
			cRMAutomationDemoObject.Select_signin_button();
		}


		@And("user select crm")
		public void user_select_crm() {
			cRMAutomationDemoObject.User_select_crm();
		}

		
		@And("user select customer")
		public void user_select_customer() {
			cRMAutomationDemoObject.User_select_customer();
		}
		
		@And("user selects add button")
		public void user_selects_add_button() {
			cRMAutomationDemoObject.User_selects_add_button();
		}


		@And("user enter customer name")
		public void user_enter_customer_name() {
			cRMAutomationDemoObject.User_enter_customer_name();
		}
		


}

package test_cases;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;

import base.Configure_Enviroment_setting;
import locator.Waccount_locator_objrepository;
import locators_values.Waccount_values_testdata;

public class Walmart_account  extends Configure_Enviroment_setting{
	Waccount_locator_objrepository locator_obj = new Waccount_locator_objrepository();
	Waccount_values_testdata values_obj = new Waccount_values_testdata();
	@Test()
	public void walmartaccount() {
	clickByXpath(locator_obj.homepage_accountlink_xpath);
	clickByXpath(locator_obj.next_accountlink_xpath);
	clickByXpath(locator_obj.create_an_account_custom_xpath);
	typeByXpath(locator_obj.first_name_relaive_xpath,values_obj.waccount_firstname);
	typeByXpath(locator_obj.last_name_custom_xpath,values_obj.waccount_lastname);
	typeByXpath(locator_obj.email_address_custom_xpath,values_obj.waccount_email);
	typeByXpath(locator_obj.create_a_password_custom_xpath,values_obj.waccount_password);
	checkbox_checking(locator_obj.check_box_xpath);
	checkbox_checking(locator_obj.another_check_box_xpath);
	clickByXpath(locator_obj.create_account_custom_xpath);
	
	}
	
	
	}

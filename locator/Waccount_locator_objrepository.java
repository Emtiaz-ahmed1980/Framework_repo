package locator;

public class Waccount_locator_objrepository {
	
	//This locator for click on  Walmart Home page 'Account' link on the top 
	
	public String homepage_accountlink_id = "hf-account-flyout";
	public String homepage_accountlink_xpath = "//*[@id='hf-account-flyout']";
	public String homepage_accountlink_custom_xpath = "//button[@id='hf-account-flyout']";
	public String homepage_accountlink_cssSelector = "#hf-account-flyout";
	
	
	//This locator for click on Walmart next 'Account' link to open a new page


	public String next_accountlink_linkText = "Account";
	public String next_accountlink_xpath = "//div[@id='header-bubble-menu']//a[3]";
	public String next_accountlink_absolute_xpath= "/html/body/div[1]/div/div/div[1]/section/div[3]/div[2]/div/div/div[2]/div/a[3]";
	public String next_accountlink_cssSelector = ".bc_e > a:nth-child(3)";

    //This locator for click on 'create an account' link
	
	public String create_an_account_className = "hf-account-flyout";
	public String create_an_account_absolute_xpath = "/html/body/div[1]/div[2]/div/div/main/span/div[1]/div/nav/div[1]/div/a[2]";
	public String create_an_account_custom_xpath = "//div[@class='s-margin-left l-margin-top']//a[@class='xxs-margin-left'][contains(text(),'create an account')]";
	public String create_an_account_cssSelector = ".s-margin-left > a:nth-child(2)";
	

    //This locator provide input 'First name' in text box

	public String first_name_id = "first-name-su";
	public String first_name_relaive_xpath = "//*[@id='first-name-su']";
	public String first_name_custom_xpath = "//input[@id='first-name-su']";
	public String first_name_cssSelector = "#first-name-su";


    //This locator provide input 'Last name' in text box

    
	public String last_name_id = "last-name-su";
	public String last_name_relaive_xpath = "//*[@id='last-name-su']";
	public String last_name_custom_xpath = "//input[@id='last-name-su']";
	public String last_name_absolute_xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[2]/div[3]/input[1]";
	public String last_name_cssSelector = "#last-name-su";
 

    //This locator provide input 'Email address' in text box

     
	public String email_address_id = "email-su";
	public String email_address_relaive_xpath = "//*[@id='email-su']";
	public String email_address_custom_xpath = "//input[@id='email-su']";
	public String email_address_absolute_xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[2]/div[4]/input[1]";
	public String email_address_cssSelector = "#email-su";
 

    //This locator provide input 'Create a password' in text box

	public String create_a_password_id = "password-su";
	public String create_a_password_xpath = "//*[@id='password-su']";
	public String create_a_password_custom_xpath = "//input[@id='password-su']";
	public String create_a_password_absolute_xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[2]/div[5]/input[1]";
	public String create_a_password_cssSelector = "#password-su";

    
   //This locator select 'Check box' (keep me signed in) 

	public String check_box_id = "remember-me-su";
	public String check_box_xpath = "//*[@id='remember-me-su']";
	public String check_box_custom_xpath = "//input[@id='remember-me-su']";
	public String check_box_cssSelector = "#remember-me-su";

   
	// This locator select another 'Check box'(Email me about Rollbacks & more)

    public String another_check_box_id = "su-newsletter";
	public String another_check_box_xpath = "//*[@id='su-newsletter']";
	public String another_check_box_custom_xpath = "//input[@id='su-newsletter']";
	public String another_check_box_cssSelector = "#su-newsletter";


    //This locator click on  submit 'Create account'

	    public String create_account_absolute_xpath = "/html/body/div[1]/div/div[2]/form[2]/button[1]";
		public String create_account_custom_xpath = "//form[@id='sign-up-form']//button[@class='button s-margin-top text-inherit'][contains(text(),'Create account')]";
		public String create_account_cssSelector = "#sign-up-form > button:nth-child(11)";

}

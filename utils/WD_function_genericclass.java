package utils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WD_function_genericclass {
	public static WebDriver driver = null;
    public static Logger log = Logger.getLogger("devpinoyLogger");
	
	//This method for type by xPath locator
	public void typeByXpath (String locators, String values){
		try {
		driver.findElement(By.xpath(locators)).clear();
		driver.findElement (By.xpath(locators)).sendKeys (values);
	}catch(Exception e) {
		log.debug("Issued with:"+e.getMessage());
		//System.out.println("Issued with:"+e.getMessage());
	}
}
   
	
	//This method for click by xPath locator
	public void clickByXpath (String locators){
		try {
		driver.findElement(By.xpath(locators)).click();;
		
	}catch(Exception e) {
		log.debug("Issued with:"+e.getMessage());
		//System.out.println("Issued with:"+e.getMessage());
	}
}

	
	//This method for type by name locator
	public void typeByName (String locators, String values){
		try {
		driver.findElement(By.name(locators)).clear();
		driver.findElement (By.name(locators)).sendKeys (values);
		}catch(Exception e) {
			System.out.println("Issued with:"+e.getMessage());
		}
	
		}
	
	
	//This method for click by name locator
	public void clickByName (String locators){
		try {
		driver.findElement (By.xpath(locators)).click();
		}catch(Exception e) {
			System.out.println("Issued with:"+e.getMessage());
		}
	}
	
	
	//This method for type by id locator
	public void typeById (String locators, String values){
		try {
		driver.findElement(By.id(locators)).clear();
		driver.findElement (By.id(locators)).sendKeys (values);
		}catch(Exception e) {
			System.out.println("Issued with:"+e.getMessage());
		}
	
	}
	
	//This method for click by id locator
	public void clickByid (String locators){
		try {
		driver.findElement (By.xpath(locators)).click();
		}catch(Exception e) {
			System.out.println("Issued with:"+e.getMessage());
		}
	}
	
	
	//This method for type by cssSelector locator
	public void typebycss(String locators, String values)  {
		try {
		driver.findElement(By.cssSelector(locators)).clear();
		driver.findElement(By.cssSelector(locators)).sendKeys(values);
	} catch(Exception e)  {
		System.out.println("Issued with:" +e.getMessage());
	      }
	}
	
	
	//This method for click by cssSelector locator
		public void clickbycss(String locators)  {
			try {
			driver.findElement(By.cssSelector(locators)).click();
			
		} catch(Exception e)  {
			System.out.println("Issued with:" +e.getMessage());
		      }
		}
	
	
		//This method for type by class locator
		public void typeByclass (String locators, String values){
			try {
			driver.findElement(By.className(locators)).clear();
			driver.findElement (By.className(locators)).sendKeys (values);
		}catch(Exception e) {
			System.out.println("Issued with:"+e.getMessage());
		}
	}
	
	
		//This method for click by class locator
				public void clickbyclass(String locators)  {
					try {
					driver.findElement(By.className(locators)).click();
					
				} catch(Exception e)  {
					System.out.println("Issued with:" +e.getMessage());
				      }
				}
	
	
				//This method for click by linkText locator
				public void clickbylinkText(String locators)  {
					try {
					driver.findElement(By.linkText(locators)).click();
					
				} catch(Exception e)  {
					System.out.println("Issued with:" +e.getMessage());
				      }
				}
	
	
				
				//This method for click by partialLink Text locator
				public void clickbypartialLinkText(String locators)  {
					try {
					driver.findElement(By.partialLinkText(locators)).click();
					
				} catch(Exception e)  {
					System.out.println("Issued with:" +e.getMessage());
				      }
				}
	
	
				
		//This method use delete for cookies
		public void cookies() {
			try {
				driver.manage().deleteAllCookies();
			}
			catch(Exception e)  {
				System.out.println("Issued with:" +e.getMessage());
				
				}
		}
	
	
		//This method for window maximize
		public  void maximizePage (){
			try {
			driver.manage().window().maximize();

		}catch(Exception e) {
			System.out.println("Issued with:"+e.getMessage());
		}
		    }
		
		
//This method for IMPLICIT WAIT 		
       public void waitByImplicit(int time) {
	try{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	catch(Exception e)
	{
		System.err.println("issue with:" + e.getMessage());
	}
}
		
		
		//This method for Implicit wait
	public void waitTillPageLoad(long i)  {
		try {
		driver.manage().timeouts().implicitlyWait(i,TimeUnit.SECONDS);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	     }
	}
	
	
	
//This method for EXPLICIT WAIT 
	public void waitByExplicit (String locators){
		try{
			WebDriverWait explicitwait = new WebDriverWait(driver,5000);
			explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locators)));
			driver.findElement(By.xpath(locators));
		}
		catch (Exception e)
		
		{
			System.err.println("issue with:"  + e.getMessage());
		}
	}
	
	
/*public void fluentWait (int timeout,int pollingEvery) {
	FluentWait fobj = new FluentWait<WebDriver>(driver).withTimeout(timeout,TimeUnit.SECONDS).pollingEvery(pollingEvery,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
}*/
	
	
	
	
	
	
	
	//This method for Explicit wait (for condition ....elementToBeClickable)
	public void waitForElement(String locators, long seconds) {
		try {
			WebElement element = driver.findElement(By.xpath(locators));
			WebDriverWait wait = new WebDriverWait(driver,seconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
		
		//This method for Explicit wait (for condition....visibility of)
		public void waitTillElementFound(String locators, long seconds)  {
			try {
				WebElement ElementTobeFound = driver.findElement(By.xpath(locators));
				WebDriverWait wait = new WebDriverWait(driver,seconds);
				wait.until(ExpectedConditions.visibilityOf(ElementTobeFound));
			}  catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		//This method for navigate back
		public void navigate_back() {
			try {
			driver.navigate().back();
			} catch(Exception e)  {
				System.out.println(e.getMessage());
			}
		}
		
		
		
		//This method for browser refresh
				public void browser_refresh() {
					try {
					driver.navigate().refresh();
					} catch(Exception e)  {
						System.out.println(e.getMessage());
					}
				}
		
		
//This method for clear Text box		
			public static void clearTextField(String locators) {
				try {
					WebElement element = driver.findElement(By.xpath(locators));
					element.clear();
				} catch(Exception e)  {
					System.out.println(e.getMessage());
				}
			}
		
			
//This method is for check WebElement Selected or not
			public static boolean selectElement(WebElement sl, String locators) {
				boolean resultSelect = false;
				try {
					WebElement element = driver.findElement(By.xpath(locators));
					resultSelect = element.isSelected();
					if(resultSelect) {
						element.click();
					}
					//return resultSelect;
				}  catch(Exception e) {
					System.out.println(e.getMessage());
				}
				return resultSelect;
			}
			
			
			
//This method for checkbox_cheeking (by default check or not)
			public void checkbox_checking(String locators) {
				try {
				WebElement checkbox = driver.findElement(By.xpath(locators));
				boolean checkstatus = selectElement(checkbox,locators);
				if(checkstatus) {
					System.out.println("checkbox is already checked");
				}
				else {
					checkbox.click();
					System.out.println("other wise click the check box");
				}
			} catch(Exception e)  {
				System.out.println(e.getMessage());
			      }
				
			}	
				
				
	//This method for checkbox_unchecking(if default select then do unselect if need)
		 public void checkbox_unchecking(String locators) {
			 try {
			 WebElement checkbox = driver.findElement(By.xpath(locators));
			 boolean checkstatus = checkbox.isSelected();
			 if (checkstatus) {
				 checkbox.click();
				 System.out.println("Checkbox is unchecked");
			 }  else {
				 System.out.println("Checkbox is already unchecked");
			 }
		 } catch(Exception e) {
			 System.out.println(e.getMessage());
		         }
				
		 }
		
		
			
//This method for Get URL
		 public void getURL (){
			 try {
			 String currentURl = driver.getCurrentUrl();
			 System.out.println(currentURl);
		 } 
			 catch(Exception e)
			 {
				 System.err.println("issue is:" + e.getMessage());
			      }
			 }
			
			
//This method for check box by xPath locators			
	public void checkBox (String locators){ 
		try {
	WebElement checkbox = driver.findElement(By.xpath(locators));
		boolean isDisplayedCheck = checkbox.isDisplayed();
		if (isDisplayedCheck)
		{
			boolean isEnabledCheck = checkbox.isEnabled();
			if(isEnabledCheck) 
			{
		    boolean	isSelectedCheck = checkbox.isSelected();
		    if(isSelectedCheck)
		    {
		    	System.out.println("already checked");
		                                }
		    else
		                 
		    {
		    	driver.findElement(By.xpath(locators)).click();
		         }
			}
			else
			{
				System.out.println("object is not enabled");
			}
		}
		else
		{
			System.out.println("object is not displayed");
		    }
	  }
		catch(Exception e)
		{
			System.err.println("issue with: " + e.getMessage());
		       }
	}
		 
		 
		 
		 
//This method for drop down List by xPath locator
	  public void dropdownByXpath(String locators, String values){
		   try{
	WebElement dd = driver.findElement(By.xpath(locators));
	Select ddSelect = new Select (dd);
	ddSelect.selectByVisibleText(values);
			  }
			  catch(Exception e)
			  {
			System.err.println("issue with :" + e.getMessage());
			  }
		  }
	  
		
	  


//This method for drop down list by cssSelector locator
	  public void dropdownBycssSelector(String locators, String values){
		   try {
	WebElement dd = driver.findElement(By.cssSelector(locators));
	Select ddSelect = new Select (dd);
	ddSelect.selectByVisibleText(values);
			  }
			  catch(Exception e)
			  {
			System.err.println("issue with :" + e.getMessage());
			  }
		  }
	  
		
	
	
	
	  
 //This method for drop down list BY ID locator
	  public void dropdownByID(String locators, String values){
		  try{
	WebElement dd = driver.findElement(By.id(locators));
	Select ddSelect = new Select(dd);
	ddSelect.deselectByValue(values);
			  }
			  catch(Exception e) 
			  {
				  System.err.println("issue with :" + e.getMessage());
			  }
		  }
		  
		
	
	//This method for radio button  By xPath locators
	public void radioButtonByXpath(String locators,String value){
		List <WebElement> radioButtons = driver.findElements(By.xpath(locators));
		System.out.println("The total radio button on this page is :"+radioButtons.size());
		for(int i =0;i<radioButtons.size();i++) {
			String rvalue = radioButtons.get(i).getText();
			System.out.println(rvalue);
			if(rvalue.equalsIgnoreCase(value)) {
				radioButtons.get(i).click();
			}
		}
	
	
	}

	
	
	
//This method for WEB TABLE
	public void webTable(String locators,String row,String column) {
		try{
	//separate specific area by using WebElement
	WebElement webTable = driver.findElement(By.xpath(locators));
	//then this specific area that is a table and
	//where we stored ROW that is tr  in WebTable by using List where more than one element
	List<WebElement> tableRow = webTable.findElements(By.tagName(row));
	          for(int i=0; i<tableRow.size(); i++)
	          {
	   //Where we stored COLUMN that is td  in WebTable by using List where more than one element
	     List <WebElement> tableColumn = tableRow.get(i).findElements(By.tagName(column));
	     for(int j=0; j<tableColumn.size();j++)
	     {
	    	 String columnValue = tableColumn.get(j).getText();
	    	 System.out.print(columnValue + "   ");
	     }
	     System.out.println();
	     System.out.print("" + "  ");
	          }
		}
		catch(Exception e)
		{
			System.err.println("issue with:" + e.getMessage());
		}
	}
	
	
//This method for CALENDER/DATE PICKER 
	public void datePicker(String locators,String tr,String td, String values){
		try{
			WebElement cale = driver.findElement(By.xpath(locators));
			List<WebElement> dr = cale.findElements(By.tagName(tr));
			   for(int i=0; i<dr.size(); i++){
			List<WebElement> ro = dr.get(i).findElements(By.tagName(td));
			   for(int z=0; z<ro.size(); z++) {
		//System.out.println(ro.get(z).getText());
		String value = ro.get(z).getText();
		if(value.equalsIgnoreCase(values)){
	       ro.get(z).click();
			
			break;    }
			   
			   }
			   
			   }
		}
			   catch(Exception e) {
				   System.err.println("issue with:"  + e.getMessage());
			   }
		}
	
	
//This method for window handle
  public void windowHandler(String locators) {
	  try {
	
	driver.findElement(By.xpath(locators)).click();
	  Set<String> winH = driver.getWindowHandles();
	  Iterator<String> itH =winH.iterator();
	  
	  
	  String mainWin = itH.next();
	  String childWin = itH.next();
	  System.out.println(mainWin +  "  " + childWin);
	  
	  driver.switchTo().window(childWin);
	  System.out.println(driver.getTitle());
	  
	  driver.switchTo().window(mainWin);
	  System.out.println(driver.getTitle());
		  
		   }
	 
	  catch (Exception e)
	  
	  {
		  System.err.println("issue with:"  + e.getMessage());
	  }
  }
	

//This method for THREAD HANDLE
  public void waitByThread(int time) throws InterruptedException{
       Thread.sleep(time);
      
  }
  
  
	
	// Add all the necessary functions for automation your suite. like...
	//1. typeByCSS
	//2. clickByName
	//3. clickById
	//4. clickByCSS
	//5. linkText
	//6. partialLinkText
	//7. tagName
	//8. DropDown
	//9. CkeckBox
	//10. RadioButton
	//11. WebTable
	//12. DragandDrop
	//13. create separate functions for verification
	//14. getText/getTitle/getAttributes
	//...as many as possible
	
	






     }



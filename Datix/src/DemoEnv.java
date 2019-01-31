import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.interactions.Actions;



public class DemoEnv {

	/*
	
	@BeforeSuite
	public 
	
	@BeforeClass 
	public 
	
	@BeforeMethod
	public
	
	@BeforeTest
	public
	
	@Test
	public
	
*/
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		
		
//DODCR-196
		
		
			//envoke Chrome Object Browser 	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipes\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		WebDriverWait wait = new WebDriverWait(driver,10);

		
		SoftAssert assertion = new SoftAssert();   //Verify Text is present on page in a specific area
		
		
		
		
		
		

		
		//envoke InternetExplorer Object Browser 
		//NOTE Find out better way then to copy Class then to envoke ie
//		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Eclipes\\InternetExplorerDriver\\InternetExplorerDriver.exe");
//		WebDriver driver1=new InternetExplorerDriver();
		
			//open url
		driver.get("http://dod.datixweb.co.uk/demo/");
			//verify page title 
		driver.getTitle();
		System.out.println(driver.getTitle());
			//printIn "passing" on page title 
		System.out.println("passs");
		
			//Selecting "Transportation Command Regulated Patient Movement" hyper link. 
		driver.findElement(By.partialLinkText("Regulated Patient Movement")).click();
	
			//verify page Title 
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println("passs");
		
			//verify if landing on correct page - printIn
		System.out.println(driver.getCurrentUrl());
		
			//user interface verify the page source frames
		System.out.println(driver.getPageSource());
			//selecting Back Button
		driver.navigate().back();
			//selecting Forward Button
		driver.navigate().forward();
		
		
		
//DODCR-197	///////////////////////
		
		
		//-------------------------------------------------------------------------------
	
		
		
		/*	
		//select date from Calendar 
		//Event Date Calendar 				ui-state-default
		driver.findElement(By.xpath("//*[@id=\'inc_dincident_row\']/div[2]/img")).click();
		
		List<WebElement> dates= driver.findElement(By.className("ui-state-default"));
		*/
				
		//*[@id'select_user']/tr[1]/td[1]/a    waitForElementPresent			??????
		
		///////////!!!!!!!!!!!!!!!!!!!!!!!!!!!
/*		
		//verify Text is Present 
		public class IsTextPresent
		extends SeleneseCommand<java.lang.Boolean>
		
		boolean isTextPrest=false;
		isTextPrest=driver.findElement(By.xpath("//*[@id='datix-content']/div[1]/div[1]/div/span")).isDisplayed();	
*/	
		
		//////////////////////////////////////
		
			//selecting "PSR Help" button - opens in new tab
//		driver.findElement(By.linkText("PSR Help")).click();
		
		
		////////////////////////////////////////
		
		//		**Event details** -------->>> 
		
			//Has the patient received enroute care in the past 24 hours?  
			//DropDown (Yes/No)
			//Selecting (Yes) in value 
					//note, xPath remove " to ' (double quotes to single quotes)
					//note to verify xPath  $x("//*[@id=\'img_add_UDF_Y_0_195\']") in chrome "Console" 
		driver.findElement(By.xpath("//*[@id=\'img_add_UDF_Y_0_195\']")).click();
		driver.findElement(By.xpath("//*[@id=\'Y\']")).click();
		
			//Event date (MM/dd/yyyy)	
			//Calendar 
					//note to verify CSS selecter  $("#inc_dincident") in chrome "Console"
		driver.findElement(By.cssSelector("#inc_dincident")).sendKeys("12/11/2018");
		
			//Event time (hh:mm) , (24 hour local time)
		driver.findElement(By.id("inc_time")).sendKeys("08:00");
		
			//Discovery Date (mm/dd/yyyy)
			//Calendar 
		driver.findElement(By.cssSelector("#UDF_D_4_2")).sendKeys("12/04/2018");
		
			// Scroll Down page 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
/*			//Scroll Up page
		jse.executeScript("scroll(0, -250);");
*/		
	
	//	Thread.sleep(5000);
		
		
//////////Was the event reported in another system?
		//DropDown (Yes/No)
		//Selecting (Yes) in value 
		
//		driver.findElement(By.xpath("//*[@id='img_add_UDF_Y_0_143']")).click();
//		driver.findElement(By.xpath("/html/body/div[@class='datixSelect']/ul/li[@id='Y']")).submit();
//		driver.findElement(By.xpath("/html/body/div[@class='datixSelect']/ul/li[@id='N']")).click();
//		driver.findElement(By.cssSelector("#Y")).click();
//		driver.findElement(By.xpath("<li class=\"datixSelectOption\" id=\"Y\" onmouseover=\"jQuery('#UDF_Y_0_195_title').activate(this);\" onmouseout=\"jQuery('#UDF_Y_0_195_title').deactivate();\" onmousedown=\"jQuery('#UDF_Y_0_195_title').selectItem(this);\">Yes</li>")).click();
//		driver.findElement(By.tagName("Yes")).click();
//		driver.findElement(By.xpath("//*[@id=\'UDF_Y_0_143_title\']")).sendKeys("Yes");
//		driver.findElement(By.id("//*[@id=\\'UDF_Y_0_143_title\\']")).sendKeys(Keys.RETURN);
//		driver.findElement(By.id("//*[@id=\\'UDF_Y_0_143_title\\']")).sendKeys(Keys.ENTER);
		
//		Actions action = new Actions(driver);
//		action.contextClick(driver.findElement(By.id("//*[@id=\\'UDF_Y_0_143_title\\']"))) 
//		                .sendKeys(Keys.ARROW_DOWN).build()
//						.sendKeys(Keys.TAB).build()     /* one or the other  */
//		                .perform();
		
//		driver.findElement(By.xpath("//*[@id='img_add_UDF_Y_0_143']")).click();		
//		Actions action = new Actions(driver);
//			WebElement btnElement=driver.findElement(By.xpath("//*[@id=\"Y\"]"));
//			action.doubleClick(btnElement).build().perform();	
		
//			Select dp = new Select(driver.findElement(By.id("dp")));
//				dp.selectByVisibleText("Yes");
//				dp.selectByIndex(1);
		

	       //Involved Unit(s) What unit(s) contributed to the event/error/issue?        

		  driver.findElement(By.xpath("//*[@id=\"img_add_UDF_T_0_194\" and @class= \"dropdown_button_image\"]")).click();
	       
	       
	       Actions action = new Actions(driver);
	       Thread.sleep(3000);
	       action.moveToElement(driver.findElement(By.id("0413"))).doubleClick().perform();
	       
	       
	       
	       
	       
		

		

		//Calander discovery date icon select
		driver.findElement(By.xpath("//*[@id=\"UDF_D_4_2\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"UDF_D_4_2_row\"]/div[2]/img")).click();
//		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/button[1]")).click();
		//NOTE, I took out part of the Class name bc of spaces. org is "ui-state-default ui-state-highlight"
		driver.findElement(By.className("ui-state-highlight")).click();

		
	
		//Submit Button to not filled out to Alert
		driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.id("button_0")).click();
			
		
		
		/*		
		//Location Comments Spelling ABC BUTTON Click    - works but unable to switch back
		driver.findElement(By.xpath("//*[@id=\"UDF_L_0_157_row\"]/div[2]/img")).click();
		//new page popUp
//		driver.switchTo().window("http://dod.datixweb.co.uk/demo/thirdpartylibs/phpspellcheck/dialog.html?instance=0").close();	
//		driver.switchTo().window("http://dod.datixweb.co.uk/demo/thirdpartylibs/phpspellcheck/dialog.html?instance=0").close();
*/	
		
		
		/*
		
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"Y\"]"));
        System.out.println("options are >>> "   + options.size());
        for(WebElement element : options){                              
            System.out.println(element.getText());
            Thread.sleep(3000);
         if(element.getText().equals("Yes")){
            element.click();	
         }		
        }
		
		
		*/
		
		
		
		
		
	/*	
		
		//Submit Button to not filled out to Alert
		driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.id("button_0")).click();
		
		//Calander discovery date icon select
		driver.findElement(By.xpath("//*[@id=\"UDF_D_4_2\"]")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"UDF_D_4_2_row\"]/div[2]/img")).click();
//		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/button[1]")).click();
		//NOTE, I took out part of the Class name bc of spaces. org is "ui-state-default ui-state-highlight"
		driver.findElement(By.className("ui-state-highlight")).click();
*/
		
		/*		
		//Location Comments Spelling ABC BUTTON Click    - works but unable to switch back
		driver.findElement(By.xpath("//*[@id=\"UDF_L_0_157_row\"]/div[2]/img")).click();
		//new page popUp
//		driver.switchTo().window("http://dod.datixweb.co.uk/demo/thirdpartylibs/phpspellcheck/dialog.html?instance=0").close();	
//		driver.switchTo().window("http://dod.datixweb.co.uk/demo/thirdpartylibs/phpspellcheck/dialog.html?instance=0").close();
*/	
		
		
		//Location Comments Input text check
		driver.findElement(By.xpath("//*[@id=\"UDF_L_0_157\"]")).sendKeys("!@#$%^&*(+|}{PPOIUYTREE~789456123/./clone();");
		
		
		//find text of  "TRANSCOM DEMO SITE (DIF 1)" text
// x	public java.lang.String getText()
// x	driver.getText("");
		
		
//		driver.findElement(By.xpath("//*[@id=\"img_add_UDF_Y_0_143\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"Y\"][@id='Y']")).click();	
		
		
		
		
		
		
		
		
		
		
		
		
/*		
		Thread.sleep(5000);
		

		
		driver.findElement(By.cssSelector("#img_add_UDF_Y_0_143")).click();
		
		List<WebElement> brands = driver.findElements(By.xpath("//*[@id=\"Y\"]"));
		for (int i = 0; i < brands.size(); i++) {
			
		System.out.println(brands.get(i).getText());
		
		}
		
		Actions drpdwn = new Actions(driver);
		driver. findElement(By.cssSelector("#img_add_UDF_Y_0_143")).click();
		Action selectobject = drpdwn.movetoElement(findElements(By.linkText("Yes")).click().build();
		selectobject.perform();
*/		
		/*
		
		List <WebElement> elementCount = driver.findElements(By.xpath("//*[@id=\"Y\"]"));
		System.out.println(elementCount.size());
		
		for(WebElement el : elementCount) {
			
			System.out.println(el.getText());
			el.click();
		}

		*/
		
///////****************FIX CSS Selectors, not validating !!!!!!!
		
		
		
	/*	
		//Was the event reported in another system?
		//DropDown (Yes/No)
		//Selecting (Yes) in value = Trigger Value 
//	x	driver.findElement(By.id("img_add_UDF_Y_0_143")).click();
//	x	driver.findElement(By.xpath("//*[@id=\'img_add_UDF_Y_0_143\']")).click();
//		driver.findElement(By.xpath("//*[@id=\'N\']")).click();
		driver.findElement(By.id("img_add_UDF_Y_0_143")).click();
		driver.findElement(By.xpath("//*[@id=\'N\']")).click();



		String Xpath = "//*[@id=\'img_add_UDF_C_0_149\']" ;
		WebElement element = driver.findElement((By) By.xpath(Xpath));
		
		Select dropdownList = new Select(element);
		if (dropdownList.isMultiple()) 
			dropdownList.selectByVisibleText("Yes");
	
*/		

/*	
		driver.findElement(By.xpath("//*[@id=\'UDF_Y_0_143_row\']/div[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='N']")).click();
	//	driver.findElement(By.id("N")).click();		
*/		
		
/*		
		
			//System
			//DropDown ()
		//Selecting 
		driver.findElement(By.xpath("//*[@id=\'img_add_UDF_C_0_149\']")).click();
		driver.findElement(By.xpath("//*[@id=\'OTH\']")).click();

		*/

		//Mode of Transit
		//driver.findElement(By.xpath("//*[@id=\'img_add_inc_ot_q20\']")).click();
		//driver.findElement(By.xpath("//*[@id=\'AERO\']")).click();
		
		
		
		
		//////////////////////////////////////////		
		
		
		//Mission ID	input data field
		driver.findElement(By.id("UDF_S_0_147")).sendKeys("N/A");
		
		//Location Comments
		driver.findElement(By.id("UDF_L_0_157")).sendKeys("Min / Max Charictores HEREeeeeeeeeeeeeeeeee");
		
		//Event description
		driver.findElement(By.id("inc_notes")).sendKeys("Min / Max Charictores HEREeeeeeeeeeeeeeeeee");
	
		//Immediate action taken
		driver.findElement(By.id("inc_actiontaken")).sendKeys("Min / Max Charictores HEREeeeeeeeeeeeeeeeee");
	
		//Reporter's Recommendations
		driver.findElement(By.id("UDF_L_2_1")).sendKeys("Min / Max Charictores HEREeeeeeeeeeeeeeeeee");
	
		
	//////

		
        //Verify Text is present 
//?????????		assertTrue(isTextPresent("TRANSCOM DEMO SITE (DIF 1)"));
/*		
		@Test
		public void reporter()
		{
			System.out.println("annotation");
			
		}
*/
		
/*		//Verify Text is present on page but not specific area
		WebElement wholeBodyText = driver.findElement(By.tagName("body"));

		if(wholeBodyText.getText().contains("Eventdate")){

		System.out.println("Found it");

		}else{

		System.out.println("Not found");

		}
*/		

		
	//	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"UDF_C_0_155_row\"]/div[1]/label"), "Destination Facility"));

		
		
		
		
				
//limit of characters of a textbox
//		driver.findElement(By.xpath("//*[@id=\"UDF_L_0_157\"]")).sendKeys("Text_Charicter_CountText_Charicter_CountText_Charicter_Count");//input should be greater than 30 chars
//		int actualLimit = driver.findElement(By.xpath("//*[@id=\"UDF_L_0_157\"]")).getText().length();
//		assertEquals(actualLimit, 30);
		
	//	System.out.println(actualLimit);
		
//limit of characters of a textbox
//        String inputfieldlength = driver.findElement(By.xpath("//*[@id=\"inc_ot_q5\"]")).getAttribute("maxlength");
//        System.out.println("Last name's max length is - " +inputfieldlength);
		
//limit of characters of a textbox	
//        driver.findElement(By.xpath("//*[@id=\"inc_ot_q5\"]")).sendKeys("abcdefghijklmnop");
//        String ele = driver.findElement(By.xpath("//*[@id=\"inc_ot_q5\"]")).getAttribute("maxlength");
//        System.out.println(ele);
		
	
		/*
//check if mandatory field whether it is empty or not
		assertTrue(isTextPresent("You must enter a value in this field"), "Msg is absent/wrong/misspelled");
		
		{
		boolean isTextPresent(String text){
	        try{
	            boolean b = driver.getPageSource().contains(text);
	            return b;
	        }
	        catch(Exception e){
	            return false;
	        }
	  }
		
		}
		
		*/
		
		
		
		
////////Verify Text is present on page in a specific area
		
		VerifyDisplayedText(driver, assertion, "//*[@id=\"datix-content\"]/div[1]/div[1]/div/font/font/b", "Reporting is anonymous unless reporter detail is completed");
		
		VerifyDisplayedText(driver, assertion, "//*[@id=\"inc_ot_q20_row\"]/div[1]/label", "Mode of Transit If the patient was in transit, please select a mode of transportation from the list.");
	//Event description text is present
		VerifyDisplayedText(driver, assertion, "//*[@id=\"inc_notes_row\"]/div[1]/label", "Event description  You must enter a value in this field Enter facts, not opinions. Do NOT enter names of people or other identifying information.");
		
		VerifyDisplayedText(driver, assertion, "//*[@id=\"inc_actiontaken_row\"]/div[1]/label", "Immediate action taken You must enter a value in this field What actions were taken to prevent patient harm or lessen the impact?");
		
		
	
	}
	
        private static boolean isTextPresent(String string) {
		// TODO Auto-generated method stub
		return false;
	}

		private static void VerifyDisplayedText(WebDriver driver, SoftAssert assertion, String WeblementXpath, String actualText) {
            WebElement element = driver.findElement(By.xpath(WeblementXpath));
            String expectedText = element.getText();
            System.out.println("Text suppose to be :" + expectedText.replaceAll("\\s", " "));

            String assertionError = "Text Matched";
         try {
            assertion.assertEquals(actualText, expectedText.replaceAll("\\s", " "));
            assertion.assertAll();   
         }
         catch (AssertionError e) 
            {
              assertionError = e.toString();
            }
            System.out.println(assertionError);
        }

		
		
		
		
	
		

//		Thread.sleep(4000L);		
		//driver.manage().window().maximize();
		
		//close current child windows
//		driver.close();
		//closes all windows
//		driver.quit();

//		driver.switchto().window		
		


	}









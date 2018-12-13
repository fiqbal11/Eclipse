import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoEnv {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//DODCR-197	
		
			//envoke Chrome Object Browser 	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipes\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		
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
		
		//-------------------------------------------------------------------------------
	/*	
		//select date from Calendar 
		//Event Date Calendar 				ui-state-default
		driver.findElement(By.xpath("//*[@id=\'inc_dincident_row\']/div[2]/img")).click();
		
		List<WebElement> dates= driver.findElement(By.className("ui-state-default"));
		*/
		
		
		
		
		
		
		
		
		
		
		
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
		
		/*
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
	
		
		

//		Thread.sleep(4000L);		
		driver.manage().window().maximize();
		
		//close current child windows
//		driver.close();
		//closes all windows
//		driver.quit();

//		driver.switchto().window		
		
*/
}
}
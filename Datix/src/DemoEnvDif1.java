import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoEnvDif1 {

	public static void main(String[] args) throws InterruptedException {
		 // TODO Auto-generated method stub

//DODCR-196	

        
		//Envoke Chrome Object Browser 	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipes\\ChromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Eclipes\\InternetExplorerDriver\\MicrosoftWebDriver.exe");

		// Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new InternetExplorerDriver();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        
//DODCR-196	 
        System.out.println("DODCR-196");     
        
        //Launch URL Sandbox Demo (AWS) Website
        driver.get("http://dod.datixweb.co.uk/demo");
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website ");
        
        //Selecting "Transportation Command Regulated Patient Movement" hyper link.
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/table/tbody/tr[3]/td[2]/a")).click();
                           
        Thread.sleep(6000);
        
//DODCR-197
        System.out.println("DODCR-197");
        
		//Selecting "PSR Help" button - opens in new tab
        //driver.findElement(By.linkText("PSR Help")).click();
        
               //Has the patient received enroute care in the past 24 hours?
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_UDF_Y_0_195\"]", "/html/body/div[6]/ul/li", "Yes");   
               
               //Event date (MM/dd/yyyy)   Help (Event date)
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inc_dincident"))).sendKeys("01/22/2018");
               
               //Event time (hh:mm)
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inc_time"))).sendKeys("02:45");
               //Discovery Date 
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("UDF_D_4_2"))).sendKeys("01/22/2019");
               
               
               
               
               //Was the event reported in another system?
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_UDF_Y_0_143\"]", "/html/body/div[7]/ul/li", "Yes");
               
               //System
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_UDF_C_0_149\"]", "/html/body/div[8]/ul/li", "OTHER");

      //Reported in System not included in picklist          
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'UDF_S_0_146\']"))).sendKeys("N/A");
            
               
               //Mission ID
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("UDF_S_0_147"))).sendKeys("123456");
               
               //Mode of Transit
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_inc_ot_q20\"]", "/html/body/div[9]/ul/li", "AMBULANCE");

                            
               //Originating Facility
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_UDF_C_0_154\"]", "/html/body/div[10]/ul/li", "18TH MED GRP - KADENA AB");
               
               //Destination Facility
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_UDF_C_0_155\"]", "/html/body/div[11]/ul/li", "36TH MED GRP - ANDERSEN");

               //Location Comments
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("UDF_L_0_157"))).sendKeys("This IS Test");
               
               //Location Type
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_UDF_C_0_62\"]", "/html/body/div[12]/ul/li", "Ancillary (non-direct care) area");
               
    //Involved Unit(s) What unit(s) contributed to the event/error/issue?
    // DropDownValueSelectMethod(driver, "//*[@id=\"img_add_UDF_T_0_194\"]", "/html/body/div[18]/ul/li/", "14TH MED GRP - COLUMBUS");
    //driver.findElement(By.id("//*[@id=\"img_add_UDF_T_0_194\"]/following-sibling::[6]")).click();
               
       //Involved Unit(s) What unit(s) contributed to the event/error/issue?        
       //DropDownValueSelectMethod(driver, "//*[@id=\"img_add_UDF_T_0_194\"]", "/html/body/div[21]/ul/li", "11 MDS - BOLLING");
       
               driver.findElement(By.xpath("//*[@id=\"img_add_UDF_T_0_194\" and @class= \"dropdown_button_image\"]")).click();
    	       
    	   
    	       Actions action = new Actions(driver);
    	       Thread.sleep(3000);
    	       action.moveToElement(driver.findElement(By.id("0413"))).doubleClick().perform();
    	       
       

               
               //Event description
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inc_notes"))).sendKeys("This IS Test");
               
               //Immediate action taken
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inc_actiontaken"))).sendKeys("This IS Test");
               
               //Reporter's Recommendations
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("UDF_L_2_1"))).sendKeys("This IS Test");

               
               
               
               
               
               
               /*Section  - Required Information */
               
               //Degree of harm
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("img_add_inc_severity"))).click();
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("MLDH"))).click();
               
               //Other personnel with information about the event (Include first name, last name, rank, telephone number & email address)
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inc_ot_q5"))).sendKeys("This IS Test");
               
                //Was this a medication event?
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_show_medication\"]", "/html/body/div[15]/ul/li", "No");
               
               //Was equipment/materiel involved?
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_show_equipment\"]", "/html/body/div[16]/ul/li", "No");
               
               //Was a patient involved?
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_show_person\"]", "/html/body/div[17]/ul/li", "Yes");
               
               
               Thread.sleep(3000);
               

               /* Patient Information -> Patient Involved  */
/*           
               //Last Name        
               driver.findElement(By.xpath("//*[@id=\"con_surname_6_row\"]/div[2]")).sendKeys("TestPatientFaroooq");
               //First Name
               driver.findElement(By.xpath("//*[@id=\"con_forenames_6\"]")).sendKeys("TestPatient");
*/
	//Last Name 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("con_surname_6"))).sendKeys("TestPatientLastFaroooq");
	//First Name
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("con_forenames_6"))).sendKeys("TestPatientFirst");
	//Patient cite number
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("UDF_S_0_161_6"))).sendKeys("Ab!2@123456789");

               //Gender
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_con_gender_6\"]", "/html/body/div[18]/ul/li", "Unknown");      
               
	//Date of birth (MM/dd/yyyy) 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("con_dob_6"))).sendKeys("01/22/1985");

	//Age (years) 
	//MISSINGGG*********************//////////
               
	//Status [for Patient]
    DropDownValueSelectMethod(driver, "//*[@id=\"img_add_con_type_6\"]", "/html/body/div[19]/ul/li", "Contractor");      
 
	//Unit of assignment
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"UDF_L_0_162_6\"]"))).sendKeys("This IS Test");
    
    //Diagnosis
    
               
               /* Reporter  */
               
               //Last Name      //*[@id="con_surname_6_row"]/div[2]
               driver.findElement(By.xpath("//*[@id=\"con_surname_3\"]")).sendKeys("TestFarooq");
               
               //First Name
               driver.findElement(By.xpath("//*[@id=\"con_forenames_3\"]")).sendKeys("Test");
               
               
               //Status
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_con_type_3\"]", "/html/body/div[20]/ul/li", "Civilian");        

               
               //Status detail
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_con_subtype_3\"]", "/html/body/div[21]/ul/li", "Pharmacy Technician");        

         
           /*    
               //Status
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_con_type_3\"]", "/html/body/div[17]/ul/li", "Civilian");                   
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_con_subtype_3\"]", "/html/body/div[18]/ul/li", "Dentist");
            */
                             
           }

   private static void DropDownValueSelectMethod(WebDriver driver, String ddButtonXpath, String ChoiceVauesXpath, String SelectChoiceValue) throws InterruptedException {    
       WebElement dropDown = driver.findElement(By.xpath(ddButtonXpath));
       dropDown.click();    
       
       Thread.sleep(3000);
       
       List<WebElement> options = dropDown.findElements(By.xpath(ChoiceVauesXpath));
       System.out.println("options are >>> "   + options.size());
       for(WebElement element : options){

            System.out.println("Values " + element.getAttribute("innerHTML"));
        if(element.getText().equals(SelectChoiceValue)){
           element.click();
       }
        
       }
   }

}

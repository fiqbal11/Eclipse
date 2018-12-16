import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoEnvDif1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipes\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Eclipes\\InternetExplorerDriver\\MicrosoftWebDriver.exe");

		 // Create a new instance of the Chrome driver
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new InternetExplorerDriver();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        
               //Launch the Online Store Website
        driver.get("http://dod.datixweb.co.uk/demo");
        
               // Print a Log In message to the screen
               System.out.println("Successfully opened the website ");
               
               driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/table/tbody/tr[3]/td[2]/a")).click();
                           
               Thread.sleep(6000);
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
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_show_medication\"]", "/html/body/div[14]/ul/li", "No");
               
               //Was equipment/materiel involved?
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_show_equipment\"]", "/html/body/div[15]/ul/li", "No");
               
               //Was a patient involved?
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_show_person\"]", "/html/body/div[16]/ul/li", "Yes");
               
               
               Thread.sleep(3000);
               
               //Gender
               DropDownValueSelectMethod(driver, "//*[@id=\"img_add_con_gender_6\"]", "/html/body/div[17]/ul/li", "Unknown");

               
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

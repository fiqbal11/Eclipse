import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class CopyDemoEnv {


	
	
public static void main(String[] args) throws InterruptedException {
        
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipes\\ChromeDriver\\chromedriver.exe");
	         
         // Create a new instance of the Chrome driver
         WebDriver driver = new ChromeDriver();
         
                //Launch the Online Store Website
         driver.get("http://dod.datixweb.co.uk/demo");
         
                // Print a Log In message to the screen
                System.out.println("Successfully opened the website ");
                
                driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/table/tbody/tr[3]/td[2]/a")).click();
                
                Thread.sleep(3000);
                
                driver.findElement(By.xpath("//*[@id=\"img_add_UDF_Y_0_143\"]")).click();
          /*   
                List<WebElement> allOptions = driver.findElements(By.xpath("/html/body/div[6]/ul"));

                java.util.Iterator<WebElement> i = allOptions.iterator();
                while(i.hasNext()) {
                    WebElement ele = i.next();
                    if (ele.getText().equals("No")) {
                        ele.click();
                    // do something in else perhaps
                    }
                }
                */
                
                
        		////////////////////////////////////////
        		
        		//		**Event details** -------->>> 
        		
        		//Has the patient received enroute care in the past 24 hours?  
        		//DropDown (Yes/No)
        		//Selecting (Yes) in value 
        					//note, xPath remove " to ' (double quotes to single quotes)
        					//note to verify xPath  $x("//*[@id=\'img_add_UDF_Y_0_195\']") in chrome "Console" 
        		

                
                List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"Y\"]"));
                System.out.println("options are >>> "   + options.size());
                for(WebElement element : options){
                                        
                    System.out.println(element.getText());
                    Thread.sleep(3000);
                 if(element.getText().equals("Yes")){
                    element.click();
                }                 
                }     
            
}

}

	
	
	
	
	


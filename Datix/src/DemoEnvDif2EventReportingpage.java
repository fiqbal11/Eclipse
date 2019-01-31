import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class DemoEnvDif2EventReportingpage {
	//DataDrivenTest
	 WebDriver driver;
	 XSSFWorkbook workbook;
	 XSSFSheet sheet;
	 XSSFCell cell;
	
    @BeforeTest
	public void initialization(){
        // To set the path of the Chrome driver.
		//Envoke Chrome Object Browser 	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipes\\ChromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Eclipes\\InternetExplorerDriver\\MicrosoftWebDriver.exe");

		// Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new InternetExplorerDriver();

   //     WebDriverWait wait = new WebDriverWait(driver, 15);

        
        //Launch URL Sandbox Demo (AWS) Website
        driver.get("http://dod.datixweb.co.uk/demo");
        // To maximize the browser
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
      //Launch URL Sandbox Demo (AWS) Website
        driver.get("http://dod.datixweb.co.uk/demo");
        
}
        
    @Test
    public void DemoLogInLogOut() throws IOException{
    	// Import excel sheet.
    	 File src=new File("C:\\Users\\FarooqIqbal\\Desktop\\.xlsx");   
    	 // Load the file.
    	 FileInputStream fis = new FileInputStream(src);
    	 // Load the workbook.
    	 workbook = new XSSFWorkbook(fis);
    	 // Load the sheet in which data is stored.
    	 sheet= workbook.getSheetAt(0);
    	 for(int i=1; i<=sheet.getLastRowNum(); i++){
    
    
    
 /*
       // @Test(priority=1)
//DODCR-196	 
        System.out.println("DODCR-196");     
        
        //Launch URL Sandbox Demo (AWS) Website
        driver.get("http://dod.datixweb.co.uk/demo");
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website ");
        
        //Selecting "Transportation Command Regulated Patient Movement" hyper link.
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/table/tbody/tr[3]/td[2]/a")).click();
        System.out.println("Selected TRASNCOM Logo");         
        Thread.sleep(6000);
        
        //click login TNB module 
        driver.findElement(By.xpath("//*[@id=\"sub-menu\"]/ul/li[2]/a")).click();
        
        //login
        driver.findElement(By.id("name")).sendKeys("Farooq");
        driver.findElement(By.name("passwrd")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/table/tbody/tr/td/table/tbody/tr[4]/td/input")).click();
        
        //enter
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
        
////////Search 
        //click search LNB
        driver.findElement(By.xpath("//*[@id=\"landing-page\"]/div[1]/div[1]/ul/li[4]/div/a")).click();   
		driver.getTitle();
		System.out.println(driver.getTitle());
        System.out.println("I am awesome");
        
  //////----?????   Pull form repository    the PSR# nd all TRUE conditions. Maybe from an excell
        
        
        
        */
        
        
        
    	 }
       }

